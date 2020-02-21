package Http.Request.Param;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

import Http.Exception.DictException;

/**
 * http请求数据form表单格式
 * @author jinx
 *
 */
public class form {
	private static String Content_Type="application/x-www-form-urlencoded";
	
	private List<String> formkey=new LinkedList<String>();
	private List<String> formvalue=new LinkedList<String>();
	
	public void AddForm(String key,String value) throws DictException {
	    if(key==null) {
	    	throw new DictException("key值不能为空");
	    }
	    if(value==null) {
	    	formvalue.add("");
	    }else {
	    	formvalue.add(value);
	    }
		formkey.add(key);
	
	}
	public String GetForm(String key) {
		for(int i=0;i<formkey.size();i++) {
			if(formkey.get(i).equals(key)) {
				return formvalue.get(i);
			}
		}
		return "null";
	}
	public List<String> GetAllFromNames(){
		return formkey;
	}
	public List<String> GetAllFormValues(){
		return formvalue;
		
	}
	@Test
	public void test() throws DictException {
		AddForm(null,null);
		
	}

}
