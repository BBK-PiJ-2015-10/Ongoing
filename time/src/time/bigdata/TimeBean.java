package time.bigdata;

import java.text.DateFormat;
import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SessionScoped
@ManagedBean(name="TimeBean")
public class TimeBean {
	
	private DateFormat timeFormatter;
	
	public TimeBean(){
		timeFormatter = DateFormat.getTimeInstance();
	}
	
	public String getTime(){
		Date time = new Date();
		String timeString = timeFormatter.format(time);
		return timeString;
	}

}
