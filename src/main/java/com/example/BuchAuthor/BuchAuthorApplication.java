package com.example.BuchAuthor;

import com.example.BuchAuthor.Domain.Author;
import com.example.BuchAuthor.Domain.Buch;
import com.example.BuchAuthor.Repository.AuthorRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class BuchAuthorApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext =
				SpringApplication.run(BuchAuthorApplication.class, args);
		AuthorRepository authorRepository = configurableApplicationContext.getBean(AuthorRepository.class);


		Author a1 = new Author("Elmedin");
		Buch b1 = new Buch("Ein Buch", a1);
		Buch b2 = new Buch("Ein zweites Buch", a1);

		Author a2 = new Author("Stefan");
		Buch b3 = new Buch("Buch 1 Stefan", a2);
		Buch b4 = new Buch("Buch 2 Stefan", a2);

		List<Buch> buecher = Arrays.asList(b1, b2);
		a1.setBuecher(buecher);
		authorRepository.save(a1);

		List<Buch> buecher2 = Arrays.asList(b3, b4);
		a2.setBuecher(buecher2);
		authorRepository.save(a2);

	}

}
