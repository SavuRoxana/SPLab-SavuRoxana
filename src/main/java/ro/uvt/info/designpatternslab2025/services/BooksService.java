package ro.uvt.info.designpatternslab2025.services;

import org.springframework.stereotype.Service;
import ro.uvt.info.designpatternslab2025.models.BookDTO;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class BooksService {
    private final Map<Long, BookDTO> books = new ConcurrentHashMap<>();
    private long nextId = 1;

    public List<BookDTO> getAllBooks() {
        return new ArrayList<>(books.values());
    }

    public BookDTO getBookById(Long id) {
        return books.get(id);
    }

    public BookDTO createBook(BookDTO book) {
        book.setId(nextId++);
        books.put(book.getId(), book);
        return book;
    }

    public BookDTO updateBook(Long id, BookDTO book) {
        if (books.containsKey(id)) {
            book.setId(id);
            books.put(id, book);
            return book;
        }
        return null;
    }

    public boolean deleteBook(Long id) {
        return books.remove(id) != null;
    }
}

