package Http.Request;

import Http.Request.Param.form;
import Http.Request.Param.json;
import Http.Response.HttpResponse;

public interface HttpRequestPost {
	//Ä¬ÈÏutf-8
	public HttpResponse post();
	public HttpResponse post(form form,String encoding);
	public HttpResponse post(json json);

}
