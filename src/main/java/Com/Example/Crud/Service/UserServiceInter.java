package Com.Example.Crud.Service;

import java.util.List;

import Com.Example.Crud.Model.UserRequest;

public interface UserServiceInter {
	
	
	
	
	
	void saveUserRequestData(UserRequest userrequest);
	
	UserRequest getUserRequestData(String uname);
	
	
	 List<UserRequest>  getAllDataUserRequest();
	 
	UserRequest  getfindByAgeGreaterThan(long age);
	 
	 

}
