package com.example.BuchAuthor.Service;

import com.example.BuchAuthor.Domain.Author;
import com.example.BuchAuthor.Repository.AuthorRepository;
import com.example.BuchAuthor.Repository.BuchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepository repo;

    AuthorService()
    {

    }

    public List<Author> listAuthoren()
    {
        return repo.findAll();
    }
}
