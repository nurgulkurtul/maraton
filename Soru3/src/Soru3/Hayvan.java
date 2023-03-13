package Soru3;

public abstract class Hayvan {

	private String ad;
	private int kilo;
	private int uzunluk;
	private Boolean tehlikeliMi;
	private String cins;
	
	
	
	
	public Hayvan(String ad, int kilo, int uzunluk) {
		super();
		this.ad = ad;
		this.kilo = kilo;
		this.uzunluk = uzunluk;
		this.tehlikeliMi = tehlikeliMi;
	}

	public abstract void sesCikar();

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public int getKilo() {
		return kilo;
	}

	public void setKilo(int kilo) {
		this.kilo = kilo;
	}

	public int getUzunluk() {
		return uzunluk;
	}

	public void setUzunluk(int uzunluk) {
		this.uzunluk = uzunluk;
	}

	public Boolean getTehlikeliMi() {
		return tehlikeliMi;
	}

	public void setTehlikeliMi(Boolean tehlikeliMi) {
		this.tehlikeliMi = tehlikeliMi;
	}

	public String getCins() {
		return cins;
	}

	public void setCins(String cins) {
		this.cins = cins;
	}

	@Override
	public String toString() {
		return "Hayvan [ad=" + ad + ", kilo=" + kilo + ", uzunluk=" + uzunluk + ", tehlikeliMi=" + tehlikeliMi
				+ ", cins=" + cins + "]";
	}
	

	
	
}
