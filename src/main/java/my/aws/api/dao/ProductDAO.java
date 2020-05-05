package my.aws.api.dao;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.transaction.annotation.Transactional;

import io.micronaut.context.annotation.Requires;
import my.aws.api.model.ProductEntity;
import my.aws.api.model.ProductRowMapper;
import my.aws.api.model.SqlString;;

@Transactional
@Singleton
@Requires(beans = { JdbcTemplate.class })
public class ProductDAO implements IProductDAO {


	private static final String NO_CENTER_STONE_PRODUCT_FOUND_FOR_ORGID = "No CenterStone Product found for orgid : ";
	private final Logger logger = LoggerFactory.getLogger(ProductDAO.class);
	private static final SqlString SQL_STRING = new SqlString();

	@Inject
	JdbcTemplate jdbcTemplate;

//	public ProductDAO(@Inject JdbcTemplate jdbcTemplate) {
//		this.jdbcTemplate = jdbcTemplate;
//	}

	@Override
	public List<ProductEntity> getProducts() {
		String sql = SELECT_FROM_PRODUCT;
		logger.debug(SQL_STRING.toLogback(sql));
		RowMapper<ProductEntity> rowMapper = new ProductRowMapper();
		return this.jdbcTemplate.query(sql, rowMapper);
	}
	
//	@Override
//	public List<ProductEntity> getCenterStoneProducts() {
//		List<ProductEntity> products = new ArrayList<ProductEntity>();
//		String sql = ProductUtil.SELECT_SPECIFIC_PRODUCT;
//		logger.debug(SQL_STRING.toLogback(sql), CENTERSTONE.getName());
//		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql, CENTERSTONE.getName());
//		for (Map<String, Object> row : rows) {
//			ProductEntity product = new ProductEntity();
//			product.setId((Integer) row.get(ID));
//			Organisation org = new Organisation();
//			org.setOrgId((Integer) row.get(ORGID));
//			product.setOrg(org);
//			product.setDefaultStartTime(row.get(DEFAULTSTARTTIME)!=null?row.get(DEFAULTSTARTTIME).toString(): null);
//			product.setDefaultTimeInterval(row.get(DEFAULTTIMEINTERVAL)!=null?row.get(DEFAULTTIMEINTERVAL).toString(): null);
//			products.add(product);
//		}
//		return products;
//	}
//	
}
