package Soru4;

import java.util.HashMap;

public class EkonomiYolcu extends Yolcu {
	

	private final int EKONOMIFIYAT = 100;
	HashMap<String, Integer> biletler;

	public EkonomiYolcu(String id, String ad, String soyad) {
		super(id, ad, soyad);
		this.biletler=new HashMap<>();
	}

	@Override
	public void yolcuBilgileriniGetir() {
		System.out.println("Ekonomi Yolcusu "+getAd()+" Biletleri "+biletler );
		
	}

	@Override
	public void biletAl(FirmaAdi firmaAdi) {
		int biletFiyatı = EKONOMIFIYAT + getBASEFIYAT();
		
		if (biletler.containsKey(firmaAdi.toString())) {
			biletler.put(firmaAdi.toString(), biletler.get(firmaAdi.toString())+biletFiyatı);
			System.out.println(getAd().toString() + " Adlı firmadan bir bilet alınmıştır" + biletler);
		} else {
			biletler.put(firmaAdi.toString(), biletFiyatı);
			System.out.println(getAd() + " Adlı  yolcu " + firmaAdi.toString()
					+ " için ekonomi sınıfından bilet alınmıştır" + biletler);
		}
		
	}

	@Override
	public void checkInYap() {
		if (isCheckIn()) {
			System.out.println(getAd() + " için chekin zaten yapılmıştır");
		} else {
			System.out.println("checkin yapılmıştır iyi uçuşlar");
			setCheckIn(true);
		}
		
	}

	@Override
	public void ucagaBin() {
		if (!isCheckIn()) {
			System.out.println("önce checkin yaptırınız");
		} else
			System.out.println(getAd() + " "+ getKoltukNo() + " numaralı koltuk sizin ");

		
	}

	public HashMap<String, Integer> getBiletler() {
		return biletler;
	}

	
	
}
