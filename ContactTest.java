package project1;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



public class ContactTest {
	
	private String testId = "01";
	private String testFirstName = "Billy";
	private String testLastName = "Bob";
	private String testPhoneNumber = "5551234567";
	private String testAddress = "123 Test Address";

	@Test
	public void testContact() {
		Contact testContact = new Contact(testId, testFirstName, testLastName, testPhoneNumber, testAddress);
		assertTrue(testContact.getContactId().equals(testId));
		assertTrue(testContact.getFirstName().equals(testFirstName));
		assertTrue(testContact.getLastName().equals(testLastName));
		assertTrue(testContact.getPhone().equals(testPhoneNumber));
		assertTrue(testContact.getAddress().equals(testAddress));
	}
	
	@Test
	public void testNullId() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, "Billy", "Bob", "5552124437", "1234 Test Address");
		});
	}
	
	@Test
	public void testIdTooLong() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("01234567890", "Billy", "Bob", "5552124437", "1234 Test Address");
		});
	}
	
	@Test
	public void testNullFirstName() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("01", null, "Bob", "5552124437", "1234 Test Address");
		});
	}
	
	@Test
	public void testFirstNameTooLong() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "BillyBobJohn", "James", "1234567890", "1234 test");
		});
	}
	
	@Test
	public void testNullLastName() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("01", "Billy", null, "5552124437", "1234 Test Address");
		});
	}
	
	@Test
	public void testLastNameTooLong() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "James", "BillyBobJohn", "1234567890", "1234 test");
		});
	}
	
	@Test
	public void testNullPhone() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("01", "Billy", "Bob", null, "1234 Test Address");
		});
	}
	
	@Test
	public void testPhoneTooShort() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "Billy", "Bob", "2", "1234 Test");
		});
	}
	@Test
	public void testPhoneTooLong() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "Billy", "Bob", "01234567890", "1234 Test");
		});
	}
	
	@Test
	public void testNullAddress() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("01", "Billy", "Bob", "5552124437", null);
		});
	}
	
	@Test
	public void testAddressTooLong() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "Billy", "Bob", "0123456789", "0123456789 Test Address that may or may not throw and error because its too long");
		});
	}

}
