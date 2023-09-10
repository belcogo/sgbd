package controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import entities.Musica;

@RestController
@RequestMapping(value = "/musicas")
public class DiscografiaControle {

	@GetMapping
	public List<Musica> getObjects() {
		Musica m1 = new Musica(1 ,"All the Small Things", "2:51");
	
		List<Musica> list = Arrays.asList(m1);
		
		return list;
	}
}