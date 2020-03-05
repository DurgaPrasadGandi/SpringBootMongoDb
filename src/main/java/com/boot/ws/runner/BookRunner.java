package com.boot.ws.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.boot.ws.model.Book;
import com.boot.ws.repo.BookRespository;
@Component
public class BookRunner implements CommandLineRunner {
	@Autowired
	private BookRespository repo;

	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repo.deleteAll();
		Integer id=repo.save(new Book(1,"corejava",100.0)).getBookId();
		repo.save(new Book(2,"hibernate",200.0));
		repo.save(new Book(3,"boot",500.0));
		repo.save(new Book(4,"Spring",400.0));
		repo.findAll().forEach(System.out::println);
		 
	}

}
