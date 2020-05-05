package my.aws.api.dao;

import java.util.List;

import my.aws.api.model.ProductEntity;

public interface IProductDAO {
	String SELECT_FROM_PRODUCT = "SELECT p.id,p.name,p.dbname,p.url ,p.client_id,p.orgid,o.name as orgname,p.licenseid,p.username,p.credentials,l.licensekey,l.startdate,l.enddate,p.createddate,l.createddate as licensecreatedate FROM entitlements.product p Left Join entitlements.license l ON p.licenseid=l.id Left Join entitlements.organisation o On p.orgid=o.orgid";
	String SELECT_COUNT_FROM_PRODUCTS = "SELECT count(*) FROM entitlements.product";
	String SELECT_FROM_PRODUCTS_WHERE_ID = "SELECT * FROM entitlements.product WHERE id=?";
	String SELECT_SPECIFIC_PRODUCT = "SELECT p.id,p.name,p.dbname,p.url ,p.client_id,p.orgid,p.licenseid, p.defaultstarttime, p.defaulttimeinterval FROM entitlements.product p where  p.name =? ";
	String SELECT_COUNT_FROM_PRODUCTS_WHERE_NAME_AND_ID = "SELECT count(*) FROM entitlements.product WHERE id= ? AND name=?";

	String INSERT_INTO_LICENSE = "INSERT INTO entitlements.license(licensekey ,startdate,enddate) VALUES (?,?,?) ";
	String INSERT_INTO_PRODUCT = "INSERT INTO entitlements.product(name ,dbname ,URL ,licenseid,orgid,username,credentials,client_id) VALUES (?,?,?,?,?,?,?,?)";
	String INSERT_INTO_ROADRUNNER_ORGANISATION = "INSERT INTO entitlements.organisation (orgid,name) VALUES (?,?)";

	String DELETE_FROM_PRODUCT_WHERE_ID = "DELETE FROM entitlements.product WHERE id=?";

	String UPDATE_LICENSE = "UPDATE entitlements.license SET startdate=?,enddate=? ,licenseKey=? where id = (select licenseid from entitlements.product where id = ?)";
	String UPDATE_PRODUCT = "UPDATE entitlements.product SET name=? ,dbname=?,url=?, username=?, credentials=?,client_id=?,orgid=? WHERE id=?";
	String UPDATE_ROADRUNNER_ORGANISATION = "UPDATE entitlements.organisation SET name = ?";

	static final String DEFAULTTIMEINTERVAL = "DEFAULTTIMEINTERVAL";
	static final String DEFAULTSTARTTIME = "DEFAULTSTARTTIME";
	static final String ORGID = "ORGID";
	static final String ID = "ID";
	List<ProductEntity> getProducts();
//
//	ProductEntity getProduct(int id) throws EntityNotFoundException;
//	ProductEntity getProduct(int id,boolean wCreds) throws EntityNotFoundException;
//	ProductEntity getProductWCreds(int id) throws EntityNotFoundException;
//
//	Product addProduct(Product product);
//
//	boolean updateProduct(int id,Product product);
//
//	boolean deleteProduct(int id);
//
//	boolean isProductName(String name,int orgId);
//
//	List<ProductEntity> getProducts(int orgId);
//
//	List<ProductEntity> getProducts(int orgId, boolean showCred);
//
//	boolean isProductOfType(int productId, String productName);

	//List<ProductEntity> getCenterStoneProducts();

//	ProductEntity getCenterStoneProducts(int orgId) throws EntityNotFoundException;
//
//	boolean isProductNamePresentForId(String name, int orgId,int id);
//	
}
