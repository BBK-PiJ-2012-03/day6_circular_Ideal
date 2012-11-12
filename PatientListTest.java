import org.junit.*;
import static org.junit.Assert.*;
public class PatientListTest {
	private PatientImpl myPatient;
	private PatientImpl myPatient2;
	private PatientImpl myPatient3;
	private PatientListImpl patientListStart;	
@Before
	public void buildUp() {
	// A file is created here to be used in every test.
	myPatient = new PatientImpl("John", 35 , "Cancer");
	myPatient2 = new PatientImpl("Mary", 22 , "Fever");
	myPatient3 = new PatientImpl("Tom", 80 , "HeadAche");
	patientListStart = new PatientListImpl();
	}
@After
	public void cleanUp() {
	// The file is deleted here, after each test ends
	myPatient = null;
	myPatient2 = null;
	myPatient3 = null;
	}
	
@Test
	public void testList() {
		patientListStart = myPatient;
		
		patientListStart.addPatient(myPatient2);
		patientListStart.addPatient(myPatient3);
		
		assertEquals("Tom", patientListStart.getNext().getNext().getName());
	}

}