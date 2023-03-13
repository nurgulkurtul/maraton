package Soru2;

public class CustomStringTR {

	private String metin;
	
	
	
	public CustomStringTR(String metin) {
		super();
		this.metin = metin;
	}

	public String getMetin() {
		return metin;
	}

	public void setMetin(String metin) {
		this.metin = metin;
	}


	public int uzunluk() {
		int uzunluk=metin.length();
		
		return uzunluk;
	}
	
	public String buyukHarfYap() {
		String buyukHarf=metin.toUpperCase();
		return buyukHarf;
	}
	
	public String kucukHarfYap() {
		String kucukHarf=metin.toLowerCase();
		return kucukHarf;
	}
	
	public char karakter(int index) {
		char krktr=metin.charAt(index);
		return krktr;
	}
	
	public int harf (String harff) {
		int bul=metin.indexOf(harff);
		return bul;
	}
	
	public char sonHarf() {
		char harf = metin.charAt(metin.length()-1);
		return harf;
	}
	
	public boolean bitisKontrol(String harf) {
		boolean check = metin.endsWith(harf);
		return check;
	}
	
	public boolean baslangicKontrol(String harf) {
		boolean check = metin.startsWith(harf);
		return check;
	}
	
	public String degistirme(char harf1, char harf2) {
		String degis=metin.replace(harf1, harf2);
		return degis;
	}
}
