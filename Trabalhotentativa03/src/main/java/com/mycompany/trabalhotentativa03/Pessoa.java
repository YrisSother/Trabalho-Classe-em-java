/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhotentativa03;

/**
 *
 * @author yris
 */
public class Pessoa {
        private final String nome;
        private final int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String falar() {
        return "Oi, eu sou " + nome + " e tenho " + idade + " anos.";
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}
