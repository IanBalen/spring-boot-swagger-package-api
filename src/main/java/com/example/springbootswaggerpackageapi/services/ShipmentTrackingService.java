package com.example.springbootswaggerpackageapi.services;

import com.example.springbootswaggerpackageapi.ShipmentTracking;
import com.example.springbootswaggerpackageapi.domain.ShipmentTrackingEntity;
import com.example.springbootswaggerpackageapi.repositories.ShipmentTrackingRepository;
import com.example.springbootswaggerpackageapi.services.mapper.ShipmentTrackingMapperConfig;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class ShipmentTrackingService {

    private final ShipmentTrackingRepository shipmentTrackingRepository;
    private final ModelMapper modelMapper;



    //U ovoj metodi se dobiva po meni puno nepotrebnih parametar pošto metoda
    // bi trebalo vratiti po id-u jedan objekt
    // Koristio sam fields jer u Swagger specifikaciji kaze da treba vratiti samo sto je u fields
    // fields sam pretvorio u listu čisto da mogu iterirati po njemu jer nije specificirano kako izgledaju
    // parametri u fields
    @SneakyThrows
    public ShipmentTracking getShipmentTrackingByTrackingId(
            String id,
            String xRequestTrackingId,
            String xRequestId,
            String xRequestSessionId,
            String fields,
            String accept,
            String date,
            String xServerAuthentication,
            String xRealIP,
            String xClientVersion,
            String xClientId,
            String xOriginatorId) {

        ShipmentTrackingEntity ste = shipmentTrackingRepository.findById(Long.valueOf(id))
                .orElseThrow(() -> new Error("ShipmentTracking not found"));

        ShipmentTrackingEntity shipmentTrackingEntity = new ShipmentTrackingEntity();

        List<String> fieldsList = List.of(fields.split(","));

        for(String field : fieldsList){
            Field f = shipmentTrackingEntity.getClass().getDeclaredField(field);
            f.setAccessible(true);
            f.set(shipmentTrackingEntity, f.get(ste));
        }

        return modelMapper.map(shipmentTrackingEntity, ShipmentTracking.class);


    }

    @SneakyThrows
    public ShipmentTracking patchShipmentTracking(
            ShipmentTracking body,
            String fields,
            String id,
            String xRequestTrackingId,
            String xRequestId,
            String xRequestSessionId,
            String accept,
            Integer contentLength,
            String date,
            String xServerAuthentication,
            String xRealIP,
            String xClientVersion,
            String xClientId,
            String xOriginatorId) {

        ShipmentTrackingEntity ste = shipmentTrackingRepository.findById(Long.valueOf(id))
                .orElseThrow(() -> new Error("ShipmentTracking not found"));

        List<String> fieldsToUpdate = List.of(fields.split(","));

        for (String field : fieldsToUpdate) {
                java.lang.reflect.Field STEField = ShipmentTrackingEntity.class.getDeclaredField(field);
                java.lang.reflect.Field SEField = ShipmentTracking.class.getDeclaredField(field);

                STEField.setAccessible(true);
                SEField.setAccessible(true);

                Object value = SEField.get(body);
                STEField.set(ste, value);

        }

        return modelMapper.map(ste, ShipmentTracking.class);

    }

    public ShipmentTracking postShipmentTracking(
            ShipmentTracking body,
            String xRequestTrackingId,
            String xRequestId,
            String xRequestSessionId,
            String accept,
            Integer contentLength,
            String date,
            String xServerAuthentication,
            String xRealIP,
            String xClientVersion,
            String xClientId,
            String xOriginatorId) {

        ShipmentTrackingEntity ste = modelMapper.map(body, ShipmentTrackingEntity.class);
        shipmentTrackingRepository.save(ste);

        return modelMapper.map(ste, ShipmentTracking.class);
    }

    public List<ShipmentTracking> getShipmentTracking(
            String xRequestId,
            String xRequestTrackingId,
            String xRequestSessionId,
            String xRequestCustomerSegment,
            String customerId,
            String fields,
            String orderId,
            String page,
            String query,
            String size,
            String sort,
            String status,
            String accept,
            String date,
            String xServerAuthentication,
            String xRealIP,
            String xClientVersion,
            String xClientId,
            String xOriginatorId) {

        List<ShipmentTrackingEntity> steList = shipmentTrackingRepository.findAll();
        List<ShipmentTracking> shipmentTrackings = new ArrayList<>();

        for(ShipmentTrackingEntity ste : steList){
            shipmentTrackings.add(modelMapper.map(ste, ShipmentTracking.class));
        }

        return shipmentTrackings;
    }

}
