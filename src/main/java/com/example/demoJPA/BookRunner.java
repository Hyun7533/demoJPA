package com.example.demoJPA;

import com.example.demoJPA.book.Book;
import com.example.demoJPA.book.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@RequiredArgsConstructor
public class BookRunner implements ApplicationRunner {

    private final BookRepository bookRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Book book = new Book();
        book.setName("Whiteship's JPA");
        book.setCreated(new Date());

        bookRepository.save(book);
    }
}
