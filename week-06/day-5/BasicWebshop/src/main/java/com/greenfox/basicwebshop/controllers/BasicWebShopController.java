package com.greenfox.basicwebshop.controllers;

import com.greenfox.basicwebshop.models.ShopItem;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class BasicWebShopController {

    private final List<ShopItem> shopItems = new ArrayList<>();
    private String currency = "kc";

    public BasicWebShopController(){
        shopItems.add(new ShopItem("Running shoes", "Nike running shoe for everyday sport",1000.0,5,"Clothes,Shoes"));
        shopItems.add(new ShopItem("Printer", "Some HP printer that will print pages", 3000.0, 2, "Electronic"));
        shopItems.add(new ShopItem("Coca cola", "0.5l standard coke", 25.0, 0, "Beverages,Snacks"));
        shopItems.add(new ShopItem("Wokin", "Chicken with fried rice and WOKIN sauce", 119.0, 100, "Beverages,Snacks"));
        shopItems.add(new ShopItem("T-shirt", "Blue with a corgi on a bike", 300.0, 1, "Clothes,Shoes"));
    }

    @GetMapping("/eshop")
    public String listAllItems(Model model) {
        model.addAttribute("currency", currency);
        model.addAttribute("shopItems", shopItems);
        return "index";
    }

    @GetMapping("/only-available")
    public String showAvailable(Model model) {
        model.addAttribute("shopItems", shopItems.stream()
                .filter(i -> i.getQuantityOfStock() > 0)
                .collect(Collectors.toList()));
        return "index";
    }

    @GetMapping("/cheapest-first")
    public String cheapestFirst(Model model) {
        model.addAttribute("currency", currency);
        model.addAttribute("shopItems",shopItems.stream()
        .sorted(Comparator.comparing(ShopItem::getPrice)).collect(Collectors.toList()));
        return "index";
    }

    @GetMapping("/contains-Nike")
    public String containsNike(Model model) {
        model.addAttribute("currency", currency);
        List<ShopItem> containsAll = shopItems.stream()
                .filter(i -> i.getDescription().contains("Nike") || i.getName().contains("Nike"))
                .collect(Collectors.toList());
        model.addAttribute("shopItems", containsAll);
        return "index";
    }

    @GetMapping("/average-stock")
    public String getAverage(Model model) {
        DecimalFormat dFormat = new DecimalFormat("#.##");
        var averageSResult = shopItems.stream()
                .map(ShopItem::getQuantityOfStock)
                .filter(quantityOfStock -> quantityOfStock > 0).reduce(0, Integer::sum);
        model.addAttribute("averageStock", dFormat.format((double) averageSResult / shopItems.size()));
        return "averageStock";
    }

    @GetMapping("/most-expensive")
    public String getAvailableMostExpensive(Model model) {
        model.addAttribute("currency", currency);
        model.addAttribute("shopItems", shopItems.stream()
                .sorted(Comparator.comparing(ShopItem::getPrice).reversed())
                .filter(shopItem -> shopItem.getQuantityOfStock() > 0)
                .collect(Collectors.toList()));
        return "index";
    }

    @PostMapping("/search")
    public  String search (Model model, @RequestParam String keyword) {
        List<ShopItem> foundItem = shopItems.stream()
                .filter(shopItem -> shopItem.getDescription().contains(keyword) || shopItem.getName().contains(keyword))
                .collect(Collectors.toList());
        model.addAttribute("currency", currency);
        model.addAttribute("shopItems", foundItem);
        return "index";
    }

    @GetMapping("/filter-clothes-shoes")
    public String filterClothesShoes(Model model) {
        model.addAttribute("shopItems", shopItems.stream()
                .filter(shopItem -> shopItem.getType().contains("Clothes,Shoes"))
                .collect(Collectors.toList()));
        return "index2";
    }

    @GetMapping("/filter-electronics")
    public String filterElectronics(Model model) {
        model.addAttribute("currency", currency);
        model.addAttribute("shopItems", shopItems.stream()
                .filter(shopItem -> shopItem.getType().contains("Electronic"))
                .collect(Collectors.toList()));
        return "index2";
    }

    @GetMapping("/filter-beverages-snacks")
    public String filterBeveragesSnacks(Model model) {
        model.addAttribute("currency", currency);
        model.addAttribute("shopItems", shopItems.stream()
                .filter(shopItem -> shopItem.getType().contains("Beverages,Snacks"))
                .collect(Collectors.toList()));
        return "index2";
    }

    @GetMapping("/more-filters")
    public String getMoreFilters(Model model) {
        model.addAttribute("currency", currency);
        model.addAttribute("shopItems", shopItems);
        return "index2";
    }

    @GetMapping("/euro")
    public String toEuro(Model model) {
        if (!currency.equals("eu")) {
            shopItems.forEach(ShopItem::setEuro);
            currency = "eu";
        }
        model.addAttribute("currency", currency);
        model.addAttribute("shopItems", shopItems);

        return "index2";
    }

    @GetMapping("/czk")
    public String toCZK(Model model) {
        if (currency.equals("eu")){
            shopItems.forEach(ShopItem::setCZK);
            currency = "kc";
        }
        model.addAttribute("currency", currency);
        model.addAttribute("shopItems", shopItems);

        return "index2";
    }

    @PostMapping("/more-filters/filter-price")
    public String choosePrice(Model model,@RequestParam int price,  @RequestParam(value = "value") String value) {
        model.addAttribute("currency", currency);
        model.addAttribute("shopItems", shopItems);
        switch (value) {
            case "above":
                model.addAttribute("shopItems", shopItems.stream()
                        .filter(shopItem -> shopItem.getPrice() > price)
                        .collect(Collectors.toList()));
                break;
            case "below":
                model.addAttribute("shopItems", shopItems.stream()
                        .filter(shopItem -> shopItem.getPrice() < price)
                        .collect(Collectors.toList()));
                break;
            case "exactly":
                model.addAttribute("shopItems", shopItems.stream()
                        .filter(shopItem -> shopItem.getPrice() == price)
                        .collect(Collectors.toList()));
                break;
        }

        return "index2";
    }
}
