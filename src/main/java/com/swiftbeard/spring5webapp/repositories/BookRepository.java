package com.swiftbeard.spring5webapp.repositories;

import com.swiftbeard.spring5webapp.model.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by eddie on 3/14/19.
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}
