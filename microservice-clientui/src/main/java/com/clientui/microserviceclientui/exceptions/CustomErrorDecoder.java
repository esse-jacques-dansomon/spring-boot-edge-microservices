package com.clientui.microserviceclientui.exceptions;

import feign.Response;
import feign.codec.ErrorDecoder;

/**
 * Created by essejacques.co
 * Date:  23/02/2023 22:28
 * Projet: spring-micro-services-ecom-openclassroom
 */
public class CustomErrorDecoder implements ErrorDecoder {
    private final ErrorDecoder defaultErrorDecoder = new Default();
    /**
     * @param s
     * @param response
     * @return
     */
    @Override
    public Exception decode(String s, Response response) {
        if (response.status() == 400) {
            return new ProductBadRequestException("Requête incorrecte");
        }
        return defaultErrorDecoder.decode(s, response);
    }
}
