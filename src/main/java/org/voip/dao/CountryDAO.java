package org.voip.dao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.voip.model.Country;

@Repository
public interface CountryDAO extends CrudRepository<Country,Long>{

}
