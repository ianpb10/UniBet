package br.uni.unibet.UniBet.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String nome, login, senha, email;
    private double saldo;
    private boolean ehAdmin;
    @OneToMany
    private ArrayList<Aposta> minhasApostas;

}
