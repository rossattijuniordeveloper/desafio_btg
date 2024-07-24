package com.tecnopar.desafio_btg.factory;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;

import com.tecnopar.desafio_btg.controller.dto.OrderResponse;

public class OrderResponseFactory {


    public static Page<OrderResponse> buildWithOneItem() {
        var orderResponse =  new OrderResponse(1L, 2L, BigDecimal.valueOf(20.50));

        return new PageImpl<>(List.of(orderResponse));
    }
}
