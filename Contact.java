package project1;
public class Contact {

	final String contactId;
	public String firstName;
	public String lastName;
	public String phone;
	public String address;
	
	
	public Contact(String contactId, String firstName, String lastName, String phone, String address) {
		
		if (contactId == null || contactId.length() > 10) { //Make sure submitted contactId is valid
			throw new IllegalArgumentException("Invalid contact ID");
		}
		this.contactId = contactId;
		
		setFirstName(firstName);
		
		setLastName(lastName);
		
		setPhone(phone);
		
		setAddress(address);
		
	}
	
	public String getContactId() {
		return this.contactId;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public void setFirstName(String firstName) {
		if (firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid first name");
		}
		else this.firstName = firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public void setLastName(String lastName) {
		if (lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid last name");
		}
		else this.lastName = lastName;
	}
	
	public String getPhone() {
		return this.phone;
	}
	
	public void setPhone(String phone) {
		if (phone == null || !phone.matches("\\d{10}")) {
			throw new IllegalArgumentException("Invalid Phone Number");
		}
		else this.phone = phone;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public void setAddress(String address) {
		if (address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid Address");
		}
		else this.address = address;
	}
	
}
