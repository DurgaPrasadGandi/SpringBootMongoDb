package com.boot.ws.repo;



import org.springframework.data.mongodb.repository.MongoRepository;

import com.boot.ws.model.Book;

public interface BookRespository extends MongoRepository<Book, String> {
	

	
}
