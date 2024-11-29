package com.example.lab1_spring;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ProductService {
    private ArrayList<Product> products = new ArrayList<>();

    public void seed(){
        products.add(new Product(1, "Onion", 3.2, 1.83, "Vegetable"));
        products.add(new Product(2, "Salmon", 0.56, 21.15, "Fish"));
        products.add(new Product(3,"Chicken Breast",1.21,32.16,"Meat"));
    }

    private boolean isEmpty() {
        return products.isEmpty();
    }

    public void addProduct(Product product) {
        int newId = products.isEmpty() ? 1 : products.get(products.size() - 1).getId() + 1;
        product.setId(newId);
        products.add(product);
    }

    public Product getProductById(int id) {
        for(Product product:products){
            if(product.getId()==id)
                return product;
        }
        return null;
    }

    public void updateProduct(Product product) {
        deleteProduct(product);
        products.add(product);
    }

    public void deleteProduct(Product student) {
        products.remove(getProductById(student.getId()));
    }

    public void deleteProductById(int id) {
        products.remove(getProductById(id));
    }


    public ArrayList<Product> getProducts() {
        return products;
    }
    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }
}
