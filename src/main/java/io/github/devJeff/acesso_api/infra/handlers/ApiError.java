package io.github.devJeff.acesso_api.infra.handlers;

public class ApiError {

    private String message;

    public ApiError(String message){
        this.message = message;
    }
    
    public String getName(){
        return message;
    }
}
