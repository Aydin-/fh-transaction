package fh.aydin.fhtransaction.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.DeferredResult;

import fh.aydin.fhtransaction.domain.Transaction;
import fh.aydin.fhtransaction.service.TransactionService;

@RestController
@RequestMapping("/api")
public class TransactionController {

	@Autowired
	TransactionService transactionService;

	@RequestMapping(value = "/transactions")
	@PreAuthorize("hasAuthority('ADMIN_USER')")
	public DeferredResult<List<Transaction>> getTransactions() {
		DeferredResult<List<Transaction>> output = new DeferredResult<>();
	    output.setResult(transactionService.findAll());
		return output;
	}

}
