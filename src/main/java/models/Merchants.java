package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="merchants")
public class Merchants {

	@Id
	int merchant_id;
	String merchant_name;
	String merchant_address;
	
	
	public int getMerchant_id() {
		return merchant_id;
	}
	public void setMerchant_id(int merchant_id) {
		this.merchant_id = merchant_id;
	}
	public String getMerchant_name() {
		return merchant_name;
	}
	public void setMerchant_name(String merchant_name) {
		this.merchant_name = merchant_name;
	}
	public String getMerchant_address() {
		return merchant_address;
	}
	public void setMerchant_address(String merchant_address) {
		this.merchant_address = merchant_address;
	}
	
	
	public Merchants(int merchant_id, String merchant_name, String merchant_address) {
		super();
		this.merchant_id = merchant_id;
		this.merchant_name = merchant_name;
		this.merchant_address = merchant_address;
	}
	public Merchants() {
		
	}
	@Override
	public String toString() {
		return "Merchants [merchant_id=" + merchant_id + ", merchant_name=" + merchant_name + ", merchant_address="
				+ merchant_address + "]";
	}

	
	
}
