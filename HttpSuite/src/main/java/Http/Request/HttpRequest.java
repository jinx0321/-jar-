package Http.Request;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import Http.Cookie.HttpCookie;
import Http.Header.HttpHeader;
import Http.Request.Param.form;
import Http.Request.Param.json;
import Http.Response.HttpResponse;
import Http.Response.HttpResponseTools;

public class HttpRequest implements HttpRequestPost{
	private String url;
	private HttpHeader header;
	private HttpCookie cookie;
	private HttpClient client = HttpClients.createDefault();// 创建默认http连接
	public HttpRequest() {
		
	}
	public HttpRequest(String url) {
		this.url=url;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public HttpHeader getHeader() {
		return header;
	}
	public void setHeader(HttpHeader header) {
		this.header = header;
	}
	public HttpCookie getCookie() {
		return cookie;
	}
	public void setCookie(HttpCookie cookie) {
		this.cookie = cookie;
	}
	public HttpResponse post(form form,String encoding) {
	    HttpPost post = new HttpPost(this.url);// 创建一个post请求
	    List<NameValuePair> paramList = new ArrayList<NameValuePair>();
	    form.GetAllFromNames().forEach(e->{
	    	  paramList.add(new BasicNameValuePair(e, form.GetForm(e)));//传递的参数
	    });
	    HttpEntity entity = null;
		try {
			entity = new UrlEncodedFormEntity(paramList, encoding);
		} catch (UnsupportedEncodingException e1) {
			System.out.println("UnsupportedEncodingException:"+encoding);
		}
        post.setEntity(entity);// 把请求实体放post请求中
        try {
        	//发送http请求
			org.apache.http.HttpResponse response = client.execute(post);
			return HttpResponseTools.Switch(response);
		} catch (ClientProtocolException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		return null;
	}
	public HttpResponse post(json json) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public HttpResponse post() {
	    HttpPost post = new HttpPost(this.url);// 创建一个post请求
        try {
        	//发送http请求
			org.apache.http.HttpResponse response = client.execute(post);
			HttpResponse hp=new HttpResponse();
			System.out.println(response.getStatusLine().getStatusCode());
			
		} catch (ClientProtocolException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		return null;
	}

	
}
