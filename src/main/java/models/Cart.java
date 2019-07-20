package models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="cart")
public class Cart {


	@Id
    int cart_id;
	
	@ManyToOne(cascade= CascadeType.ALL)
    @JoinColumn(name = "product_id", insertable = false, updatable = false)
	@JsonBackReference
    private Products product_id;
	
	
	int quantity;
	
	

	public Products getProduct_id() {
		return product_id;
	}
	public void setProduct_id(Products product_id) {
		this.product_id = product_id;
	}
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	public Cart(int cart_id, Products product_id, int quantity) {
		super();
		this.cart_id = cart_id;
		this.product_id = product_id;
		this.quantity = quantity;
	}
	public Cart() {
		
	}
	@Override
	public String toString() {
		return "Cart [cart_id=" + cart_id + ", product_id=" + product_id + ", quantity=" + quantity + "]";
	}
	
	
}
