package com.example.firstspringapp.controllers;

import com.example.firstspringapp.dtos.FakeStoreProductDto;
import com.example.firstspringapp.models.Product;
import com.example.firstspringapp.services.FakeStoreProductService;
import com.example.firstspringapp.services.ProductService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.lang.*;

@Getter
@Setter
@RestController
@RequestMapping("/products")
public class ProductController {


    private ProductService productService;
@Autowired
    ProductController(ProductService productService)
    {
        this.productService=productService;
    }


    @GetMapping()
    public List<Product> getAllProducts()
    {
        return new ArrayList<>();
    }
    @GetMapping("/{id}")
    public Product getSingleProduct(@PathVariable("id") Long id)
    {
         return productService.getSingleProduct(id);
    }
    @PostMapping()
    public Product addNewProduct(@RequestBody Product product)
    {
         Product p=new Product();
         p.setTitle("manoj");
         return p;
    }
    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable("id") Long id, @RequestBody Product product) {
        return new Product();
    }
@PatchMapping("/{id}")
    public Product replaceProduct(@PathVariable("id") Long id,@RequestBody Product product)
    {
        return new Product();
    }
@DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable("id") Long id)
    {

    }
}
