package fh.aydin.fhtransaction.repo;

import org.springframework.data.repository.CrudRepository;

import fh.aydin.fhtransaction.domain.Transaction;


public interface TransactionRepository extends CrudRepository<Transaction, Long> {

}
