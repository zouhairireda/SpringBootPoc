package pocs.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import pocs.model.Price;

public interface PriceRepository extends MongoRepository<Price, String> {

}
