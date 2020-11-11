package com.example.BuchAuthor.Repository;

import com.example.BuchAuthor.Domain.Author;
import com.example.BuchAuthor.Domain.Buch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BuchRepository extends JpaRepository<Buch, Long> {

    List<Buch> findAllByAuthor(Author author);

}
