package Soru3;

public class Aslan extends MemeliHayvan{
	
	private String cins;

	public Aslan(String ad, int kilo, int uzunluk) {
		super(ad, kilo, uzunluk);
		this.cins="aslan";
		setCins("memeli hayvan");
		setTehlikeliMi(true);
	}

	@Override
	public void yuru() {
		System.out.println(this.getAd() + cins() + "isimli aslan yürüyor");
		
	}

	@Override
	public void sesCikar() {

		System.out.println("kükreme");
		
	}

	public String cins(){
		return cins;
	}
	
}
