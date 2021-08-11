package ru.honorzor.gym.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Response {
    private boolean isSuccess;
    private Object data;

    public static Response success(Object data) {
        return Response.builder()
                .isSuccess(true)
                .data(data)
                .build();
    }

    public static Response fail(String message) {
        return Response.builder()
                .data(message)
                .isSuccess(false)
                .build();
    }
}
