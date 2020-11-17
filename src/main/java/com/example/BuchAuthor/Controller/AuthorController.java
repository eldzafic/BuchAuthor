package com.example.BuchAuthor.Controller;

import com.example.BuchAuthor.Domain.Author;
import com.example.BuchAuthor.Domain.Buch;
import com.example.BuchAuthor.Service.AuthorService;
import com.example.BuchAuthor.Service.BuchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class AuthorController {


    private final AuthorService service;
    private final BuchService servicebuch;

    @Autowired
    public AuthorController(AuthorService service, BuchService servicebuch) {
        this.service = service;
        this.servicebuch = servicebuch;
    }


    @GetMapping("/author")
    public List<Author> getAllCart()
    {
        return service.listAuthor();
    }

    @GetMapping("/bucher")
    public List<Buch> getAllBucher(){return servicebuch.listBuch();}

    @GetMapping("/{id}")
    public Author authorById(@PathVariable(name = "id") Author test)
    {
        return test;
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteAuthor(@PathVariable(name = "id") Author test)
    {
        service.delete(test);
        return new ResponseEntity<>("Author geloescht", HttpStatus.OK);
    }

    @RequestMapping(value= "/author/save", method = RequestMethod.POST)
    public String saveAuthor(@ModelAttribute("author") Author author)
    {
        service.saveAuthor(author);
        return null;
    }

    @RequestMapping(value= "/buch/save", method = RequestMethod.POST)
    public String saveBuch(@ModelAttribute("buch") Buch buch)
    {
        servicebuch.saveBuch(buch);
        return null;
    }

    @PutMapping(path = "/editauthor", consumes = "application/json", produces = "application/json")
    public String editAuthor(@RequestBody Author author)
    {
        Long id = author.getId();
        service.editAuthor(id, author);

        return "Author geändert";
    }

    @PutMapping(path = "/editbuch", consumes = "application/json", produces = "application/json")
    public String editBuch(@RequestBody Buch buch)
    {
        Long id = buch.getId();
        servicebuch.editBuch(id, buch);

        return "Buch geändert";
    }

}
