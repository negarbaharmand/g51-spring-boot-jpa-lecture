package se.lexicon.g51springbootjpa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import se.lexicon.g51springbootjpa.entity.Address;

@Repository
public interface AddressRepository extends CrudRepository<Address, Long> {
    //Todo : Add more methods
}
