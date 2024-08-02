package Com.Example.Crud.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Com.Example.Crud.Exception.ExceptionHandlerMsg;
import Com.Example.Crud.Model.UserRequest;
import Com.Example.Crud.Repo.UserRepository;

@Service
public class UserServiceImp  implements UserServiceInter{

	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void saveUserRequestData(UserRequest userrequest) {
	
		userRepository.save(userrequest);

	}

	@Override
	public UserRequest getUserRequestData(String uname) {
		
		
		UserRequest userrequest =null;
		
		try {
		
	 userrequest = userRepository.findByUname(uname);
		System.out.println(userrequest.getUname());   // Create Error...NullPointerException
		}
		
		catch (Exception e) {
			
				System.out.println(e.getMessage());
				
		throw new ExceptionHandlerMsg("Invalid UserName Please Check ");
			
		}
		
		
		return userrequest;
	}

	@Override
	public List<UserRequest> getAllDataUserRequest() {
		
		System.out.println("Get All UserRequest Data :-");
		
		List<UserRequest> list = (List<UserRequest>) userRepository.findAll();
		
		
		
		return list;
	}

	@Override
	public UserRequest getfindByAgeGreaterThan(long age) {
		
		System.out.println(" Custom Method Get By Age UserRequest Greater Than :-"+age);
		
		UserRequest list = userRepository.findByAgeGreaterThan(age);
		
		
		return list;

	}

	
	 
		
	}

	

