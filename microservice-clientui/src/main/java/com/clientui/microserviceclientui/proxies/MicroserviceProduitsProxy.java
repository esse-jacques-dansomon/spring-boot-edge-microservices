package com.clientui.microserviceclientui.proxies;

import com.clientui.microserviceclientui.beans.ProductBean;
import com.clientui.microserviceclientui.configuration.CustomLoadBalancerConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "gateway-server")
public interface MicroserviceProduitsProxy {

    @GetMapping(value = "/produits/")
    List<ProductBean> listeDesProduits();

    /*
    * Notez ici la notation @PathVariable("id") qui est différente de celle qu'on utlise dans le contrôleur
    **/
    @GetMapping( value = "/produits/{id}")
    ProductBean recupererUnProduit(@PathVariable("id") int id);



}