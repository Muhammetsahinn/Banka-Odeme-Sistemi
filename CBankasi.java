package inter;

public class CBankasi implements IBanka {
	private String bankaAdi;
	private String terminalId;
	private String password;

	public CBankasi(String bankaAdi, String terminalId, String password) {
		this.bankaAdi = bankaAdi;
		this.terminalId = terminalId;
		this.password = password;
	}
	public String getBankaAdi(){
		return this.bankaAdi;
	}
	public void setBankaAdi(String bankaAdi){
		this.bankaAdi = bankaAdi;
	}
	public String getTerminalId(){
		return this.terminalId;
	}
	public void setTerminalId(String terminalId){
		this.terminalId = terminalId;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public boolean connect(String ipAdress) {
		System.out.println("Kullanici ip : " + ipAdress);
		System.out.println("Makine ip : " + this.hostIpAdress);
		System.out.println(this.bankaAdi + " Bankaya baglanildi!");
		return false;
	}

	@Override
	public boolean payment(double price, String cardNumber, String date, String cvc) {
		//Banka ödeme işlemleri
		System.out.println(" Bankadan cevap bekleniyor!");
		System.out.println(" islem basarili oldu.");
		return false;
	}
}
