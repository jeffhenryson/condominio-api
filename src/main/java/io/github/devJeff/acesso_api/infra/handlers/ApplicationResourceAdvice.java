package io.github.devJeff.acesso_api.infra.handlers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import io.github.devJeff.acesso_api.core.exceptions.BusinessException;

@RestControllerAdvice
public class ApplicationResourceAdvice {
    
    @ExceptionHandler(BusinessException.class)
    @ResponseStatus(HttpStatus.PRECONDITION_FAILED)
    public ApiError handleBusinessException(BusinessException ex){
        return new ApiError(ex.getMessage());
    }

}
