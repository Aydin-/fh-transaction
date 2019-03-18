package fh.aydin.fhtransaction.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fh.aydin.fhtransaction.domain.Transaction;
import fh.aydin.fhtransaction.service.TransactionService;

@RestController
@RequestMapping("/api")
public class TransactionController {

	@Autowired
	TransactionService transactionService;

	@RequestMapping(value = "/transactions")
	public List<Transaction> getTransactions() {
		return transactionService.findAll();
	}

}
