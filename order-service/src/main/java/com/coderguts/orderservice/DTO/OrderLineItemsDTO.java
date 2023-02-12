package com.coderguts.orderservice.DTO;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderLineItemsDTO {

    private Long id;
    private String skuCode;
    private BigDecimal price;
    private Integer quantity;
}
