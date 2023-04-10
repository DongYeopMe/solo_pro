package com.example.sample.order.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class OrderPatchDto {
    private Long orderId;
    private Long memberId;
}
