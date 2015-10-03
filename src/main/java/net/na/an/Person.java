package net.na.an;

public class Person {
	
	int id;
	String fNama;
	String lNama;
	
	public Person(int i, String fName, String lName) {
		this.id=i;
		this.fNama=fName;
		this.lNama=lName;	}

	public String getName() {
		// TODO Auto-generated method stub
		return fNama+" "+lNama;
	}

}
