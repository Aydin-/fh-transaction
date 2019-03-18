package fh.aydin.fhtransaction.service;

import java.util.List;

import  fh.aydin.fhtransaction.domain.Transaction;

public interface TransactionService {

	public List<Transaction> findAll();
}
