package fh.aydin.fhtransaction.service;

import java.util.List;
import java.util.Optional;

import fh.aydin.fhtransaction.domain.Customer;

public interface CustomerInfoService {

	public List<Customer> findAll();

	public Optional<Customer> findOne(String id);
}
