package labs.EnterpriseJavaDevelopment38.repository;

import labs.EnterpriseJavaDevelopment38.model.Guest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestRepository extends JpaRepository<Guest, Integer> {
}
