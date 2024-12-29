package com.shopco.paymentservice.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class demoRequest {

    @JsonProperty(value = "demoId")
    @NotNull(message = "demo id is required")
    @ApiModelProperty(required = true, value = "demo id is required")
    private UUID demoId;



}
