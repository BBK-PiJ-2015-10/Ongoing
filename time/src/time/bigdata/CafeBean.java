package time.bigdata;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SessionScoped
@ManagedBean(name="CafeBean")
public class CafeBean {

	private String favCoffee1;
	
	private String favCoffee2;
	
	private String favCoffee3;
	
	//private 
	
	public CafeBean(){
		
	}

	public String getFavCoffee1() {
		return favCoffee1;
	}

	public void setFavCoffee1(String favCoffee1) {
		this.favCoffee1 = favCoffee1;
	}

	public String getFavCoffee2() {
		return favCoffee2;
	}

	public void setFavCoffee2(String favCoffee2) {
		this.favCoffee2 = favCoffee2;
	}

	public String getFavCoffee3() {
		return favCoffee3;
	}

	public void setFavCoffee3(String favCoffee3) {
		this.favCoffee3 = favCoffee3;
	}
	
	
	
}
