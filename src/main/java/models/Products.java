package models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="products")
public class Products {

	@Id
	int product_id;
	String name;
	
	@JsonBackReference
	@ManyToOne(cascade= CascadeType.ALL)
    @JoinColumn(name = "merchant_id")
    private Merchants merchant_id;
	
	String price;
	String status;
	String product_type;
	
    @JsonManagedReference
	@ManyToOne(cascade= CascadeType.ALL)
    @JoinColumn(name = "image_id")
    private Images image_id;
	
	String product_brand;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Merchants getMerchant_id() {
		return merchant_id;
	}
	public void setMerchant_id(Merchants merchant_id) {
		this.merchant_id = merchant_id;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getProduct_type() {
		return product_type;
	}
	public void setProduct_type(String product_type) {
		this.product_type = product_type;
	}
	
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	
	public Images getImage_id() {
		return image_id;
	}
	public void setImage_id(Images image_id) {
		this.image_id = image_id;
	}
	
	
	public String getProduct_brand() {
		return product_brand;
	}
	public void setProduct_brand(String product_brand) {
		this.product_brand = product_brand;
	}
	
	public Products() {
		
	}
	public Products(int product_id, String name, Merchants merchant_id, String price, String status,
			String product_type, Images image_id, String product_brand) {
		super();
		this.product_id = product_id;
		this.name = name;
		this.merchant_id = merchant_id;
		this.price = price;
		this.status = status;
		this.product_type = product_type;
		this.image_id = image_id;
		this.product_brand = product_brand;
	}
	@Override
	public String toString() {
		return "Products [product_id=" + product_id + ", name=" + name + ", merchant_id=" + merchant_id + ", price="
				+ price + ", status=" + status + ", product_type=" + product_type + ", image_id=" + image_id
				+ ", product_brand=" + product_brand + "]";
	}
	
	

	
	
}
