package appwithrest;

import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long> {

	public Person findByFirstName(String firstName);

}
