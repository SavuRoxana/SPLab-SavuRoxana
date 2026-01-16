package ro.uvt.info.designpatternslab2025.command;

import ro.uvt.info.designpatternslab2025.models.BookDTO;
import ro.uvt.info.designpatternslab2025.services.BooksService;

import java.util.List;

public class GetAllBooksCommand implements Command<List<BookDTO>> {
    private final BooksService booksService;

    public GetAllBooksCommand(BooksService booksService) {
        this.booksService = booksService;
    }

    @Override
    public List<BookDTO> execute() {
        return booksService.getAllBooks();
    }
}

