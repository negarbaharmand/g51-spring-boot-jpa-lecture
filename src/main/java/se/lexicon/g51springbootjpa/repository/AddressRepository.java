package se.lexicon.g51springbootjpa.repository;

import org.springframework.data.repository.CrudRepository;
import se.lexicon.g51springbootjpa.entity.Address;

public interface AddressRepository extends CrudRepository<Address, Long> {
}
