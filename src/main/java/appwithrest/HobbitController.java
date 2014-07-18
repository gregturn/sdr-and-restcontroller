package appwithrest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HobbitController {

	private final PersonRepository repository;

	@Autowired
	public HobbitController(PersonRepository repository) {
		this.repository = repository;
	}

	@RequestMapping("/hobbit/{name}")
	public Person hobbit(@PathVariable String name) {
		return repository.findByFirstName(name);
	}

}
