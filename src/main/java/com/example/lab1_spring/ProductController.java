package com.example.lab1_spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public String getAllProducts(Model model) {
        List<Product> products = productService.getProducts();
        model.addAttribute("products", products);
        return "products";
    }

    @GetMapping("/products/seed")
    public String seed() {
        productService.seed();
        return "redirect:/student/";
    }

    @PostMapping("/add")
    public String addProduct(@ModelAttribute Product product) {
        productService.addProduct(product);
        return "redirect:/products";
    }

    @GetMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id) {
        productService.deleteProductById(id);
        return "redirect:/products";
    }

    @GetMapping("/edit/{id}")
    public String editProduct(@PathVariable int id, Model model) {
        Product product = productService.getProductById(id);
        model.addAttribute("product", product);
        return "edit-product";
    }

    @PostMapping("/update")
    public String updateProduct(@ModelAttribute Product product) {
        productService.updateProduct(product);
        return "redirect:/products";
    }
}
