package project1;
import java.util.Vector;



public class ContactService {
	
	Vector<Contact> contacts = new Vector<>();
	
	public void addContact(String firstName, String lastName, String phone, String address) {
		String contactId = generateUniqueId();
		
		Contact newContact = new Contact(contactId, firstName, lastName, phone, address);
		
		contacts.add(newContact);
	}
	
	private String generateUniqueId() {
		int id = 0;
		
		while (true) {
			String potentialId = String.valueOf(id);
			boolean exists = false;
			
			for(Contact contact : contacts) {
				if (contact.contactId.equals(potentialId)){
					exists = true;
					break;
				}
			}
			
			if(!exists) {
				return potentialId;
				}
			id++;
			}
			
		}
	
	public void deleteContact(String contactId) {
		contacts.removeIf(contact -> contact.getContactId().equals(contactId));
	}
	
	public void updateFirstName(String contactId, String newFirstName) {
		for (Contact contact : contacts) {
			if (contact.contactId.equals(contactId)) {
				contact.setFirstName(newFirstName);
			}
		}
	}
	
	public void updateLastName(String contactId, String newLastName) {
		for (Contact contact : contacts) {
			if (contact.contactId.equals(contactId)) {
				contact.setLastName(newLastName);
			}
		}
	}
	
	public void updatePhone(String contactId, String newPhone) {
		for (Contact contact : contacts) {
			if (contact.contactId.equals(contactId)) {
				contact.setPhone(newPhone);
			}
		}
	}
	
	public void updateAddress(String contactId, String newAddress) {
		for (Contact contact : contacts) {
			if (contact.contactId.equals(contactId)) {
				contact.setAddress(newAddress);
			}
		}
	}

}
