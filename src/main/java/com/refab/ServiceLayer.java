package com.refab;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import models.Cart;
import models.Images;
import models.Merchants;
import models.Orders;
import models.Products;
import models.Users;
import repository.CartRepos;
import repository.ImageRepos;
import repository.MerchantRepos;
import repository.OrderRepos;
import repository.ProductRepos;
import repository.UserRepos;

@Service
public class ServiceLayer {
	
	private CartRepos cartRepos;
	private MerchantRepos merchantRepos;
	private OrderRepos orderRepos;
	private ProductRepos productRepos;
	private UserRepos userRepos;
	private ImageRepos imageRepos;
	
	@Autowired
	public void setCartRepos(CartRepos cartRepos) {
		this.cartRepos = cartRepos;
	}
	
	@Autowired
	public void setMerchantRepos(MerchantRepos merchantRepos) {
		this.merchantRepos = merchantRepos;
	}
	
	@Autowired
	public void setOrderRepos(OrderRepos orderRepos) {
		this.orderRepos = orderRepos;
	}
	
	@Autowired
	public void setProductRepos(ProductRepos productRepos) {
		this.productRepos = productRepos;
	}
	
	@Autowired
	public void setUserRepos(UserRepos userRepos) {
		this.userRepos = userRepos;
	}
	
	@Autowired
	public void setImageRepos(ImageRepos imageRepos) {
		this.imageRepos = imageRepos;
	}

	public ServiceLayer() 
	{
		
	}
	
	
	//Cart
	public Cart getCart(int id) 
	{
		
		Optional<Cart> x=cartRepos.findById(id);
		Cart y=null;
		
		if(x.isPresent())
		{
			y=x.get();
		}
		else
		{
			y=new Cart();
		}
		return y;
	}
	
	public Cart updateCart(Cart cart) {
		System.out.println("update failure");
		cartRepos.save(cart);
		return cart;
	}
	
	public List<Cart> getAllCart() {
		return cartRepos.findAll();
	}
	
	//Image
	public Images getimage(int id) 
	{
		
		Optional<Images> x=imageRepos.findById(id);
		Images y=null;
		
		if(x.isPresent())
		{
			y=x.get();
		}
		else
		{
			y=new Images();
		}
		return y;
	}
	
	public Images updateImage(Images image) {
		System.out.println("update failure");
		imageRepos.save(image);
		return image;
	}
	
	public List<Images> getAllImage() {
		return imageRepos.findAll();
	}

	
	
	
	
	//Merchants
	public Merchants getMerchant(int id) 
	{
		
		Optional<Merchants> x=merchantRepos.findById(id);
		Merchants y=null;
		
		if(x.isPresent())
		{
			y=x.get();
		}
		else
		{
			y=new Merchants();
		}
		return y;
	}
	
	public Merchants updateMerchant(Merchants merchant) {
		System.out.println("update failure");
		merchantRepos.save(merchant);
		return merchant;
	}
	
	public List<Merchants> getAllMerchant() {
		return merchantRepos.findAll();
	}
	
	//Orders
	public Orders getOrder(int id) 
	{
		
		Optional<Orders> x=orderRepos.findById(id);
		Orders y=null;
		
		if(x.isPresent())
		{
			y=x.get();
		}
		else
		{
			y=new Orders();
		}
		return y;
	}
	
	public Orders updateMerchant(Orders order) {
		System.out.println("update failure");
		orderRepos.save(order);
		return order;
	}
	
	public List<Orders> getAllOrders() {
		return orderRepos.findAll();
	}
	
	//Product
	public Products getProducts(int id) 
	{
		
		Optional<Products> x=productRepos.findById(id);
		Products y=null;
		
		if(x.isPresent())
		{
			y=x.get();
		}
		else
		{
			y=new Products();
		}
		return y;
	}
	
	public Products updateMerchant(Products product) {
		System.out.println("update failure");
		productRepos.save(product);
		return product;
	}
	
	public List<Products> getAllProducts() {
		return productRepos.findAll();
	}
	
	
	//User
	public Users getUsers(int id) 
	{
		
		Optional<Users> x=userRepos.findById(id);
		Users y=null;
		
		if(x.isPresent())
		{
			y=x.get();
		}
		else
		{
			y=new Users();
		}
		return y;
	}
	
	public Users updateUser(Users user) {
		System.out.println("update failure");
		userRepos.save(user);
		return user;
	}
	
	public List<Users> getAllUsers() {
		return userRepos.findAll();
	}

	public Map<String, String> getUserForLogin(String email) {
		
		return userRepos.findUserByName(email);
	}

	public List<Products> searchProduct(String product) {
		
		return productRepos.findProductByName(product);
	}
	
	
}
