package com.demo;

import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

@Service
public class PokemonServiceImpl implements PokemonService {

    public List<Pokemon> readCsv(String filePath) {
        List<Pokemon> pokemonList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                Pokemon pokemon = new Pokemon (
                        Integer.parseInt(data[0]),  // number
                        data[1],  // name
                        data[2],  // type1
                        data[3],  // type2
                        Integer.parseInt(data[4]),  // total
                        Integer.parseInt(data[5]),  // hp
                        Integer.parseInt(data[6]),  // attack
                        Integer.parseInt(data[7]),  // defense
                        Integer.parseInt(data[8]),  // spAtk
                        Integer.parseInt(data[9]),  // spDef
                        Integer.parseInt(data[10]), // speed
                        Integer.parseInt(data[11]), // generation
                        Boolean.parseBoolean(data[12]) // legendary
                );
                pokemonList.add(pokemon);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pokemonList;
    }
}
