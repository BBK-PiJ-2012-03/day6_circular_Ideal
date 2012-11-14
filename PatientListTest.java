import org.junit.*;
import static org.junit.Assert.*;
public class PatientListTest {
	private PatientImpl john;
	private PatientImpl mary;
	private PatientImpl tom;
	private PatientListImpl patientListStart;	
	@Before
	public void buildUp() {
		// A file is created here to be used in every test.
		john = new PatientImpl("John", 35 , "Cancer");
		mary = new PatientImpl("Mary", 22 , "Fever");
		tom = new PatientImpl("Tom", 80 , "HeadAche");
		patientListStart = new PatientListImpl();
	}
	@After
	public void cleanUp() {
		// The file is deleted here, after each test ends
		john = null;
		mary = null;
		tom = null;
	}
	
	@Test
	public void testList() {
		patientListStart.addPatient(john);
		patientListStart.addPatient(mary);
		patientListStart.addPatient(tom);
		
		assertEquals("John", john.getNext().getNext().getNext().getName());
	}

}