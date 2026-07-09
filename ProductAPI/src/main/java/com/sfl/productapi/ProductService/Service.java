package com.sfl.productapi.ProductService;

import com.sfl.productapi.ProductEntity.Product;
import com.sfl.productapi.ProductRepository.Repository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class Service {
    @Autowired
    private Repository repository;

    public Product createProduct(Product product){
        return repository.save(product);
    }
    public List<Product> getAll(){
        return repository.findAll();
    }
    public Product getId(int id){
        Product existing= repository.findById(id).orElse(null);
        if(existing==null)
            return null;
        return existing;
    }
    public Product update(int id,Product product){
        Product existing=repository.findById(id).orElse(null);
                if(existing==null)
                    return null;

                existing.setId(product.getId());
                existing.setPrice(product.getPrice());
                existing.setProductName(product.getProductName());
                return repository.save(existing);
    }
    public String delete(int id){
        Product existing=repository.findById(id).orElse(null);
        if(existing==null)
            return "Product Not Found";
        repository.delete(existing);
        return "Deleted Successfully";
    }
}
