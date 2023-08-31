package com.bookstack.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.bookstack.dto.MyOrderResponse;
import com.bookstack.dto.UpdateDeliveryStatusRequest;
import com.fasterxml.jackson.core.JsonProcessingException;

public interface OrderService {

	ResponseEntity<?> customerOrder(int userId) throws JsonProcessingException;

	ResponseEntity<List<MyOrderResponse>> getMyOrders(int userId);

	ResponseEntity<List<MyOrderResponse>> getAllOrders();
	
	ResponseEntity<List<MyOrderResponse>> getOrdersByOrderId(String orderId);
	
	ResponseEntity<List<MyOrderResponse>> updateOrderDeliveryStatus(UpdateDeliveryStatusRequest deliveryRequest);
	
	ResponseEntity<List<MyOrderResponse>> assignDeliveryPersonForOrder(UpdateDeliveryStatusRequest deliveryRequest);
	
	ResponseEntity<List<MyOrderResponse>> getMyDeliveryOrders(int deliveryPersonId);
}