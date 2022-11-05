package ArrayList;

public class customer {
	private String fullname;
	private int score;
	private String superMarketID;
	public customer(String fullname, int score, String superMarketID) {
		this.fullname = fullname;
		this.score = score;
		this.superMarketID = superMarketID;
	}
	@Override
	public String toString() {
		return "customer [fullname=" + fullname + ", score=" + score + ", superMarketID=" + superMarketID + "]";
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getSuperMarketID() {
		return superMarketID;
	}
	public void setSuperMarketID(String superMarketID) {
		this.superMarketID = superMarketID;
	}
	public static void main(String[] args) {
		System.out.println("sd");
	}
	
	
	
}
