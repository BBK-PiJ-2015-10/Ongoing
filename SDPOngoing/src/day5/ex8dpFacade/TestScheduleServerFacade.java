package day5.ex8dpFacade;

public class TestScheduleServerFacade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScheduleServer scheduleserver = new ScheduleServerImpl();
		
		FacadeScheduleServer facadescheduleserver= new FacadeScheduleServer(scheduleserver);
		facadescheduleserver.startServer();
		facadescheduleserver.stopServer();

		

	}

}