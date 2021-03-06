package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import model.Product;
import repository.YourRepository;

@Service
@Transactional
public class PrimaryService {
	@Autowired YourRepository repo;
	
	public void save(Product product) {
		repo.save(product);
	}
	
	public List<Product> listAll() {
		return (List<Product>) repo.findAll();
	}
	
	public Product get(Long id) {
		return repo.findById(id).get();
	}
	
	public void delete(Long id) {
		repo.deleteById(id);
	}
	
	public List<Product> search(String keyword) {
		return repo.search(keyword);
	}
}