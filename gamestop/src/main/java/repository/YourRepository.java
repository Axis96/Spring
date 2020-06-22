package repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import model.Product;

public interface YourRepository extends CrudRepository<Product, Long> {
	
	@Query(value = "SELECT c FROM Product c WHERE c.titolo LIKE '%' || :keyword || '%'"
			+ " OR c.classificazione LIKE '%' || :keyword || '%'"
			+ " OR c.PEGI LIKE '%' || :keyword || '%'"
			+ " OR c.prezzo LIKE '%' || :keyword || '%'"
			+ " OR c.categoria LIKE '%' || :keyword || '%'")
	public List<Product> search(@Param("keyword") String keyword);
}