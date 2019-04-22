package com.soukiyaki.GameON.common.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class ResponseDto {

    private String status;
    private Integer httpCode;

    public static ResponseDto getHttpResponse(String status, int httpCode) {
        return ResponseDto.builder()
                .status(status)
                .httpCode(httpCode)
                .build();
    }
}
