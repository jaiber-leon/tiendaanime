package com.example.tiendaanime.excepcions;

public class ResourceNotFound extends RuntimeException{
    public ResourceNotFound (String message){
        super(message);
    }
}
