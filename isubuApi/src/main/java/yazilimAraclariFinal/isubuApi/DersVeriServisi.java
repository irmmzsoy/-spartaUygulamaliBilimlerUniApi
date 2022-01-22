package yazilimAraclariFinal.isubuApi;

import java.util.ArrayList;
import java.util.List;

public class DersVeriServisi {

	private static final List<Ders> DERSLER = new ArrayList<>();
	static {
		DERSLER.add(new Ders("Yazılım"));
		DERSLER.add(new Ders("Programlama"));
		DERSLER.add(new Ders("C Programlama"));
		DERSLER.add(new Ders("Java"));
		DERSLER.add(new Ders("Veri Tabanı Uygulamaları"));
		DERSLER.add(new Ders("Yazılım"));
		
		
	}
	
	public static List<Ders> dersleriGetir(){
		return DERSLER;
	}
	
	public static void dersEkle(Ders ders ) {
		DERSLER.add(ders);
	}

	public static void dersSil(Ders ders) {
		DERSLER.remove(ders);
	}
	
	
	
	
	
}
