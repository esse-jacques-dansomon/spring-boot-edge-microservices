package com.clientui.microserviceclientui.exceptions;

/**
 * Created by essejacques.co
 * Date:  23/02/2023 22:28
 * Projet: spring-micro-services-ecom-openclassroom
 */
public class ProductBadRequestException extends RuntimeException{

    public ProductBadRequestException(String message) {

        super(message);

    }

}
