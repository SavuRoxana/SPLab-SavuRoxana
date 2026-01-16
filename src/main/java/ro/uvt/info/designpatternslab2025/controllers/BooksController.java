package ro.uvt.info.designpatternslab2025.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ro.uvt.info.designpatternslab2025.command.*;
import ro.uvt.info.designpatternslab2025.models.BookDTO;
import ro.uvt.info.designpatternslab2025.services.BooksService;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BooksController {
    private final BooksService booksService;
    private final CommandExecutor commandExecutor;

    @Autowired
    public BooksController(BooksService booksService, CommandExecutor commandExecutor) {
        this.booksService = booksService;
        this.commandExecutor = commandExecutor;
    }

    @GetMapping
    public ResponseEntity<List<BookDTO>> getAllBooks() {
        GetAllBooksCommand command = new GetAllBooksCommand(booksService);
        List<BookDTO> books = commandExecutor.execute(command);
        return ResponseEntity.ok(books);
    }

    @GetMapping("/{id}")
    public ResponseEntity<BookDTO> getBookById(@PathVariable Long id) {
        GetBookByIdCommand command = new GetBookByIdCommand(booksService, id);
        BookDTO book = commandExecutor.execute(command);
        if (book != null) {
            return ResponseEntity.ok(book);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<BookDTO> createBook(@RequestBody BookDTO book) {
        CreateBookCommand command = new CreateBookCommand(booksService, book);
        BookDTO createdBook = commandExecutor.execute(command);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdBook);
    }

    @PutMapping("/{id}")
    public ResponseEntity<BookDTO> updateBook(@PathVariable Long id, @RequestBody BookDTO book) {
        UpdateBookCommand command = new UpdateBookCommand(booksService, id, book);
        BookDTO updatedBook = commandExecutor.execute(command);
        if (updatedBook != null) {
            return ResponseEntity.ok(updatedBook);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBook(@PathVariable Long id) {
        DeleteBookCommand command = new DeleteBookCommand(booksService, id);
        Boolean deleted = commandExecutor.execute(command);
        if (deleted) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}

