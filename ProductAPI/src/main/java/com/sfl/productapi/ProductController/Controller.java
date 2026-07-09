package com.sfl.productapi.ProductController;

import com.sfl.productapi.ProductEntity.Product;
import com.sfl.productapi.ProductService.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    private Service service;

    @GetMapping("/")
    public String home(){
        return "Welcome to Products API";
    }
    @GetMapping("/api/v1/products")
    public List<Product> getAll(){
        return service.getAll();
    }
    @PostMapping("/api/v1/products")
    public Product createProduct(@RequestBody Product product){
        return service.createProduct(product);
    }
    @GetMapping("/api/v1/products/{id}")
    public Product getId(@PathVariable int id){
        return service.getId(id);
    }
    @PutMapping("/api/v1/products/{id}")
    public Product update(@PathVariable int id,@RequestBody Product product){
        return service.update(id,product);
    }
    @DeleteMapping("/api/v1/products/{id}")
    public String delete(@PathVariable int id){
        return service.delete(id);
    }
    
}
