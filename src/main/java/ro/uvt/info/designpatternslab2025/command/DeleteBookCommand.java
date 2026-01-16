package ro.uvt.info.designpatternslab2025.command;

import ro.uvt.info.designpatternslab2025.services.BooksService;

public class DeleteBookCommand implements Command<Boolean> {
    private final BooksService booksService;
    private final Long id;

    public DeleteBookCommand(BooksService booksService, Long id) {
        this.booksService = booksService;
        this.id = id;
    }

    @Override
    public Boolean execute() {
        return booksService.deleteBook(id);
    }
}

