package com.demo;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PokemonService {

    List<Pokemon> readCsv(String filePath);

}
