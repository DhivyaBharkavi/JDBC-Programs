package redington.exercise.aug10.JDBC09;

public class FashionMart {
	private int billno,banglesp,ringsp,earringsp,ankeletp;
	public int getBillno() {
		return billno;
	}
	public void setBillno(int billno) {
		this.billno = billno;
	}
	public int getBanglesp() {
		return banglesp;
	}
	public void setBanglesp(int banglesp) {
		this.banglesp = banglesp;
	}
	public int getRingsp() {
		return ringsp;
	}
	public void setRingsp(int ringsp) {
		this.ringsp = ringsp;
	}
	public int getEarringsp() {
		return earringsp;
	}
	public void setEarringsp(int earringsp) {
		this.earringsp = earringsp;
	}
	public int getAnkeletp() {
		return ankeletp;
	}
	public void setAnkeletp(int ankeletp) {
		this.ankeletp = ankeletp;
	}
	public String getBangles() {
		return bangles;
	}
	public void setBangles(String bangles) {
		this.bangles = bangles;
	}
	public String getRings() {
		return rings;
	}
	public void setRings(String rings) {
		this.rings = rings;
	}
	public String getAnkelet() {
		return ankelet;
	}
	public void setAnkelet(String ankelet) {
		this.ankelet = ankelet;
	}
	public String getEarrings() {
		return earrings;
	}
	public void setEarrings(String earrings) {
		this.earrings = earrings;
	}
	private String bangles,rings,ankelet,earrings;
	public FashionMart() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FashionMart(int billno, String earrings,int earringsp,String bangles,int banglesp,  String rings,int ringsp, 
			String ankelet, int ankeletp) {
		super();
		this.billno = billno;
		this.earrings = earrings;
		this.earringsp = earringsp;
		this.bangles = bangles;
		this.banglesp = banglesp;
		this.rings = rings;
		this.ringsp = ringsp;
		this.ankelet = ankelet;
		this.ankeletp = ankeletp;
		}
}
