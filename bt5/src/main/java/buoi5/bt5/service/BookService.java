package buoi5.bt5.service;

import buoi5.bt5.model.Book;
import buoi5.bt5.repository.BookRepository;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public void saveBook(@NonNull Book book) {
            bookRepository.save(book);
    }

    public Book getBookById(@NonNull Long id) {
        return bookRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Book not found with id: " + id));
    }

    public void deleteBook(@NonNull Long id) {
        bookRepository.deleteById(id);
    }
}