package com.example.quote.controller;

import java.util.Optional;

import com.example.quote.model.Quote;
import com.example.quote.repository.QuoteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/quotes")
public class QuoteController {

    @Autowired
    private QuoteRepository repository;

    @Value("${quote.index}")
    private Long index;

    @GetMapping(path = "/")
    public Iterable<Quote> getAllQuotes() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Quote> one(@PathVariable Long id) {
        return repository.findById(id);
    }

    @GetMapping("/index")
    public Optional<Quote> index() {
        return repository.findById(index);
    }
}
