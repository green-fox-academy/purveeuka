package com.example.homework.controllers;

import com.example.homework.models.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BookController {
    private final List<Book> books = new ArrayList<>();
    public BookController() {
        this.books.add(new Book("Cat's Cradle", "Kurt Vonnegut", 1963));
        this.books.add(new Book("Do Androids Dream of Electric Sheep?", "Philip K. Dick", 1968));
    }

    @GetMapping("/books")
    public String index(Model model) {
        model.addAttribute("book", new Book());
        model.addAttribute("books", books);
        return "index";
    }

    @GetMapping("/books/{id}/details")
    public String getBookById(Model model, @PathVariable(name="id") Integer id) {
        Book bookById = null;

        for(Book book : books) {
            if (book.getId() == id) {
                bookById = book;
            }
        }

        if (bookById != null) {
            model.addAttribute("book", bookById);
        } else {
            model.addAttribute("error", "No book found");
        }

        return "details";
    }

    @GetMapping(path ="/books/add")
    public String add(Model model) {
        model.addAttribute("action", "/books/add");
        model.addAttribute("book", new Book());
        return "fragments/addBook";
    }

    @PostMapping(path ="/books/add")
    public String create(@ModelAttribute Book book) {
        books.add(new Book(book));
        return "index";
    }

    @GetMapping(path ="/books/{id}/edit")
    public String edit(Model model, @PathVariable Long id) {
        model.addAttribute("action", "/books/"+id+"/edit");
        for(Book b : books) {
            if (b.getId() == id) {
                model.addAttribute("book", b);
                break;
            }
        }
        return "fragments/addBook";
    }

    @PostMapping(path ="/books/{id}/edit")
    public String update(Model model, @ModelAttribute Book book, @PathVariable Long id) {
        System.out.println(book);
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId() == id) {
                books.set(i, book);
            }
        }
        model.addAttribute("book", new Book());
        model.addAttribute("books", books);
        return "index";
    }
}
