package com.example.sample.order.mapper;

import com.example.sample.order.dto.OrderPostDto;
import com.example.sample.order.dto.OrderResponseDto;
import com.example.sample.order.entity.Order;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-14T00:25:00+0900",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.17 (Azul Systems, Inc.)"
)
@Component
public class OrderMapperImpl implements OrderMapper {

    @Override
    public Order OrderPostDtoToOrder(OrderPostDto orderPostDto) {
        if ( orderPostDto == null ) {
            return null;
        }

        long coffeeId = 0L;

        coffeeId = orderPostDto.getCoffeeId();

        Long orderId = null;

        Order order = new Order( orderId, coffeeId );

        return order;
    }

    @Override
    public OrderResponseDto OrderToOrderResponseDto(Order order) {
        if ( order == null ) {
            return null;
        }

        long coffeeId = 0L;

        coffeeId = order.getCoffeeId();

        long memberId = 0L;

        OrderResponseDto orderResponseDto = new OrderResponseDto( memberId, coffeeId );

        return orderResponseDto;
    }
}
