package com.example.bankofsimba.controllers;
import com.example.bankofsimba.models.BankAccount;
import com.example.bankofsimba.models.accountList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BankAccountController {

    private final accountList accountList;

    public BankAccountController() {
        accountList = new accountList();
        accountList.add("Simba", 200, "Lion", "Zebra");
        accountList.add("Timon", 100, "Meerkat","Zebra");
        accountList.add("Pumba", 500, "Warthog","Zebra");
        accountList.add("Scar", 10000.74, "Lion","Zebra");
    }

    @GetMapping("/bank")
    public String index(Model model) {
        model.addAttribute("account", new BankAccount());
        model.addAttribute("accounts", accountList.getAccounts());
        return "index";
    }

    @GetMapping("/bank/{id}/raise")
    public String raise(@PathVariable int id) {
        accountList.raise(id);
        return "redirect:/bank";
    }

    @PostMapping("/bank/add")
    public String add(@ModelAttribute BankAccount bankAccount) {
        accountList.add(bankAccount);
        return "redirect:/bank";
    }
}
