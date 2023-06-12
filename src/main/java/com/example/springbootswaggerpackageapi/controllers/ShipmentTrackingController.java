package com.example.springbootswaggerpackageapi.controllers;

import com.example.springbootswaggerpackageapi.ShipmentTracking;
import com.example.springbootswaggerpackageapi.ShipmentTrackingApi;
import com.example.springbootswaggerpackageapi.services.ShipmentTrackingService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class ShipmentTrackingController implements ShipmentTrackingApi {

    private final ShipmentTrackingService shipmentTrackingService;



    @GetMapping
    @Override
    public ResponseEntity<List<ShipmentTracking>> getShipmentTracking(
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
        return ResponseEntity.ok(shipmentTrackingService.getShipmentTracking(xRequestId, xRequestTrackingId, xRequestSessionId, xRequestCustomerSegment, customerId, fields, orderId, page, query, size, sort, status, accept, date, xServerAuthentication, xRealIP, xClientVersion, xClientId, xOriginatorId));
    }

    @Override
    public ResponseEntity<ShipmentTracking> getShipmentTrackingByTrackingId(
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
        return ResponseEntity.ok(shipmentTrackingService.getShipmentTrackingByTrackingId(id, xRequestTrackingId, xRequestId, xRequestSessionId, fields, accept, date, xServerAuthentication, xRealIP, xClientVersion, xClientId, xOriginatorId));
    }

    @Override
    public ResponseEntity<ShipmentTracking> patchShipmentTrackingUsingPATCH(
            ShipmentTracking shipmentTracking,
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
        return ResponseEntity.ok(shipmentTrackingService.patchShipmentTracking(shipmentTracking, fields, id, xRequestTrackingId, xRequestId, xRequestSessionId, accept, contentLength, date, xServerAuthentication, xRealIP, xClientVersion, xClientId, xOriginatorId));
    }

        @Override
        public ResponseEntity<ShipmentTracking> postShipmentTracking(
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
            return ResponseEntity.ok(shipmentTrackingService.postShipmentTracking(body, xRequestTrackingId, xRequestId, xRequestSessionId, accept, contentLength, date, xServerAuthentication, xRealIP, xClientVersion, xClientId, xOriginatorId));
        }

}

