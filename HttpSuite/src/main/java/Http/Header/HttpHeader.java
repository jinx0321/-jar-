package Http.Header;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import Http.Exception.DictException;

public class HttpHeader {
	private List<String> headerkey=new LinkedList<String>();
	private List<String> headervalue=new LinkedList<String>();
	
	public void AddHeader(String key,String value) throws Exception {
		  if(key==null) {
		    	throw new DictException("key值不能为空");
		    }
		    if(value==null) {
		    	headervalue.add("");
		    }else {
		    	headervalue.add(value);
		    }
		    headerkey.add(key);
	}
	
	public String GetHeader(String key) {
		for(int i=0;i<headerkey.size();i++) {
			if(headerkey.get(i).equals(key)) {
				return headervalue.get(i);
			}
		}
		return "null";
	}
	public List<String> GetAllHeaderNames(){
		return headerkey;
	}
	public List<String> GetAllHeaderValues(){
		return headervalue;
		
	}
	
}
