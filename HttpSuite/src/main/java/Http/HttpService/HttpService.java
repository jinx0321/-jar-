package Http.HttpService;

import org.junit.Test;

import Http.Request.HttpRequest;
import Http.Request.Param.form;

public class HttpService {
	

	public void HttpStart(){
		System.out.println("Http��������");
		System.out.println("HttpUrl����");
		System.out.println("HttpHeader����");
		System.out.println("HttpCookie����");
		System.out.println("Httpcan��������");
		
	}
	
	@Test
	public void test() {
		HttpRequest hr=new HttpRequest("http://www.scbc.test/system/check_login.htm");
		form f=new form();
		hr.post(f,"utf-8");
	}

}
