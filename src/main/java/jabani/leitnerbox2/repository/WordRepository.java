package jabani.leitnerbox2.repository;

import jabani.leitnerbox2.entity.Word;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WordRepository extends JpaRepository<Word, Long> {
}
