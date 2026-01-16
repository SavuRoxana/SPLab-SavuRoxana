package ro.uvt.info.designpatternslab2025.command;

import ro.uvt.info.designpatternslab2025.models.BookDTO;
import ro.uvt.info.designpatternslab2025.services.BooksService;

public class GetBookByIdCommand implements Command<BookDTO> {
    private final BooksService booksService;
    private final Long id;

    public GetBookByIdCommand(BooksService booksService, Long id) {
        this.booksService = booksService;
        this.id = id;
    }

    @Override
    public BookDTO execute() {
        return booksService.getBookById(id);
    }
}

