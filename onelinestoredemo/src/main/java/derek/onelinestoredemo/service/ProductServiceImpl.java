package derek.onelinestoredemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import derek.onelinestoredemo.dao.ProductRepository;
import derek.onelinestoredemo.entity.Product;

@Service
public class ProductServiceImpl implements ProductService {
	
	private ProductRepository productRepository;

	@Autowired
	public ProductServiceImpl(ProductRepository theProductRepository) {
		productRepository = theProductRepository;
		
	}

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}

	@Override
	public Product findById(int theId) {
		
		// TODO Auto-generated method stub
		Optional<Product> result = productRepository.findById(theId);
		Product theProduct = null;
		
		if (result.isPresent()) {
			theProduct = result.get();
		}
		else {
			throw new RuntimeException("Did not find product id");
		}
		return theProduct;
	}

	@Override
	public void save(Product theProduct) {
		productRepository.save(theProduct);
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteById(int theId) {
		productRepository.deleteById(theId);
		// TODO Auto-generated method stub

	}

}
