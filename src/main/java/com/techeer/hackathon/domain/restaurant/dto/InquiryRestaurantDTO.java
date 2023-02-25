package com.techeer.hackathon.domain.restaurant.dto;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class InquiryRestaurantDTO {
    private Long id;
    private String name;
    private String category;
}