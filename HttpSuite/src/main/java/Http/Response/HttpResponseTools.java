package Http.Response;

import java.io.IOException;
import java.util.regex.Pattern;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.ParseException;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

import Http.Cookie.HttpCookie;
import Http.Header.HttpHeader;

public class HttpResponseTools {
	//��appache��httpresponseת��Ϊ�Լ���response
	public static HttpResponse Switch(org.apache.http.HttpResponse response) throws ParseException, IOException {
		HttpResponse hp=new HttpResponse();
		HttpHeader hheader=new HttpHeader();
		HttpCookie hcookie=new HttpCookie();
		HttpCookie hc=new HttpCookie();
		Header[] hds=response.getAllHeaders();
		for(int i=0;i<hds.length;i++) {
			try {
				hheader.AddHeader(hds[i].getName(), hds[i].getValue());
				if(hds[i].getName().toLowerCase().contains("set-cookie")) {
					hc.AddCookie(hds[i].getName(), hds[i].getValue());
				}
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
		//������Ϣͷ
		hp.setHeader(hheader);
		//������Ϣcookie
		hp.setCookie(hcookie);
		//״̬��
		hp.setStatus_code(String.valueOf(response.getStatusLine().getStatusCode()));
		//��������
		String type=response.getEntity().getContentType().getValue();
		hp.setReturn_Type(type!=null?type.split(";").length>1?type.split(";")[0]:type:HttpResponseType.text_html);
	    if(type.toLowerCase().contains("charset")) {
	    	String[] types=type.split(";");
	    	for(int i=0;i<types.length;i++) {
	    		if(types[i].toLowerCase().contains("charset")) {
	    			hp.setReturn_Type(types[i].trim().split("=")[1]);
	    		}
	    	}
	    	}
	    hp.setContent(EntityUtils.toByteArray(response.getEntity()));
		return hp;
	}
	@Test
	public void test() {
		  String content = "text/html; charset=UTF-8";
	      String pattern = "charset";
		  boolean isMatch = Pattern.matches(pattern, content);
		  System.out.println("�ַ������Ƿ������ 'runoob' ���ַ���? " + isMatch);
	}

}
