package in.stack.eStore.service;

import java.util.List;

import in.stack.eStore.model.Product;
import in.stack.eStore.repository.ProductRepoInterFace;
import in.stack.eStore.repository.ProductRepository;

public class ProductService implements ProductServiceInterface{

	private ProductRepoInterFace productRepo = new ProductRepository();
	
	@Override
	public List<Product> getAllProducts() {
		 List<Product> allProducts = productRepo.getAllProducts();
		return allProducts;
	}

	
	@Override
	public Product getProductById(int id) {
		Product product = productRepo.getProductById(id);
		
		return product;
	}

	@Override
	public Product addProduct(Product p) {
		Product addedProduct = productRepo.addProduct(p);
		return addedProduct;
	}

	@Override
	public Product updateProduct(Product p) {
		Product updatedProduct = productRepo.updateProduct(p);
		return updatedProduct;
	}

}
