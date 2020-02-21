package Http.Cookie;

import java.util.LinkedList;
import java.util.List;

public class HttpCookie {
	protected List<String> CookieKey=new LinkedList<String>();
	protected List<String> CookieValues=new LinkedList<String>();
	
	
	public List<String> GetAllHeaderNames(){
		return CookieKey;
	}
	public List<String> GetAllCookieValues(){
		return CookieValues;
		
	}
	public String GetCookie(String key) {
		for(int i=0;i<CookieKey.size();i++) {
			if(CookieKey.get(i).equals(key)) {
				return CookieValues.get(i);
			}
		}
		return "null";
	}
	public void AddCookie(String key,String value) {
		CookieKey.add(key);
		CookieValues.add(value);
	}
	
}
