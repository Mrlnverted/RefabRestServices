package com.refab;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import models.Cart;
import models.Images;
import models.Merchants;
import models.Orders;
import models.Products;
import models.Users;

@CrossOrigin(origins = "*")
@RestController
public class RestControl {

	private ServiceLayer obj1;

	@Autowired
	public void setObj1(ServiceLayer obj1) {
		this.obj1 = obj1;
	}
	
	//Cart
	@GetMapping("/cart/{id}")
	public Cart GetCart(@PathVariable(required = true)int id)//assume single select
	{
		Cart i =obj1.getCart(id);
		return i;
		
	}
	
	@PostMapping(value="/cart/upd")
	public Cart UpdateCart(@RequestBody Cart cart)//assume single select
	{
		Cart m =obj1.updateCart(cart);
		return m;
		
	}
	
	
	//Images
	@GetMapping("/image/{id}")
	public Images GetImage(@PathVariable(required = true)int id)//assume single select
	{
		Images i =obj1.getimage(id);
		return i;
		
	}
	
	@PostMapping(value="/image/upd")
	public Images UpdateImage(@RequestBody Images image)//assume single select
	{
		Images m =obj1.updateImage(image);
		return m;	
	}
	
	@GetMapping("/image")
	public List<Images> GetAllImages()
	{
		List<Images> x =obj1.getAllImage();
		return x;
	}

	
	
	
	//Merchant
	@GetMapping("/merchant/{id}")
	public Merchants GetMerchant(@PathVariable(required = true)int id)//assume single select
	{
		Merchants i =obj1.getMerchant(id);
		return i;
		
	}
	
	@PostMapping(value="/merchant/upd")
	public Merchants UpdateMerchant(@RequestBody Merchants merchant)//assume single select
	{
		Merchants m =obj1.updateMerchant(merchant);
		return m;	
	}
	
	@GetMapping("/merchant")
	public List<Merchants> GetAllMerchants()
	{
		List<Merchants> x =obj1.getAllMerchant();
		return x;
	}
	
	
	
	//Order
		@GetMapping("/order/{id}")
		public Orders GetOrder(@PathVariable(required = true)int id)//assume single select
		{
			Orders i =obj1.getOrder(id);
			return i;
			
		}
		
		@PostMapping(value="/order/upd")
		public Orders UpdateOrder(@RequestBody Orders order)//assume single select
		{
			Orders m =obj1.updateMerchant(order);
			return m;	
		}
		
		@GetMapping("/order")
		public List<Orders> GetAllOrders()
		{
			List<Orders> x =obj1.getAllOrders();
			return x;
		}
		
		//Products
		@GetMapping("/product/{id}")
		public Products GetProduct(@PathVariable(required = true)int id)//assume single select
		{
			Products i =obj1.getProducts(id);
			return i;
			
		}
		
		@PostMapping(value="/product/upd")
		public Products UpdateProduct(@RequestBody Products product)//assume single select
		{
			Products m =obj1.updateMerchant(product);
			return m;	
		}
		
		@GetMapping("/product")
		public List<Products> GetAllProducts()
		{
			List<Products> x =obj1.getAllProducts();
			return x;
		}
		
		//User
		@GetMapping("/user/{id}")
		public Users GetUser(@PathVariable(required = true)int id)//assume single select
		{
			Users i =obj1.getUsers(id);
			return i;
			
		}
		
		@PostMapping(value="/user/upd")
		public Users UpdateUser(@RequestBody Users user)//assume single select
		{
			Users m =obj1.updateUser(user);
			return m;	
		}
		
		@GetMapping("/user")
		public List<Users> GetAllUsers()
		{
			List<Users> x =obj1.getAllUsers();
			return x;
		}

		@GetMapping("login/{email}")
		public Map<String,String> getLogin(@PathVariable(required = true)String email)
		{
			Map<String,String> x =obj1.getUserForLogin(email);
			return x;
		}
		
		@GetMapping("search/{product}")
		public List<Products> SearchProduct(@PathVariable(required=true) String product)
		{
			List<Products> x=obj1.searchProduct(product);
			return x;
		}
		
	
}
