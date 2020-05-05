package my.aws.api.service;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import my.aws.api.dao.IProductDAO;
import my.aws.api.model.ProductEntity;

@Singleton
public class ProductService {

	private static final String BASIS = "basis";

	private static final Logger logger = LoggerFactory.getLogger(ProductService.class);

	@Inject
	IProductDAO iProductDAO;

	public List<ProductEntity> getProducts(){
		return iProductDAO.getProducts();
	}
	
}
