package bd.pai_dto.repositories;

import bd.pai_dto.domain.Address;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {

}
