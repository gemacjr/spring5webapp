package com.swiftbeard.spring5webapp.repositories;

import com.swiftbeard.spring5webapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by eddie on 3/14/19.
 */
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
