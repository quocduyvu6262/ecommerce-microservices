package com.microservices.orderservice.service;

import com.microservices.orderservice.bean.Order;
import com.microservices.orderservice.bean.OrderLineItems;
import com.microservices.orderservice.dto.OrderLineItemsRequest;
import com.microservices.orderservice.dto.OrderRequest;
import com.microservices.orderservice.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;
    public void placeOrder(OrderRequest orderRequest){
        Order order = new Order();
        order.setOrderNumber(UUID.randomUUID().toString());

        List<OrderLineItems> orderLineItemsList = orderRequest.getOrderLineItemsRequestList().stream().map(this::mapToOrderLineItems)
                .toList();
        order.setOrderlineItemsList(orderLineItemsList);

        orderRepository.save(order);
    }

    private OrderLineItems mapToOrderLineItems(OrderLineItemsRequest orderLineItemsRequest) {
        OrderLineItems orderLineItems = new OrderLineItems();
        orderLineItems.setPrice(orderLineItemsRequest.getPrice());
        orderLineItems.setQuantity(orderLineItemsRequest.getQuantity());
        orderLineItems.setSkuCode(orderLineItemsRequest.getSkuCode());
        return orderLineItems;
    }
}
