package Com.Example.Crud.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import Com.Example.Crud.Model.UserRequest;
import Com.Example.Crud.Service.UserServiceInter;

@RestController
public class UserRequestController {
	
	
	
	@Autowired
	private UserServiceInter userServiceInter ;
	
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
 public ResponseEntity<String> saveUserRequest(@RequestBody UserRequest userrequest){
			
			System.out.println("Check User Request Data :-"+userrequest);
			
			userServiceInter.saveUserRequestData(userrequest);
		
		return new  ResponseEntity<String>("Data Stored", HttpStatus.CREATED);
		
	}
	
	
	@RequestMapping(value="/get/{uname}",method=RequestMethod.GET)
	public ResponseEntity<UserRequest> getUserRequestData(@PathVariable String uname){
		
		System.out.println("Check UserName Data :-"+uname);
		
	UserRequest userrequest =	userServiceInter.getUserRequestData(uname);
	
		return new ResponseEntity<UserRequest>(userrequest, HttpStatus.OK);
		
	}
	
	
	
	
	@RequestMapping(value="/getAll")
	public  List<UserRequest> getAllDataUserRequest(){
	
	List<UserRequest> list = userServiceInter.getAllDataUserRequest();

	return list;
			
	}
	
	
	@RequestMapping(value="/age/{age}",method = RequestMethod.GET)
	public ResponseEntity <UserRequest> getfindByAgeGreaterThan(@PathVariable long age){
		
		System.out.println("Get UserRequest Data By Age Greater Than :-" +age);
		
		UserRequest list =	userServiceInter.getfindByAgeGreaterThan(age);
		
		return new ResponseEntity<UserRequest>(list, HttpStatus.OK);
		
	}
	
	
	
	
		
	}
	
		
	
	


