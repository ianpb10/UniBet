package br.uni.apostasuni.UniBet.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/desenv")
public class DesenvolvimentoController {
    static ArrayList<String> desenvolvedores;
    static {
        desenvolvedores = new ArrayList<>();
        desenvolvedores.add("Zezin da Silva");
        desenvolvedores.add("PeDrin Morreira");
        desenvolvedores.add("Gustin Marmelo");
    }

    @GetMapping("/time")
    public String getDesenvTime(){
        String nome = "";
        for(String n: desenvolvedores) {
            nome += n + ";";
        }
        return nome;

    }@GetMapping("/time/{posicao}")
    public String getDesenvTimeOne(@PathVariable int posicao){
        if (posicao >= 1 && posicao <= desenvolvedores.size()){
        return desenvolvedores.get(posicao - 1);
        }else{
            return "indice incorreto";
        }
    }


}
