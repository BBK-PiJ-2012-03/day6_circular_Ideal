public class PatientScript {

	public static void main(String[] args) {
	PatientScript script = new PatientScript();
	script.launch();
	}
 
	public void launch() {
	PatientList patientListStart = new PatientListImpl();
	
	Patient firstPatient = new PatientImpl("John", 33, "Tuberculosis");
	patientListStart.addPatient(firstPatient);
	
	Patient secondPatient = new PatientImpl("Mary", 66, "Meningitis");
	patientListStart.addPatient(secondPatient);

	Patient thirdPatient = new PatientImpl("Tom", 90, "Cancer");
	patientListStart.addPatient(thirdPatient);
	
	Patient forthPatient = new PatientImpl("Dying", 100, "Brain Cancer");
	patientListStart.addPatient(forthPatient);

	Patient fifthPatient = new PatientImpl("Baby", 3, "Fever");
	patientListStart.addPatient(fifthPatient);
	
	
	patientListStart.deletePatient(forthPatient);
	patientListStart.traverseForward();
	}
}	