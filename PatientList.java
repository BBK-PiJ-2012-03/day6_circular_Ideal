public interface PatientList {

//adds a Patient to the list

	void addPatient(Patient newPatient);
	
	
//deletes a Patient from the list

	boolean deletePatient(Patient newPatient); 
	
//Prints the list from the beggining to the end

	void traverseForward(); 	
}	