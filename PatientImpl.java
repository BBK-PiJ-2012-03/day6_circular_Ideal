public class PatientImpl implements Patient {
	private String name;
	private int age;
	private String illness;
	private Patient nextPatient = null;
	
	public PatientImpl(String name, int age, String illness) {
	this.name = name;
	this.age = age;
	this.illness = illness;
	this.nextPatient = null;
	}
	
	public String getName() {
	return name;
	}
	
	public int getAge() {
	return age;
	}
	
	public String getIllness() {
	return illness;
	}
	
	public Patient getNext() {
	return nextPatient;
	}
	
	public void setNext(Patient newPatient) {
	this.nextPatient = newPatient;
	return;
	}
	
	
}	
	