package bean;

public class Customer {
	private String customerId;
	private String name;
	private String phoneNum;
	private String address;
	
	
	public Customer() {
		
	}


	public Customer(String customerId, String name, String phoneNum, String address) {
		this.customerId = customerId;
		this.name = name;
		this.phoneNum = phoneNum;
		this.address = address;
	}


	public String getId() {
		return customerId;
	}


	public void setId(String id) {
		this.customerId = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPhoneNum() {
		return phoneNum;
	}


	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Customer [id=" + customerId + ", name=" + name + ", phoneNum=" + phoneNum + ", address=" + address + "]";
	}
}
