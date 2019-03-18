package fh.aydin.fhtransaction.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.DeferredResult;

import fh.aydin.fhtransaction.domain.Customer;
import fh.aydin.fhtransaction.service.TransactionService;

@RestController
@RequestMapping("/api")
public class CustomerInfoController {

	@Autowired
	TransactionService transactionService;

	@RequestMapping(value = "/client")
	@PreAuthorize("hasAuthority('ADMIN_USER')")
	public DeferredResult<Customer> getClient() {
	    DeferredResult<Customer> output = new DeferredResult<>();
	    output.setResult(new Customer());
		return output;
	}

}
