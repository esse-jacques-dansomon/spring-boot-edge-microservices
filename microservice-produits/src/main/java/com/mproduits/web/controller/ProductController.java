package com.mproduits.web.controller;

import com.mproduits.configurations.ApplicationPropertiesConfiguration;
import com.mproduits.dao.ProductDao;
import com.mproduits.model.Product;
import com.mproduits.web.exceptions.ProductNotFoundException;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/produits")
public class ProductController {

    private ProductDao productDao;
    private ApplicationPropertiesConfiguration appProperties;

    public ProductController(ProductDao productDao, ApplicationPropertiesConfiguration applicationPropertiesConfiguration) {
        this.productDao = productDao;
        this.appProperties = applicationPropertiesConfiguration;
    }

    // Affiche la liste de tous les produits disponibles
    @GetMapping(value = "/")
    public List<Product> listeDesProduits(){

        List<Product> products = productDao.findAll();

        if(products.isEmpty()) throw new ProductNotFoundException("Aucun produit n'est disponible à la vente");

        List<Product> listeLimitee = products.subList(0, appProperties.getLimitDeProduits());
        return listeLimitee;

    }

    //Récuperer un produit par son id
    @GetMapping( value = "/{id}")
    public Optional<Product> recupererUnProduit(@PathVariable int id) {

        Optional<Product> product = productDao.findById(id);

        if(!product.isPresent())  throw new ProductNotFoundException("Le produit correspondant à l'id " + id + " n'existe pas");

        return product;
    }

    @GetMapping( value = "/one")
    public Product recupererUnProduit() {
        Product product = new Product();
        product.setId(1);
        product.setDescription("description");
        product.setImage("image");
        product.setTitre("titre");
        product.setPrix(1.0);
        productDao.save(product);
        return product;
    }

    @PostMapping( value = "/")
    public Product ajouterUnProduit(@RequestBody Product product) {
        productDao.save(product);
        return product;
    }
}

