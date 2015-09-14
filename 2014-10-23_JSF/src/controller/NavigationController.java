package controller;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
@ManagedBean(name="navigationController",eager=true)
public class NavigationController implements Serializable {
	
	@ManagedProperty(value="#{param.pageId}")
	private String pageId; 
	
	public String getPageId() {
		return pageId;
	}

	public void setPageId(String pageId) {
		this.pageId = pageId;
	}

	public String movetopage1(){
		return "page1";
	}
	
	public String processPage1(){
		return "success";
	}
	
	public String processPage2(){
		return "failure";
	}
	
	public String showPage(){
		if(pageId==null){
			return "index";
		}
		if(pageId.equals("1")){
			return "page1";
		} else if(pageId.equals("2")){
			return "page2";
		} else
			return "index";
		}
}
