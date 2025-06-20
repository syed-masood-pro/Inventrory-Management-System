package com.project.report_service.dto; // Changed package to com.project.report_service.dto for consistency

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data // Lombok annotation for Getters, Setters, toString, equals, hashCode
@NoArgsConstructor // Lombok annotation for no-arg constructor
@AllArgsConstructor // Lombok annotation for all-arg constructor
public class OrderReportDto {
    private Long totalOrders;
    private Long pendingOrders;
    private Long shippedOrders;
    private Long deliveredOrders;
    private Double totalRevenue;
    private List<TopSellingProductDto> topSellingProducts; // Use the nested DTO type

    // Nested static class for top-selling product details
    @Data // Lombok for nested DTO
    @NoArgsConstructor
    @AllArgsConstructor
    public static class TopSellingProductDto {
        private String productName;
        private Long unitsSold;
        private Double totalRevenue;
    }

    // Constructors and Getters/Setters generated by Lombok
}
