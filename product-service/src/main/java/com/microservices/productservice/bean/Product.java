package com.microservices.productservice.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import lombok.*;
import org.springframework.data.annotation.Id;
import java.math.BigDecimal;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class Product {

    @Getter
    @Setter
    @jakarta.persistence.Id
    @GeneratedValue
    @Id
    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
}
