package day1.InheritancePractice;

public class HotWoman extends Woman {
	
	private boolean likesme;

	public HotWoman(String name, boolean likes) {
		super(name);
		SetLikesMe(likes);
	}
	
	public boolean getLikesme(){
		return this.likesme;
	}
	
	public void SetLikesMe(boolean likes){
		this.likesme = likes;
		this.size = 10;
		if (likes == true){
			this.setNumber(20);
		}
		
	}
	

	
}
