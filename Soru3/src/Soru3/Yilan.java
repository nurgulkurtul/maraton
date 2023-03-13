package Soru3;

public class Yilan extends Surungen {
	
	private String cins;

	public Yilan(String ad, int kilo, int uzunluk) {
		super(ad, kilo, uzunluk);
		this.cins="yılan";
		setCins("surungen");
	}

	@Override
	public void surun() {
		System.out.println(this.getAd() + "isimli yılan sürünüyor");
	}

	@Override
	public void sesCikar() {
		System.out.println("tıss");
		
	}

	public String cins() {
		return cins;
	}
}
