package com.clientui.microserviceclientui.proxies;

import com.clientui.microserviceclientui.beans.ProductBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "microservice-produits", url = "localhost:9004")
public interface MicroserviceProduitsProxy {

    @GetMapping(value = "/Produits")
    List<ProductBean> listeDesProduits();

    /*
    * Notez ici la notation @PathVariable("id") qui est différente de celle qu'on utlise dans le contrôleur
    **/
    @GetMapping( value = "/Produits/{id}")
    ProductBean recupererUnProduit(@PathVariable("id") int id);



}
