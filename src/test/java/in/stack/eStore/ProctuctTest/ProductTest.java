package in.stack.eStore.ProctuctTest;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import in.stack.eStore.repository.ProductRepository;
import in.stack.eStore.service.ProductService;

@ExtendWith(MockitoExtension.class)
public class ProductTest {
	
	@Mock
	ProductRepository productRepo;
	
	@InjectMocks
	ProductService productService;
	
	@Test
	public void getProductsTest() {
	//	Mockito.when(productRepo.getAllProducts()).thenReturn(Arrays.asList(""));
	}

}
