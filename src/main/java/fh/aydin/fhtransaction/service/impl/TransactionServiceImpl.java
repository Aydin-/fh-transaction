package fh.aydin.fhtransaction.service.impl;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fh.aydin.fhtransaction.domain.Transaction;
import fh.aydin.fhtransaction.repo.TransactionRepository;
import fh.aydin.fhtransaction.service.TransactionService;

@Service
public class TransactionServiceImpl implements TransactionService{

	@Autowired
	TransactionRepository repo;
	
	@Override
	public List<Transaction> findAll() {
		// TODO Auto-generated method stub
		return (List<Transaction>) repo.findAll();
	}

}
