package com.demo;
import com.opencsv.exceptions.CsvValidationException;

import com.opencsv.CSVReader;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@Controller
public class PokemonController {

    private final PokemonService pokemonService;

    public PokemonController(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }

    @GetMapping("/pokemon")
    public String getPokemonList(Model model) {
        List<Pokemon> pokemonList = new ArrayList<>();

        pokemonList = pokemonService.readCsv("C:\\Users\\User5\\Desktop\\pokemon.csv");

        model.addAttribute("pokemonList", pokemonList);
        return "pokemon.html";
    }
    }

