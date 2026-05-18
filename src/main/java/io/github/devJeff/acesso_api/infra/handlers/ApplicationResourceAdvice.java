package io.github.devJeff.acesso_api.infra.handlers;

import org.springframework.web.bind.annotation.RestControllerAdvice;

import io.github.devJeff.acesso_api.core.exceptions.BusinessException;

@RestControllerAdvice
public class ApplicationResourceAdvice {
    
    public ApiError handleBusinessException(BusinessException ex){
        return new ApiError(ex.getMessage());
    }

}
