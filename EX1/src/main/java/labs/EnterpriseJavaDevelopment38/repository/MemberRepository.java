package labs.EnterpriseJavaDevelopment38.repository;

import labs.EnterpriseJavaDevelopment38.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Integer> {
}
