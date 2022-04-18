package derek.onelinestoredemo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import derek.onelinestoredemo.entity.Product;
import derek.onelinestoredemo.service.ProductService;

@RestController
@RequestMapping("api")
public class ProductRestController {
	
	private ProductService productService;
	
	@Autowired
	public ProductRestController(ProductService theProductService) {
		productService = theProductService;
	}
	
	@GetMapping("/products")
	public List<Product> findAll(){
		return productService.findAll();
		}
	
	@GetMapping("/products/{productId}")
	public Product getProduct(@PathVariable int productId){
		Product theProduct = productService.findById(productId);
		
		if (theProduct==null) {
			throw new RuntimeException("Product id not found - " +productId);
			
		}
		
		return theProduct;
	}
	
	@PostMapping("/products")
	public Product addProduct(@RequestBody Product theProduct) {
		
		theProduct.setId(0);
		
		productService.save(theProduct);
		
		return theProduct;
		
	}
	
	@DeleteMapping("/products/{productId}")
	public String deleteProduct(@PathVariable int productId) {
		
		Product theProduct = productService.findById(productId);
		
		if (theProduct==null) {
			throw new RuntimeException("Product id not found - " +productId);
			
		}
		
		productService.deleteById(productId);
		
		return "delete product ID -"+productId;
		
	}
	
	

}
