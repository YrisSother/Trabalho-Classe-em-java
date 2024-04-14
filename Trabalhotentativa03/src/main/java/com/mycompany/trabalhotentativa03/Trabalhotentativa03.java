/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trabalhotentativa03;

/**
 *
 * @author yris
 */
public class Trabalhotentativa03 {

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Pessoa pessoa1 = new Pessoa("João", 20);
        Pessoa pessoa2 = new Pessoa("Maria", 30);

        System.out.println(pessoa1.falar());
        System.out.println(pessoa2.falar());
        
        Aluno aluno1 = new Aluno("João", 20, 12338585);
        Aluno aluno2 = new Aluno("Maria", 32, 54635488);
        
        System.out.println(aluno1.fala());
        System.out.println(aluno2.fala());
        
    }
}
