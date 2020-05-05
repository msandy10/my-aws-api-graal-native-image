package my.aws.api.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.micronaut.core.annotation.Introspected;

@Introspected
@JsonIgnoreProperties(ignoreUnknown = true)
public class EntityLoadFrequency {
	
	private int id;
	
	@Min(value = 1, message = "productId should be greater than zero")
    @Max(value = Integer.MAX_VALUE, message = "productId should not to large")
	private int productId;
	
	@NotBlank(message = "entity cannot be blank")
	private String entity;
	
	@Pattern(regexp = "^([1-9]|0[0-9]|1[0-9]|2[0-3]):([1-9]|[0-5][0-9])$", message = "interval should be Valid format HH:MM format")
	private String interval;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getEntity() {
		return entity;
	}
	public void setEntity(String entity) {
		this.entity = entity;
	}
	public String getInterval() {
		return interval;
	}
	public void setInterval(String interval) {
		this.interval = interval;
	}
}
