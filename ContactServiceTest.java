import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ContactServiceTest {

	@Test
	public void testAdd(){
		ContactService cs = new ContactService();
		Contact test1 = new Contact("1412352", "Jane", "Doe", "1111111111", "Sample 10 Road");
		assertEquals(true, cs.addContact(test1));
		}
	@Test
	public void testDelete()
	{
		ContactService cs = new ContactService();
		Contact test1 = new Contact("1413252", "Jane", "Doe", "1111111111", "Sample 10 Road");
		Contact test2 = new Contact("1309403", "David", "King", "2187123404", "Cyber City");
		Contact test3 = new Contact("9752319", "Jill", "Snow", "9215501793", "Landworks");

		cs.addContact(test1);
		cs.addContact(test2);
		cs.addContact(test3);

		assertEquals(true, cs.deleteContact("1309403"));
		assertEquals(false, cs.deleteContact("1309404"));
		assertEquals(false, cs.deleteContact("1309403"));
		}

	@Test
	public void testUpdate()
	{
		ContactService cs = new ContactService();
     
		Contact test1 = new Contact("1413252", "Jane", "Doe", "111111111", "Sample 10 Road");
		Contact test2 = new Contact("1309403", "David", "King", "2187123404", "Cyber City");
		Contact test3 = new Contact("9752319", "Jill", "Snow", "9215501793", "Landworks");

		cs.addContact(test1);
		cs.addContact(test2);
		cs.addContact(test3);

		assertEquals(true, cs.updateContact("9752319", "King", "Snow", "9215501793", "Landworks"));
		assertEquals(false, cs.updateContact("9752322", "King", "Snow", "9215501793", "Landworks"));
		}
	}