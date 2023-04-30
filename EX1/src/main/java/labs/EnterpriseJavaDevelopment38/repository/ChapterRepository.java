package labs.EnterpriseJavaDevelopment38.repository;

import labs.EnterpriseJavaDevelopment38.model.Chapter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChapterRepository extends JpaRepository<Chapter, Integer> {

}
