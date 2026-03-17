package co.istad.lily.a01a1webmvc.repository;

import co.istad.lily.a01a1webmvc.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,String> {
}
