package com.tpl.service;

import java.util.List;

import com.tpl.entity.Product;

public interface ProductServiceImpl {
	public Product saveProduct(Product product);

	public List<Product> saveProducts(List<Product> products);

	public List<Product> getProducts();

	public Product getProductById(int id);

	public Product getProductByName(String name);

	public String deleteProduct(int id);

	public Product updateProduct(Product product);
}
