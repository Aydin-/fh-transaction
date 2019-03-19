package fh.aydin.fhtransaction.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fh.aydin.fhtransaction.domain.Customer;
import fh.aydin.fhtransaction.repo.CustomerRepository;
import fh.aydin.fhtransaction.service.CustomerInfoService;

@Service
public class CustomerInfoServiceImpl implements CustomerInfoService {

	@Autowired
	CustomerRepository repo;
	
	@Override
	public List<Customer> findAll() {
		// TODO Auto-generated method stub
		return (List<Customer>) repo.findAll();
	}

}
