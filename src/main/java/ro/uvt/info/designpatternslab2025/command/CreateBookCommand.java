package ro.uvt.info.designpatternslab2025.command;

import ro.uvt.info.designpatternslab2025.models.BookDTO;
import ro.uvt.info.designpatternslab2025.services.BooksService;

public class CreateBookCommand implements Command<BookDTO> {
    private final BooksService booksService;
    private final BookDTO book;

    public CreateBookCommand(BooksService booksService, BookDTO book) {
        this.booksService = booksService;
        this.book = book;
    }

    @Override
    public BookDTO execute() {
        return booksService.createBook(book);
    }
}

