package yazilimAraclariFinal.isubuApi;

import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ders")
public class DersApi {
	
	
	// http://localhost:8080/ders/listele
	
	@GetMapping("/listele")
	public List<Ders> listele(){
		return DersVeriServisi.dersleriGetir();
	}
	
	@PostMapping("/ekle")
	public Ders ekle(@RequestBody Ders ders) {
		DersVeriServisi.dersEkle(ders);
		return ders;
	}
	
	@GetMapping("/ekle2")
	public Ders dersEkle(@RequestParam String dersAdi) {
		Ders ders = new Ders(dersAdi);
		DersVeriServisi.dersEkle(ders);
		return ders;
	}

	

}
		
	
	

