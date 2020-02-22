package Http.Response;


import Http.Cookie.HttpCookie;
import Http.Header.HttpHeader;

public class HttpResponse {
	private HttpHeader Header;
	private byte[] Content;
	private HttpCookie Cookie;
	private String Status_code;
	private String Return_Type;
	private String Charset="UTF-8";
	
	public HttpHeader getHeader() {
		return Header;
	}
	public void setHeader(HttpHeader header) {
		this.Header = header;
	}
	public byte[] getContent() {
		return Content;
	}
	public void setContent(byte[] content) {
		Content = (byte[]) content;
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
	public String getReturn_Type() {
		return Return_Type;
	}
	public void setReturn_Type(String return_Type) {
		Return_Type = return_Type;
	}
	public String getCharset() {
		return Charset;
	}
	public void setCharset(String charset) {
		Charset = charset;
	}
	
	

}
