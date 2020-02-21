package Http.Response;


import Http.Cookie.HttpCookie;
import Http.Header.HttpHeader;

public class HttpResponse {
	private HttpHeader Header;
	private Object Content;
	private HttpCookie Cookie;
	private String Status_code;
	
	public HttpHeader getHeader() {
		return Header;
	}
	public void setHeader(HttpHeader header) {
		this.Header = header;
	}
	public Object getContent() {
		return Content;
	}
	public void setContent(Object content) {
		Content = content;
	}
	public HttpCookie getCookie() {
		return Cookie;
	}
	public void setCookie(HttpCookie cookie) {
		this.Cookie = cookie;
	}
	public String getStatus_code() {
		return Status_code;
	}
	public void setStatus_code(String status_code) {
		Status_code = status_code;
	}
	
	

}
