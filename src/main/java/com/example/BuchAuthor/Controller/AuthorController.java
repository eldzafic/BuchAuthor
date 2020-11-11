package com.example.BuchAuthor.Controller;

import com.example.BuchAuthor.Domain.Author;
import com.example.BuchAuthor.Service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AuthorController {

    private final AuthorService service;

    @Autowired
    public AuthorController(AuthorService service) {
        this.service = service;
    }

    @GetMapping("/author")
    public List<Author> getAllAuthoren()
    {
        return service.listAuthoren();
    }
}
