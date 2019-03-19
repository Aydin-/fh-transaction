package fh.aydin.fhtransaction.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.DeferredResult;

import fh.aydin.fhtransaction.domain.Customer;
import fh.aydin.fhtransaction.service.CustomerInfoService;

@RestController
@RequestMapping("/api")
public class CustomerInfoController {

	@Autowired
	CustomerInfoService customerInfoService;

	@RequestMapping(value = "/client")
	@PreAuthorize("hasAuthority('ADMIN_USER')")
	public DeferredResult<List<Customer>> getClient() {

		DeferredResult<List<Customer>> output = new DeferredResult<>();

		output.setResult(customerInfoService.findAll());

		return output;
	}

	@RequestMapping(value = "/client/{id}")
	@PreAuthorize("hasAuthority('ADMIN_USER')")
	public DeferredResult<Customer> getClient(@PathVariable("id") String id) {

		DeferredResult<Customer> output = new DeferredResult<>();

		customerInfoService.findOne(id).ifPresent(customer -> output.setResult(customer));

		return output;
	}

}
