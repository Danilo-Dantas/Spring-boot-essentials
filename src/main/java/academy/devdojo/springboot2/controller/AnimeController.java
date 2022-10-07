package academy.devdojo.springboot2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import academy.devdojo.springboot2.domain.Anime;
import academy.devdojo.springboot2.util.DateUtil;

@RestController
@RequestMapping("anime")
public class AnimeController {
	@Autowired
	private DateUtil dateUtil;
	//localhost:8080/anime/list
	@GetMapping(path = "list")
	public List<Anime> list(){
		return List.of(new Anime("DBZ"), new Anime("Berserk"));
	}
}
