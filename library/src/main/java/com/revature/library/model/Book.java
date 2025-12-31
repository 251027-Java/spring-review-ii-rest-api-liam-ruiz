package com.revature.library.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

/**
 * Book Entity - TODO: Complete the annotations
 */
// TODO: Add @Entity annotation
// TODO: Add @Table(name = "books") annotation
@Entity
@Table(name = "books")
public class Book {

    // TODO: Add @Id and @GeneratedValue annotations
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // TODO: Add @Column(nullable = false) annotation
    @Column(nullable = false)
    private String title;

    // TODO: Add @Column(nullable = false) annotation
    @Column(nullable = false)
    private String author;

    // TODO: Add @Column(unique = true) annotation
    @Column(unique = true)
    private String isbn;

    private boolean available = true;

    private LocalDateTime createdAt;

    // Default constructor required by JPA
    public Book() {
        this.createdAt = LocalDateTime.now();
    }

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.available = true;
        this.createdAt = LocalDateTime.now();
    }

    // TODO: Generate getters and setters for all fields

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    // Add remaining getters/setters...
}
