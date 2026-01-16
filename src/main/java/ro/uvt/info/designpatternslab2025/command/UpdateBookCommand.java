package ro.uvt.info.designpatternslab2025.command;

import ro.uvt.info.designpatternslab2025.models.BookDTO;
import ro.uvt.info.designpatternslab2025.services.BooksService;

public class UpdateBookCommand implements Command<BookDTO> {
    private final BooksService booksService;
    private final Long id;
    private final BookDTO book;

    public UpdateBookCommand(BooksService booksService, Long id, BookDTO book) {
        this.booksService = booksService;
        this.id = id;
        this.book = book;
    }

    @Override
    public BookDTO execute() {
        return booksService.updateBook(id, book);
    }
}

