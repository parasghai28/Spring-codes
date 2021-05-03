package com.paras.springboot.springbootbasics;

import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
	
	@GetMapping("/books")
	public List<Book> getBooks() {
		return Arrays.asList(
				new Book(1l, "Grow Richhh11", "Napolean Hill"), new Book(2l, "physics", "HC verma"));
	}
}
