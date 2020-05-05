package my.aws.api.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class ProductRowMapper implements RowMapper<ProductEntity> {

	boolean showCredentials = false;
	public ProductRowMapper(){
		super();		
	}
	
	public ProductRowMapper(boolean showCredentials){
		super();		
		this.showCredentials = showCredentials;
	}
	
	@Override
	public ProductEntity mapRow(ResultSet row, int rowNum) throws SQLException {
		ProductEntity product = new ProductEntity();
		product.setId(row.getInt("ID"));
		product.setName(row.getString("NAME"));
		product.setUrl(row.getString("URL"));
		product.setDbName(row.getString("DBNAME"));
		product.setClientId(row.getString("CLIENT_ID"));
		Organisation org= new Organisation();
		org.setOrgId(row.getInt("ORGID"));
		org.setOrgName(row.getString("ORGNAME"));
		product.setOrg(org);
		License license = new License();
		license.setId(row.getInt("LICENSEID"));
		license.setLicenseKey(row.getString("LICENSEKEY"));
		license.setStartDate(row.getDate("STARTDATE"));
		license.setEndDate(row.getDate("ENDDATE"));
		product.setLicense(license);
		
		if(showCredentials) {
			product.setUsername(row.getString("USERNAME"));
			product.setCredentials(row.getString("CREDENTIALS"));
		}
		
		
		return product;
	}

}
