package net.na.an;

import java.util.List;

public interface PersonDao {

	public List<Person> getAll();

	public Person getById(int i);
}
