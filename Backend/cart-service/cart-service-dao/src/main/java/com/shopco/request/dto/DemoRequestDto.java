package com.shopco.request.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DemoRequestDto {
//    @NotBlank(message = "House name or number is required")
//    @JsonProperty("house_name_or_number")
//    private String houseNameOrNumber;
//
//    @NotBlank(message = "Address line 1 is required")
//    @JsonProperty("line1")
//    private String line1;
}
