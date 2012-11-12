public interface Patient {

//gets a Patient's name
	
	String getName();
	
//gets a Patient's age
	
	int getAge();
	
//gets a Patient's illness

	String getIllness();
	
//gets a Patient's nextPatient

	Patient getNext() ;
		
	
//sets a Patient's nextPatient

	void setNext(Patient newPatient);	


	
}