package Soru4;

public class Main {

	public static void main(String[] args) {
		Yolcu yolcu1 = new BusinessYolcuSinifi("7775", "Mert", "Kaya", false);	
		Yolcu yolcu2 = new EkonomiYolcu("889", "Ahmet", "Demir");	
		Yolcu yolcu3 = new BusinessYolcuSinifi("555", "Aslı", "Bahr", true);	
		
		System.out.println("***Business Yolcu VIP***");
		yolcu3.biletAl(FirmaAdi.PEGASUS);
		yolcu3.biletAl(FirmaAdi.THY);
		System.out.println("***");
		yolcu3.ucagaBin();
		yolcu3.ucagaBin();
		yolcu3.checkInYap();
		yolcu3.checkInYap();
		yolcu3.ucagaBin();
		yolcu3.yolcuBilgileriniGetir();
		
		System.out.println("***Ekonomi Yolcu***");
		yolcu2.biletAl(FirmaAdi.PEGASUS);
		yolcu2.biletAl(FirmaAdi.THY);
		yolcu2.biletAl(FirmaAdi.PEGASUS);
		yolcu2.biletAl(FirmaAdi.THY);
		System.out.println("***");
		yolcu2.ucagaBin();
		yolcu2.ucagaBin();
		yolcu2.checkInYap();
		yolcu2.checkInYap();
		yolcu2.ucagaBin();
		yolcu2.yolcuBilgileriniGetir();

	}

}
