public class PatientListImpl implements PatientList {
	private Patient head = null;
	private Patient tail = null;
	
	public void addPatient(Patient newPatient) {
	if (head == null) {
		head = newPatient;
		tail = newPatient;
	}	
	if (head.getNext() == null || head.getNext() == head) {
		head.setNext(newPatient);
		tail = newPatient;
		tail.setNext(head);
	}
	else {
		head.getNext().addPatient(newPatient)
	}
	public boolean deletePatient(Patient newPatient) {
	  if (this.getNext() == patientListStart) {
	  //patient to remove was not found
	  return false;
	} else if (this.getNext().getName().equals(newPatient.getName())) {
	  //We found it! It is the next one!
	  // Now link this patient to the one after the next
	  this.setNext() = getNext().getNext();
	  return true;
	} else {
	  return this.getNext().deletePatient(newPatient);
	  }
	}
	
	public void traverseForward(Patient myPatient) {
		do { System.out.println(myPatient.getName() + ", " + myPatient.getAge() + ", " + myPatient.getIllness());
			myPatient = myPatient.getNext(); }
			 while (myPatient != patientListStart); 
		}
}	