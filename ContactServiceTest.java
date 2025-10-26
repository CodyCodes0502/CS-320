package project1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactServiceTest {

	@Test
	void testAddContact() {
		ContactService cs = new ContactService();
		
		assertEquals(0, cs.contacts.size());
		cs.addContact("Billy", "Bob", "0123456789", "1234 Test");
		assertEquals(1, cs.contacts.size());
	}
	
	@Test
	void testDeleteContact() {
		ContactService cs = new ContactService();
		
		cs.addContact("Billy", "Bob", "0123456789", "1234 Test");
		assertEquals(1, cs.contacts.size());
		
		String contactId = cs.contacts.firstElement().getContactId();
		cs.deleteContact(contactId);
		
		assertEquals(0, cs.contacts.size());
		
	}
	
	@Test
	void testUpdateFirstName() {
		ContactService cs = new ContactService();
		
		cs.addContact("Billy", "Bob", "0123456789", "1234 Test");
		String contactId = cs.contacts.firstElement().getContactId();
		cs.updateFirstName(contactId, "Jeff");
		
		assertEquals(cs.contacts.firstElement().getFirstName(), "Jeff");
	}
	
	@Test
	void testUpdateLastName() {
		ContactService cs = new ContactService();
		
		cs.addContact("Billy", "Bob", "0123456789", "1234 Test");
		String contactId = cs.contacts.firstElement().getContactId();
		cs.updateLastName(contactId, "Jeff");
		
		assertEquals(cs.contacts.firstElement().getLastName(), "Jeff");
	}
	
	@Test
	void testUpdatePhone() {
		ContactService cs = new ContactService();
		
		cs.addContact("Billy", "Bob", "0123456789", "1234 Test");
		String contactId = cs.contacts.firstElement().getContactId();
		cs.updatePhone(contactId, "9876543210");
		
		assertEquals(cs.contacts.firstElement().getPhone(), "9876543210");
	}
	
	@Test
	void testUpdateAddress() {
		ContactService cs = new ContactService();
		
		cs.addContact("Billy", "Bob", "0123456789", "1234 Test");
		String contactId = cs.contacts.firstElement().getContactId();
		cs.updateAddress(contactId, "6789 New Test");
		
		assertEquals(cs.contacts.firstElement().getAddress(), "6789 New Test");
	}

}
