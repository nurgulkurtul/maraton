package Soru4;

import java.util.HashMap;

public class BusinessYolcuSinifi extends Yolcu {
	
	private final int BUSINESSFIYAT = 200;
	private final int BUSINESSVIPFIYAT = 150;
	
	HashMap <String, Integer> biletler;
	private boolean vipMi;

	public BusinessYolcuSinifi(String id, String ad, String soyad, boolean vipMi) {
		super(id, ad, soyad);
		this.vipMi=vipMi;
		this.biletler=new HashMap<>();
	}

	@Override
	public void yolcuBilgileriniGetir() {
		System.out.println("Busines Yolcusu "+getAd()+" Biletleri "+biletler );
		
	}

	@Override
	public void biletAl(FirmaAdi firmaAdi) {
		int fiyat;
		if (vipMi()) {
			fiyat = BUSINESSFIYAT + BUSINESSVIPFIYAT + getBASEFIYAT();
			biletler.put(firmaAdi.toString(), fiyat);
			System.out.println(getAd() + " Adlı  yolcu " + firmaAdi.toString() + " için VIP bilet alınmıştır"
					+ biletler);
		} else {
			fiyat = BUSINESSFIYAT + getBASEFIYAT();
			biletler.put(firmaAdi.toString(), fiyat);
			System.out.println(getAd() + " Adlı  yolcu " + firmaAdi.toString() + " için bilet alınmıştır"
					+ biletler);
		}
		
		
	}
		


	@Override
	public void checkInYap() {
		if (isCheckIn()) {
			System.out.println(getAd() + " chekin zaten yapılmıştır");
		} else {
			System.out.println("Checkin yapılmıştır iyi uçuşlar");
			setCheckIn(true);
		}
		
	}

	@Override
	public void ucagaBin() {
		if (!isCheckIn()) {
			System.out.println("önce checkin yaptırınız");
		} else
			System.out.println(getAd() + " "+ getKoltukNo() + " numaralı koltuk sizin");

	}

	public HashMap<String, Integer> getBiletler() {
		return biletler;
	}

	public boolean vipMi() {
		return vipMi;
	}

	public void setVipMi(boolean vipMi) {
		this.vipMi = vipMi;
	}
	
	
}