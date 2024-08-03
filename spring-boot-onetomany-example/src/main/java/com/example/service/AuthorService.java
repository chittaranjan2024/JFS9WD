package com.example.service;
import com.example.entity.Author;
import com.example.entity.Book;
import com.example.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {
    @Autowired
    private AuthorRepository authorRepository;

    public Author save(Author author) {
        return authorRepository.save(author);
    }

    public List<Author> findAll() {
        return authorRepository.findAll();
    }

    public Author findById(Long id) {
        return authorRepository.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        authorRepository.deleteById(id);
    }

    public Author addBook(Long authorId, Book book) {
        Author author = findById(authorId);
        if (author != null) {
            author.addBook(book);
            return save(author);
        }
        return null;
    }

    public Author removeBook(Long authorId, Long bookId) {
        Author author = findById(authorId);
        if (author != null) {
            Book book = author.getBooks().stream().filter(b -> b.getId().equals(bookId)).findFirst().orElse(null);
            if (book != null) {
                author.removeBook(book);
                return save(author);
            }
        }
        return null;
    }
}