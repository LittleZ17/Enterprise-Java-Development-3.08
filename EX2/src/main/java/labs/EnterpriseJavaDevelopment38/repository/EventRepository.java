package labs.EnterpriseJavaDevelopment38.repository;


import labs.EnterpriseJavaDevelopment38.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EventRepository extends JpaRepository<Event, Integer> {
}
