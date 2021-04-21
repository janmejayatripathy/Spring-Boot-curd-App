package com.tpl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tpl.entity.Product;
import com.tpl.serviceImpl.ProductService;

@RestController
@RequestMapping("/Product")
public class ProductController {

	@Autowired
	private ProductService service;

	@PostMapping( value="/addProduct" ,consumes= {"application/json","application/xml"},
			produces= {"application/json","application/xml"})
	public Product addProduct(@RequestBody Product product) {
		return service.saveProduct(product);
	}

	@PostMapping(value="/addProducts",consumes= {"application/json","application/xml"},
			produces= {"application/json","application/xml"})
	public List<Product> addProducts(@RequestBody List<Product> products) {
		return service.saveProducts(products);
	}

//    @GetMapping("/products")
//    public List<Product> findAllProducts() {
//        return service.getProducts();
//    }
//
//    @GetMapping("/productById/{id}")
//    public Product findProductById(@PathVariable int id) {
//        return service.getProductById(id);
//    }
	@GetMapping("/products")
	public ResponseEntity<List<Product>> findAllProducts() {
		return ResponseEntity.status(HttpStatus.OK).body(service.getProducts());
	}

	@GetMapping(value = "/productById/{id}", produces = "application/json")
	public ResponseEntity findProductById(@PathVariable int id) {
		if (id == id) {
			Product p = service.getProductById(id);
			return new ResponseEntity<Product>(p, HttpStatus.OK);
		} else {
			 return new ResponseEntity( HttpStatus.NOT_FOUND) ;
		}
		// return ResponseEntity.status(HttpStatus.OK).body(service.getProductById(id));
	}

	@GetMapping("/product/{name}")
	public Product findProductByName(@PathVariable String name) {
		return service.getProductByName(name);
	}

	@PutMapping("/update")
	public Product updateProduct(@RequestBody Product product) {
		return service.updateProduct(product);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteProduct(@PathVariable int id) {
		return service.deleteProduct(id);
	}
	@DeleteMapping("/delete/{id}")
	public String deleteProduct12354465(@PathVariable int id) {
		return service.deleteProduct(id);
	}
	
}
