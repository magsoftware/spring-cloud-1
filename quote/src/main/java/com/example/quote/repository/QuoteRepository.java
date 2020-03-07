package com.example.quote.repository;

import com.example.quote.model.Quote;

import org.springframework.data.repository.CrudRepository;

public interface QuoteRepository extends CrudRepository<Quote, Long> {
}