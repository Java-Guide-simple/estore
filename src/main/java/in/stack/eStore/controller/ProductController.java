package in.stack.eStore.controller;

import java.util.List;
import java.util.Scanner;
import in.stack.eStore.model.Product;
import in.stack.eStore.service.ProductService;
import in.stack.eStore.service.ProductServiceInterface;

public class ProductController {
	
	static ProductController pc;
	private Scanner scan = new Scanner(System.in);
	ProductServiceInterface service = new ProductService();

	
	// Get All product Details
	public void getProduct() {

		List<Product> allProducts = service.getAllProducts();
		for (Product product : allProducts) {
			System.out.println(product);
		}

	}

	// Get Product By ID
	public void getProductById(int id) {
		Product productById = service.getProductById(id);
		if(productById!=null)
			System.out.println(productById.toString());
		else
			System.out.println("ID"+ id + " has no product");

	}

	// Add new product
	public void addProduct(Product p) {
		Product addProduct = service.addProduct(p);
		System.out.println("New added Product Details :");
		System.out.println(addProduct + "\n");

	}

	// Update product details
	public void updateProduct(Product p) {
		Product updatedProduct = service.updateProduct(p);
		System.out.println("Updated Product Details is :");
		System.out.println(updatedProduct.toString());
	}

	// User InterFace Option 
	public void allFunctionalities() {

		System.out.println("If You Want to See all products Press : 1");
		System.out.println("If You Want to See  product by Id Press : 2");
		System.out.println("If You Want to Update Quantity ,Availablity Or Price of Product by Id Press : 3");
		System.out.println("If You Want to add New  product Press : 4");

		int input = scan.nextInt();
		switch (input) {
		case 1:
			pc.getProduct();
			break;
		case 2:
			System.out.println("Enter Product Id");
			int id = scan.nextInt();
			pc.getProductById(id);
			break;
		case 3:

			System.out.println("Enter Product Id");
			int pid = scan.nextInt();
			if(service.getProductById(pid)!=null)
				pc.updateProduct(service.getProductById(pid));
			else
				System.out.println("ID"+ pid + " has no product");
			break;
		case 4:
			Product p = new Product();

			pc.addProduct(p);
			break;

		default:

			System.out.println("Please Enter Right Key ");
			main(null);
		}

	}

	
	// Execution Starting Our Application
	public static void main(String[] args) {
		pc = new ProductController();
		boolean condition = false;
		System.out.println("WELCOME TO OUR ESTORE ");
		do {
			pc.allFunctionalities();
			System.out.println("If You Want to Go Main menu Press : 0");
			System.out.println("If you want to place order Press number other than 0 Key ");
			int back = pc.scan.nextInt();
			if (back == 0)
				condition = true;
			else
				break;
		} while (condition);

	}

}
