package se.norrwing.tddspringdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import se.norrwing.tddspringdemo.model.Product;


import java.util.Map;

@Controller
public class ProductController {

    public static Map<Integer, Product> products = Map.ofEntries(
            Map.entry(1, new Product(1, "TV", 100)),
            Map.entry(2, new Product(2, "Mikro", 200)),
            Map.entry(3, new Product(3, "Dator", 4000)),
            Map.entry(4, new Product(4, "Telefon", 700)),
            Map.entry(5, new Product(5, "Lampa", 60)),
            Map.entry(6, new Product(6, "Penna", 5)),
            Map.entry(7, new Product(7, "Sko", 200)),
            Map.entry(8, new Product(8, "Katt", 9999)),
            Map.entry(10, new Product(8, "Hund", 2))
    );


    @GetMapping("/products")
    public String getProducts(Model model) {
        model.addAttribute("productsMap", products);
        return "products";
    }

    @GetMapping("/product/{id}")
    public String getProduct (@PathVariable Integer id, Model model) {
        Product product = products.get(id);
        model.addAttribute("product", product);
        return "product";
    }


}
