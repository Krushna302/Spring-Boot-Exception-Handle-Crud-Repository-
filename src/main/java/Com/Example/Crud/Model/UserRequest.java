package Com.Example.Crud.Model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class UserRequest {
	
	
	@Id
	private int id;
	
	private String uname;
	
	private String pass;
	
	private long age;
	
	private String startDate;
	
	private String endDate;
	
	private String address;

	
	
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public long getAge() {
		return age;
	}

	public void setAge(long age) {
		this.age = age;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
	
	
	@Override
	public String toString() {
		return "UserRequest [id=" + id + ", uname=" + uname + ", pass=" + pass + ", age=" + age + ", startDate="
				+ startDate + ", endDate=" + endDate + ", address=" + address + "]";
	}
	
	
	
	
	
	
	
}