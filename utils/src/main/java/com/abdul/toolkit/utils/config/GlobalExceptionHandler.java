package com.abdul.toolkit.utils.config;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.authentication.AuthenticationCredentialsNotFoundException;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(AccessDeniedException.class)
    public ResponseEntity<Object> handleAccessDenied(AccessDeniedException ex) {
        return new ResponseEntity<>(errorResponse("Access Denied", 403), HttpStatus.FORBIDDEN);
    }

    @ExceptionHandler(AuthenticationCredentialsNotFoundException.class)
    public ResponseEntity<Object> handleUnauthorized(AuthenticationCredentialsNotFoundException ex) {
        return new ResponseEntity<>(errorResponse("Unauthorized", 401), HttpStatus.UNAUTHORIZED);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Object> handleAll(Exception ex) {
        return new ResponseEntity<>(errorResponse("Internal Server Error", 500), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(BadCredentialsException.class)
    public ResponseEntity<Object> handleBadCredentials(BadCredentialsException ex) {
        return new ResponseEntity<>(errorResponse("Invalid username or password", 401), HttpStatus.UNAUTHORIZED);
    }

    private Map<String, Object> errorResponse(String message, int status) {
        return Map.of(
                "timestamp", LocalDateTime.now(),
                "status", status,
                "error", message
        );
    }
}
