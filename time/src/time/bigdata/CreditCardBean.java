package time.bigdata;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import java.util.Map;
import java.util.LinkedHashMap;

@SessionScoped
@ManagedBean(name="CreditCardBean")
public class CreditCardBean {
	
	private Map<String,Integer> choices;
	
	public CreditCardBean(){
		choices = new LinkedHashMap<String,Integer>();
		choices.put("Jan",1);
		choices.put("Feb",2);
		choices.put("Mar",3);
		choices.put("Apr",4);
		choices.put("May",5);
		choices.put("Jun",6);
		choices.put("Jul",7);
		choices.put("Aug",8);
		choices.put("Sep",9);
		choices.put("Oct",10);
		choices.put("Nov",11);
		choices.put("Dec",12);
	}
	
	public Map<String,Integer> getMonthChoices(){
		return choices;
	}
	
	
	
	

}
