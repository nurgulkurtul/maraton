package Soru3;

import java.util.HashMap;

public class HayvanatBahcesi {
	
	
	
	HashMap<String, Hayvan> hayvanListesi=new HashMap<>();
	
	
	public void bahceyeMemeliHayvanEkle(MemeliHayvan m) {
		
			hayvanListesi.put(m.getAd(), m);
	}
	
	public void bahceyeSurungenEkle(Surungen s) {
		
		hayvanListesi.put(s.getAd(), s);
	}
	
	public void hayvanSesCikarsin(Hayvan h) {
		h.sesCikar();
	}

	public void hayvaninCinsiniBul(String hayvanAdi){
		if(hayvanListesi.get(hayvanAdi) != null) {
			System.out.println(hayvanListesi.get(hayvanAdi).getCins());
		}
		else
		{
			System.out.println("böyle bir hayvan bulunmamaktadır");
		}
	}
	
	public void hayvaninBilgileriniYazdir(String hayvanAdi){
		if(hayvanListesi.get(hayvanAdi) != null) {
		System.out.println(hayvanListesi.get(hayvanAdi));}
		else {
			System.out.println("böyle bir hayvan bulunmamaktadır");
		}
	}
	
	public void hayvaniHareketEttir(String hayvanAdi){
		if(hayvanListesi.get(hayvanAdi).getCins().equalsIgnoreCase("aslan")) {
			Aslan hareket=(Aslan) hayvanListesi.get(hayvanAdi);
			hareket.yuru();
		}
		else if(hayvanListesi.get(hayvanAdi).getCins().equalsIgnoreCase("maymun")) {
			Maymun hareket=(Maymun) hayvanListesi.get(hayvanAdi);
			hareket.yuru();

		}
		else if( hayvanListesi.get(hayvanAdi).getCins().equalsIgnoreCase("yılan")) {
			Yilan hareket=(Yilan) hayvanListesi.get(hayvanAdi);
			hareket.surun();

		}
		else if( hayvanListesi.get(hayvanAdi).getCins().equalsIgnoreCase("kertenkele")) {
			Kertenkele hareket=(Kertenkele) hayvanListesi.get(hayvanAdi);
			hareket.surun();

		}
	}

	
}
