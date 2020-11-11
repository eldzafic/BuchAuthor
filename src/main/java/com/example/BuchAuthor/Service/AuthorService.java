package com.example.BuchAuthor.Service;

import com.example.BuchAuthor.Domain.Author;
import com.example.BuchAuthor.Domain.Buch;
import com.example.BuchAuthor.Repository.AuthorRepository;
import com.example.BuchAuthor.Repository.BuchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;


@Service
public class AuthorService {


    @Autowired
    private AuthorRepository repo;

    AuthorService()
    {

    }

    public List<Author> listAuthor()
    {
        return repo.findAll();
    }

    public void delete(Author author)
    {
        repo.delete(author);
    }

    public void saveAuthor(Author author)
    {
        repo.save(author);
    }

    public void editAuthor(Long id, Author author)
    {
        Optional<Author> a1 = repo.findById(id);
        Author a2 = a1.get();
        a2.setName(author.getName());
        repo.save(a2);
    }


}
