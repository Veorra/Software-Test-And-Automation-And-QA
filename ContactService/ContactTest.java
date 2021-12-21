import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContactTest {
	//test ContactID
	@Test
	void testContactIDTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class,() ->{
			new Contact("1234567890000","Chance","Salem","7145551234","678 Fake Road");}
		);
		}
	@Test
	void testContactIDNull() {
		Assertions.assertThrows(IllegalArgumentException.class,() ->{
			new Contact(null,"Chance","Salem", "7145551234","678");}
		);
		}
	//test firstName
	@Test
	void testFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class,() ->{
			new Contact("1234567890","Chance","Salem","7145551234","678 Fake Road");}
		);
		}
	@Test
	void testFirstNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class,() ->{
			new Contact("1234567890",null,"Salem", "7145551234","678 Fake Road");}
		);
		}
	//test lastName
	@Test
	void testLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class,() ->{
			new Contact("1234567890","Chance","Salem","7145551234","678 Fake Road");}
		);
		}
	@Test
	void testLastNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class,() ->{
	new Contact("1234567890","Chance",null, "7145551234","678 Fake Road");}
		);
		}
	//test phoneNumber
	@Test
	void testPhoneNumberTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class,() ->{
			new Contact("1234567890","Chance","OPants","7145551234888","678 Fake Road");}
		);
		}
	@Test
	void testPhoneNumberNull() {
		Assertions.assertThrows(IllegalArgumentException.class,() ->{
			new Contact("1234567890","Chance","Salem",null,"678 Fake Road");}
		);
		}
	//test address
	@Test
	void testAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class,() ->{
			new Contact("1234567890","Chance","Salem","7145551234","678 Fake Road CA 9062145667");}
		);
		}
	@Test
	void testAddressNull() {
		Assertions.assertThrows(IllegalArgumentException.class,() ->{
			new Contact("1234567890","Chance","Salem","7145551234",null);}
		);
		}
	}