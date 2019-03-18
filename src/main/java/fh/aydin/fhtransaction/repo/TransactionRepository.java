package fh.aydin.fhtransaction.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fh.aydin.fhtransaction.domain.Transaction;

@Repository
public interface TransactionRepository extends CrudRepository<Transaction, Long> {

}
