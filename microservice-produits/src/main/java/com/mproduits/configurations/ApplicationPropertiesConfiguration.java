package com.mproduits.configurations;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by essejacques.co
 * Date:  24/02/2023 10:13
 * Projet: spring-micro-services-ecom-openclassroom
 */

@Component
@ConfigurationProperties("mes-configs")
public class ApplicationPropertiesConfiguration {

    private int limitDeProduits;

    public int getLimitDeProduits()
    {
        return limitDeProduits;
    }

    public void setLimitDeProduits(int limitDeProduits)
    {
        this.limitDeProduits = limitDeProduits;
    }

}
