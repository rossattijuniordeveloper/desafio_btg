package com.tecnopar.desafio_btg.controller.dto;

import java.math.BigDecimal;

import com.tecnopar.desafio_btg.entity.OrderEntity;

public record OrderResponse(Long orderId,
                            Long customerId,
                            BigDecimal total) {

    public static OrderResponse fromEntity(OrderEntity entity) {
        return new OrderResponse(entity.getOrderId(), entity.getCustomerId(), entity.getTotal());
    }
}
