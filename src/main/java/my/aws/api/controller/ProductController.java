package my.aws.api.controller;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import my.aws.api.model.ProductEntity;
import my.aws.api.service.ProductService;

@Controller("/products")
public class ProductController {
	
	private final Logger logger = LoggerFactory.getLogger(ProductController.class);
	
	@Inject
	ProductService productService;
	
	private final String JWT_ASSERTION = "X-JWT-Assertion";
	
	
//	@Get(uri = "/{id}") 
//	public ProductEntity getProduct(@NotBlank @Min(1) @Max(Integer.MAX_VALUE) Integer id) throws EntityNotFoundException {
//		logger.info("Requested for get Product for {}",id);
//		validateProductId(id);
//		
//		return productService.getProduct(id);	
//	}
//
//	@Get(uri = "/{id}/token") 
//	public ProductToken getProductToken(@NotBlank @Min(1) @Max(Integer.MAX_VALUE) Integer id, @Header(JWT_ASSERTION) String jwt) throws Exception {
//		logger.info("Requested for get Product token for product {}",id);
//		validateProductId(id);
//		return productService.getProductToken(id, jwt);
//	}
//
//	@Put("/{id}")
//	public Boolean updateProduct(@NotBlank @Min(1) @Max(Integer.MAX_VALUE) Integer id, @Body Product product) throws EntityNotFoundException, EntitlementException{
//		logger.info("Requested for update Product details for product {}",id);
//		validateProductId(id);
//		validateLicenseKey(product);
//		return productService.updateProduct(id, product);		
//	}
//
//	@Delete("/{id}")
//	public Boolean deleteProduct(@NotBlank @Min(1) @Max(Integer.MAX_VALUE)  Integer id) throws EntityNotFoundException{
//		logger.info("Requested for delete Product {}",id);
//		validateProductId(id);
//		return productService.deleteProduct(id);
//	}

	@Get
	public List<ProductEntity> getProducts() {
		logger.info("Requested for all Product");
		return productService.getProducts();
		
	}

//	@Post
//	public Product addProduct(@Body Product product) throws Exception,RuntimeException{
//		logger.info("Requested for create  {} new Product ",ESAPI.encoder().encodeForHTML(product.getName()));
//		validateLicenseKey(product);
//		return  productService.addProduct(product);		
//	}
//	
//	public void validateProductId(Integer productId) throws EntityNotFoundException {
//		try {
//			ESAPI.validator().getValidInput("Product Id", String.valueOf(productId),"productId",10, false);
//		} catch (Exception e) {
//			throw new EntityNotFoundException("Not valid Product Id input");
//		}
//	}
//	
//	public void validateLicenseKey(Product product) throws EntityNotFoundException {
//		if(product != null && product.getLicense() != null && product.getLicense().getLicenseKey() != null) {
//				try {
//					ESAPI.validator().getValidInput("LicenseKey", product.getLicense().getLicenseKey(), "uuid", 36, false);
//				} catch (Exception e) {
//					throw new EntityNotFoundException("Not valid License Key input");
//				}
//		}
//	}
}