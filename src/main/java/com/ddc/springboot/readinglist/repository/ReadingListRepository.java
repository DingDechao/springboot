package com.ddc.springboot.readinglist.repository;

import com.ddc.springboot.readinglist.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReadingListRepository extends JpaRepository<Book, Long> {
	
	List<Book> findByReader(String reader);

}
