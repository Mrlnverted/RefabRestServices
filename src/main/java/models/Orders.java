package models;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="orders")
public class Orders {

	@Id
	int order_id;
	String status;
	
	@ManyToOne(cascade= CascadeType.ALL)
    @JoinColumn(name = "user_id")
	@JsonBackReference
    private Users user_id;
	
	@ManyToOne(cascade= CascadeType.ALL)
    @JoinColumn(name = "cart_id" /*, insertable = false, updatable = false*/)
	@JsonBackReference
    private Cart cart_id;
	
	
	Date order_date;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public Users getUser_id() {
		return user_id;
	}
	public void setUser_id(Users user_id) {
		this.user_id = user_id;
	}
	public Cart getCart_id() {
		return cart_id;
	}
	public void setCart_id(Cart cart_id) {
		this.cart_id = cart_id;
	}
	
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	

	public Date getOrder_date() {
		return order_date;
	}
	public void setOrder_date(Date order_date) {
		this.order_date = order_date;
	}
	public Orders() {
		
	}
	public Orders(int order_id, String status, Users user_id, Cart cart_id, Date order_date) {
		super();
		this.order_id = order_id;
		this.status = status;
		this.user_id = user_id;
		this.cart_id = cart_id;
		this.order_date = order_date;
	}
	@Override
	public String toString() {
		return "Orders [order_id=" + order_id + ", status=" + status + ", user_id=" + user_id + ", cart_id=" + cart_id
				+ ", order_date=" + order_date + "]";
	}
	
	
	
	
	
	
	
	
}
