package com.example.quote.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="quote")
public class Quote {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 1024)
    private String quote;

    public Quote() {}

    public Quote(final Long id, final String quote) {
        this.id = id;
        this.quote = quote;
    }

    public Quote(final String quote) {
        this.quote = quote;
    } 
}