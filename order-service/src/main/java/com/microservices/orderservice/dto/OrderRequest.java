package com.microservices.orderservice.dto;


import com.microservices.orderservice.bean.OrderLineItems;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class OrderRequest {
    private List<OrderLineItemsRequest> orderLineItemsRequestList;
}
