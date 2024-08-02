package Com.Example.Crud.Repo;

import org.springframework.data.repository.CrudRepository;

import Com.Example.Crud.Model.UserRequest;

public interface UserRepository extends CrudRepository<UserRequest, Integer> {
	
	
	
	UserRequest findByUname(String uname);
	
	UserRequest findById(int id);
	
	UserRequest findByAgeGreaterThan (long age);
	
	

}
