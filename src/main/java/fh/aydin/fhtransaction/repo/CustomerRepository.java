package fh.aydin.fhtransaction.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fh.aydin.fhtransaction.domain.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
