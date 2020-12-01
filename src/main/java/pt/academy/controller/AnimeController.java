package pt.academy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pt.academy.domain.Anime;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("anime")
public class AnimeController {

    @GetMapping(path = "list")
    public List<Anime> list(){
        return List.of(new Anime("One Push Man"), new Anime("Buko No Hero"));
    }

}
