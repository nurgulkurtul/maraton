package Soru3;

public abstract class MemeliHayvan extends Hayvan {
	
	private String cins="memeli hayvan";
	public MemeliHayvan(String ad, int kilo, int uzunluk) {
		super(ad, kilo, uzunluk);
		
		// TODO Auto-generated constructor stub
	}

	public abstract void yuru();
	public String cins() {
		return cins;
	}

	
}
