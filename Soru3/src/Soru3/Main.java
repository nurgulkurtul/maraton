package Soru3;

public class Main {

	public static void main(String[] args) {
		HayvanatBahcesi hayvanatBahcesi=new HayvanatBahcesi();
		Aslan aslan=new Aslan("simba", 100, 120);
		Yilan yilan=new Yilan("terminator", 40, 225);
		hayvanatBahcesi.bahceyeMemeliHayvanEkle(aslan);
		hayvanatBahcesi.bahceyeSurungenEkle(yilan);
		hayvanatBahcesi.bahceyeMemeliHayvanEkle(new Aslan("Leo", 120, 140));
		hayvanatBahcesi.bahceyeMemeliHayvanEkle(new Maymun("Çiko", 45, 50));
		hayvanatBahcesi.bahceyeSurungenEkle(new Yilan("Cobra", 35, 200));
		hayvanatBahcesi.bahceyeSurungenEkle(new Kertenkele("Kermit", 2, 35));
		
		hayvanatBahcesi.hayvanSesCikarsin(yilan);
		hayvanatBahcesi.hayvanSesCikarsin(aslan);
		
		hayvanatBahcesi.hayvaninBilgileriniYazdir("simba");
		hayvanatBahcesi.hayvaninBilgileriniYazdir("terminator");
		
		hayvanatBahcesi.hayvaninCinsiniBul("simba");
		hayvanatBahcesi.hayvaninCinsiniBul("Çiko");
	;

	}

}
