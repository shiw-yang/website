package whpuaa.website.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import whpuaa.website.controller.model.HttpCommonErrorResponse;

@ControllerAdvice("whpuaa.website.controller")
public class CommonControllerAdvice {
    @ExceptionHandler
    ResponseEntity<HttpCommonErrorResponse> handleInvalidModelException(InvalidModelException e) {
        return ResponseEntity.ok(new HttpCommonErrorResponse(100000, e.getMessage()));
    }
}
