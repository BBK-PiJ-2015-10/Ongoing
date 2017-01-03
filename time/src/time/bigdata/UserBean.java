package time.bigdata;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import java.util.Map;
import java.util.LinkedHashMap;

@ManagedBean(name="UserBean")
@SessionScoped
public class UserBean {
	
	private String username;
	
	private String password;
	
	private Map<String,String> nicknames;
	
	private String selection;
	
	private String other ="Mamamia";
	
	public UserBean(){
		nicknames = new LinkedHashMap();
		nicknames.put("Ale Tonto","Ale Tonto");
		nicknames.put("Biruta","Biruta");
		nicknames.put("Maiale","Maiale");
		nicknames.put("Ranocchi","Ranocchio");
		nicknames.put("Principe Verde","Principe Verde");
		nicknames.put("Animalito","Animalitito");
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String ausername) {
		this.username = ausername;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String apassword) {
		this.password = apassword;
	}
	
	public Map<String,String> getNicknames(){
		return this.nicknames;
	}

	public String getSelection() {
		return selection;
	}

	public void setSelection(String selection) {
		this.selection = selection;
	}

	public String getOther() {
		return other;
	}
	
	public void setOther(String aother){
		other=aother;
	}
	
	

}
