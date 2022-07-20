package net.example.spring.repo;
import java.util.List;
import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import net.example.spring.model.Flight;


/*
@Repository
public interface OwnerRepo extends JpaRepository<Owners, Integer> {
	
}
*/
@Repository
public interface Flightrepo extends JpaRepository<Flight, Long>{

	@Transactional 
	@Modifying
	@Query("Select f from Flight f where f.dateOfdeparture= ?1 ")
	
	//void deletebyId(String parseLong);
	
	Optional<List<Flight>> findbydate(String parseLong);
  


}
