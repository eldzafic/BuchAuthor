package com.example.BuchAuthor.Domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class Buch {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String titel;

    @ManyToOne
    @JoinColumn(name = "author_id")
    @JsonIgnore
    private Author author;

    public Buch(String titel, Author writer) {
        this.titel = titel;
        this.author = writer;
    }

    public Buch() {

    }

    public Long getId() {
        return id;
    }

    public String getTitel() {
        return titel;
    }

    public Author getAuthor() {
        return author;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}


