package co.istad.lily.a01a1webmvc.dto;

import jakarta.validation.constraints.*;

import java.math.BigDecimal;

public record CreateProductRequest (
        @NotBlank
        @Size(min = 1, max = 50)
        String name,

        @NotNull
        @Positive
        @Max(10000)
        BigDecimal price,

        @NotNull
        @Positive
        Integer categoryId
) {
}
