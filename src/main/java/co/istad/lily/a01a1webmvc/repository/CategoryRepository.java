package co.istad.lily.a01a1webmvc.repository;

import co.istad.lily.a01a1webmvc.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
