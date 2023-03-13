package Soru3;

public class Kertenkele extends Surungen{
	private String cins;

	public Kertenkele(String ad, int kilo, int uzunluk) {
		super(ad, kilo, uzunluk);
		this.cins="kertenkele";
		setCins("surungen");
	}

	@Override
	public void surun() {
		System.out.println(this.getAd() + "isimli kertenkele sürünüyor");
	
		
	}

	@Override
	public void sesCikar() {
		System.out.println("");
		
	}
	
	public String cins() {
		return cins;
	}

}
