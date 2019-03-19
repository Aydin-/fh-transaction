package fh.aydin.fhtransaction.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fh.aydin.fhtransaction.domain.Customer;
import fh.aydin.fhtransaction.repo.CustomerInfo;
import fh.aydin.fhtransaction.service.CustomerInfoService;

@Service
public class CustomerInfoServiceImpl implements CustomerInfoService {

	@Autowired
	CustomerInfo repo;
	
	@Override
	public List<Customer> findAll() {
		// TODO Auto-generated method stub
		return (List<Customer>) repo.findAll();
	}

	@Override
	public Optional<Customer> findOne(String id) {
		// TODO Auto-generated method stub
		return repo.findById(Long.parseLong(id));
	}

}
