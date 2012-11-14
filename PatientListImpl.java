public class PatientListImpl implements PatientList {
	private Patient head = null;
	
	public void addPatient(Patient newPatient) {	
		if (head == null) {
			head = newPatient;
			return;
		}	
		Patient aux = head;
		while (aux.getNext() != null && aux.getNext() != head) {
		aux = aux.getNext();
		}
		aux.setNext(newPatient);
		newPatient.setNext(head);
	}
	
	public boolean deletePatient(Patient newPatient) {
		if (newPatient == head) {
			head = null;
			return true;
		}
		Patient aux = head.getNext();
			
		while (!aux.getName().equals(newPatient.getName()) && aux.getNext() != head) {
				aux = aux.getNext();
		}		
		
		if (aux.getNext() == head) {
			//patient to remove was not found
			return false;
		}	
		else {
			
			aux.setNext(aux.getNext().getNext());
			return true;
		}		
	}	
		
	
	public void traverseForward() {
		Patient current = head;
		System.out.println(head.getName() + ", " + head.getAge() + ", " + head.getIllness());
		current = head.getNext();
	  while (current != null && current != head) {
		System.out.println(current.getName() + ", " + current.getAge() + ", " + current.getIllness());
		current = current.getNext();
	  }
	}  
}	