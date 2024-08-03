package com.example.controller;

import com.example.entity.Author;
import com.example.entity.Book;
import com.example.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/authors")
public class AuthorController {
    @Autowired
    private AuthorService authorService;

    @PostMapping
    public Author createAuthor(@RequestBody Author author) {
        return authorService.save(author);
    }

    @GetMapping
    public List<Author> getAllAuthors() {
        return authorService.findAll();
    }

    @GetMapping("/{id}")
    public Author getAuthorById(@PathVariable Long id) {
        return authorService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteAuthor(@PathVariable Long id) {
        authorService.deleteById(id);
    }

    @PostMapping("/{authorId}/books")
    public Author addBook(@PathVariable Long authorId, @RequestBody Book book) {
        return authorService.addBook(authorId, book);
    }

    @DeleteMapping("/{authorId}/books/{bookId}")
    public Author removeBook(@PathVariable Long authorId, @PathVariable Long bookId) {
        return authorService.removeBook(authorId, bookId);
    }
}