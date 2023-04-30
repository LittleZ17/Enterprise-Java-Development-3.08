package labs.EnterpriseJavaDevelopment38.repository;

import labs.EnterpriseJavaDevelopment38.model.Association;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssociationRepository extends JpaRepository<Association, Integer> {
}
