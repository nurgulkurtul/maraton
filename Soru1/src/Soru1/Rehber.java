package Soru1;

public class Rehber {

	private String ad;
	private String soyad;
	private String adres;
	private String tel;

	public Rehber(String ad, String soyad, String adres, String tel) {
		super();
		this.ad = ad;
		this.soyad = soyad;
		this.adres = adres;
		this.tel = tel;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "KisiBİlgileri [ad=" + ad + ", soyad=" + soyad + ", adres=" + adres + ", tel=" + tel + "]";
	}

}
