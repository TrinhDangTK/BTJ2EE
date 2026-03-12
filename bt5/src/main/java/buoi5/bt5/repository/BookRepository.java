package buoi5.bt5.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import buoi5.bt5.model.Book;
public interface BookRepository extends JpaRepository<Book, Long> {
}