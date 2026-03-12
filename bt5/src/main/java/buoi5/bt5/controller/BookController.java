package buoi5.bt5.controller;

import buoi5.bt5.model.Book;
import buoi5.bt5.repository.BookCategoryRepository;
import buoi5.bt5.service.BookService;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/books")
public class BookController {
    private final BookService bookService;
    private final BookCategoryRepository bookCategoryRepository;

    public BookController(BookService bookService,
                          BookCategoryRepository bookCategoryRepository) {
        this.bookService = bookService;
        this.bookCategoryRepository = bookCategoryRepository;
    }

    // 1. Hiển thị danh sách
    @GetMapping("")
    public String listBooks(Model model) {
        model.addAttribute("books", bookService.getAllBooks());
        return "bookslist";
    }

    // 2. Form thêm sách mới
    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("book", new Book());
        model.addAttribute("categories", bookCategoryRepository.findAll());
        return "addbooks";
    }

    // 3. Lưu sách (cả Thêm và Sửa)
    @PostMapping("/save")
    public String saveBook(@ModelAttribute("book") @NonNull Book book) {
        bookService.saveBook(book);
        return "redirect:/books";
    }

    // 4. Form sửa sách
    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable("id") @NonNull Long id, Model model) {
        Book book = bookService.getBookById(id);
        model.addAttribute("book", book);
        model.addAttribute("categories", bookCategoryRepository.findAll());
        return "addbooks";
    }

    // 5. Xóa sách
    @GetMapping("/delete/{id}")
    public String deleteBook(@PathVariable("id") @NonNull Long id) {
        bookService.deleteBook(id);
        return "redirect:/books";
    }
}
