package com.clientui.microserviceclientui.proxies;

import com.clientui.microserviceclientui.beans.CommandeBean;
import org.springframework.cloud.openfeign.FeignClient;
//import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "microservice-commandes")
//@RibbonClient(name = "microservice-commandes")
public interface MicroserviceCommandeProxy {

    @PostMapping(value = "/commandes")
    CommandeBean ajouterCommande(@RequestBody CommandeBean commande);
}
