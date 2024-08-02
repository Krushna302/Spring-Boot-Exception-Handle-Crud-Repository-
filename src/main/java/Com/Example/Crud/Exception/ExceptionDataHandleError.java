package Com.Example.Crud.Exception;



public class ExceptionDataHandleError {
	
	
	
	
	private String url;
	
	private String errormsg;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getErrormsg() {
		return errormsg;
	}

	public void setErrormsg(String errormsg) {
		this.errormsg = errormsg;
	}

	
	
	
	
	
	@Override
	public String toString() {
		return "ExceptionDataHandleError [url=" + url + ", errormsg=" + errormsg + "]";
	}
	
	
	
	
	
	
	

}
