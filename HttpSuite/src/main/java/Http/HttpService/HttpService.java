package Http.HttpService;

import org.junit.Test;

import Http.Request.HttpRequest;
import Http.Request.Param.form;

public class HttpService {
	

	public void HttpStart(){
		System.out.println("Http容器启动");
		System.out.println("HttpUrl设置");
		System.out.println("HttpHeader设置");
		System.out.println("HttpCookie设置");
		System.out.println("Httpcan参数设置");
		
	}
	
	@Test
	public void test() {
		HttpRequest hr=new HttpRequest("http://www.scbc.test/system/check_login.htm");
		form f=new form();
		hr.post(f,"utf-8");
	}

}
