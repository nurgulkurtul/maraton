package Soru3;

public class Maymun extends MemeliHayvan {

	private String cins;
	public Maymun(String ad, int kilo, int uzunluk) {
		super(ad, kilo, uzunluk);
		this.cins="maymun";
		setCins("memeli hayvan");
		setTehlikeliMi(false);
	}

	@Override
	public void yuru() {
		System.out.println("isimli maymun yürüyor");
		
	}

	@Override
	public void sesCikar() {
		System.out.println("");
		
	}

	public String cins() {
		return cins;
	}
}
