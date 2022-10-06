package academy.devdojo.springboot2.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import academy.devdojo.springboot2.domain.Anime;

@RestController
@RequestMapping("anime")
public class AnimeController {
	
	@GetMapping(path = "list")
	public List<Anime> list(){
		return List.of(new Anime("DBZ"), new Anime("Berserk"));
	}
}
