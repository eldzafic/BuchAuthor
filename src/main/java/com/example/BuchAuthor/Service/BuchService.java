package com.example.BuchAuthor.Service;

import com.example.BuchAuthor.Domain.Author;
import com.example.BuchAuthor.Domain.Buch;
import com.example.BuchAuthor.Repository.AuthorRepository;
import com.example.BuchAuthor.Repository.BuchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;


@Service
public class BuchService {


    @Autowired
    private BuchRepository repo;

    public List<Buch> listBuch()
    {
        return repo.findAll();
    }

    public void delete(Buch buch)
    {
        repo.delete(buch);
    }

    public void saveBuch(Buch buch)
    {
        repo.save(buch);
    }


}
