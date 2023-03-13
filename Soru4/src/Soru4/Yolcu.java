package Soru4;

import java.util.ArrayList;
import java.util.List;

public abstract class Yolcu {

	private String id;
	private String ad;
	private String soyad;
	private int koltukNo;
	private boolean checkIn;
	private final int BASEFIYAT = 100;
	static List<Integer> biletNumaralari = new ArrayList<>();
	
	
	
	public Yolcu(String id, String ad, String soyad) {
		super();
		this.id = id;
		this.ad = ad;
		this.soyad = soyad;
		this.koltukNo = koltukNo;
		this.checkIn = checkIn;
	}
	
	public abstract void yolcuBilgileriniGetir();
	
	
	public abstract void biletAl(FirmaAdi firmaAdi);

	public abstract void checkInYap();

	public abstract void ucagaBin();


	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
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



	public int getKoltukNo() {
		return koltukNo;
	}



	public void setKoltukNo(int koltukNo) {
		this.koltukNo = koltukNo;
	}



	public boolean isCheckIn() {
		return checkIn;
	}



	public void setCheckIn(boolean checkIn) {
		this.checkIn = checkIn;
	}



	public static List<Integer> getBiletNumaraları() {
		return biletNumaralari;
	}



	public static void setBiletNumaraları(List<Integer> biletNumaraları) {
		Yolcu.biletNumaralari = biletNumaraları;
	}



	public int getBASEFIYAT() {
		return BASEFIYAT;
	}



	@Override
	public String toString() {
		return "Yolcu [id=" + id + ", ad=" + ad + ", soyad=" + soyad + ", koltukNo=" + koltukNo + ", checkIn=" + checkIn
				+ ", BASEFIYAT=" + BASEFIYAT + "]";
	} 
	
	private static void biletler() {
		for (int i = 10; i < 111; i++) {
			biletNumaralari.add(i);
		}
	}
	
	
	
}
