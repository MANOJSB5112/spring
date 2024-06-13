package com.example.firstspringapp.services;

import com.example.firstspringapp.models.Product;
import org.springframework.stereotype.Service;

@Service
public interface ProductService {

    public Product getSingleProduct(Long id);
}
