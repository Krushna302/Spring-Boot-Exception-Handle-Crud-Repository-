package Com.Example.Crud.Exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class AppExceptionController {
	
	
	
	@ExceptionHandler(ExceptionHandlerMsg.class)
	public @ResponseBody ExceptionDataHandleError handleExcepErr(HttpServletRequest request,
			ExceptionHandlerMsg exceptionHandl) {
		
		
		ExceptionDataHandleError exceptiondata = new ExceptionDataHandleError();
		
		exceptiondata.setUrl(request.getRequestURI());
		
		exceptiondata.setErrormsg(exceptionHandl.getMessage());
		
		return exceptiondata;
		

	}
	

}
