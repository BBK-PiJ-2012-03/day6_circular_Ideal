import org.junit.*;
import static org.junit.Assert.*;
public class PatientTest {
	private PatientImpl myPatient;
	private PatientImpl myPatient2;
	
	
	@Before
	public void buildUp() {
		// A file is created here to be used in every test.
		myPatient = new PatientImpl("John", 35 , "Cancer");
		myPatient2 = new PatientImpl("Mary", 22 , "Fever");
	}
	@After
	public void cleanUp() {
		// The file is deleted here, after each test ends
		myPatient = null;
		myPatient2 = null;
	}
	
	@Test
	public void testPatient() {
		assertEquals("John", myPatient.getName());
		assertEquals("Cancer", myPatient.getIllness());
		assertEquals(35, myPatient.getAge());
	}

	@Test
	public void testNextPatient() {
		myPatient.setNext(myPatient2);
		assertEquals("Mary", myPatient.getNext().getName());
	}
	
	
}