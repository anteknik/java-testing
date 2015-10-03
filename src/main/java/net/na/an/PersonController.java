package net.na.an;

public class PersonController {

	private PersonDao dao;

	public PersonController(PersonDao dao) {
		this.dao = dao;
	}

	/** 
	 * Again, this could more realistically be done in the data 
	 * layer with a "Where" clause...
	 */
	public boolean checkIfPersonExists(String firstName, String lastName) {
		for (Person candidate : dao.getAll()) {
			if (firstName.equals(candidate.getName()) &&
				lastName.equals(candidate.getName())) {
					return true;
				}
		}
		return false;
	}

	/** Simple delegation method to find a person by Id */
	public Person findPersonById(int i) {
		return dao.getById(i);
	}

}
