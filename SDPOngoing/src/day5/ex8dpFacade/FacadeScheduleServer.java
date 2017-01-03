package day5.ex8dpFacade;

public class FacadeScheduleServer {
	
	private final ScheduleServer scheduleserver;
	
	public void startServer(){
		this.scheduleserver.startBooting();
		this.scheduleserver.readSystemConfigFile();
		this.scheduleserver.init();
		this.scheduleserver.initializeContext();
		this.scheduleserver.initializeListeners();
		this.scheduleserver.createSystemObjects();
		System.out.println("Start working with....?");
		System.out.println("After work done....?");
	}
	
	public void stopServer(){
		this.scheduleserver.releaseProcesses();
		this.scheduleserver.destory();
		this.scheduleserver.destroySystemObjects();
		this.scheduleserver.destoryListeners();
		this.scheduleserver.destoryContext();
		this.scheduleserver.shutdown();
	}
	
	public FacadeScheduleServer(ScheduleServer scheduleserver){
		this.scheduleserver=scheduleserver;
	}

}
