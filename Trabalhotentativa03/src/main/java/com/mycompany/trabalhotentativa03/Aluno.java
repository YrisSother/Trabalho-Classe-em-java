/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhotentativa03;

/**
 *
 * @author yris
 */
public class Aluno {
    private final String nome;
    private final int idade;
    private final int ra;
    
    public Aluno(String nome, int idade, int ra){
        this.nome = nome;
        this.idade = idade;
        this.ra = ra;
    }
    
    public String fala() {
        return "Olá " + nome + " você tem " + idade + " anos, e o seu ra é " + ra;
    }
    
    public String getNome(){
        return nome;
    }
    
    public int getIdade(){
        return idade;
    }
    
    public int getRa(){
        return ra;
    }
}
