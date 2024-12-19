/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.Serializable;

/**
 *
 * @author informatica
 */
public class Aluno implements Serializable{
    //Declaração dos Atributos da classe.
    private String nome;
    private int faltas;
    
    //Criando o Método Construtor.
    public Aluno(String nome){
        this.nome = nome;
        this.faltas = 0;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome=nome;
    }
    public void incrementarFalta(){
        this.faltas++;
    }
    
    public void setFaltas(int faltas){
        this.faltas=faltas;
    }
    
        
    @Override
    public String toString(){
        return nome + "- Faltas: " + faltas;
    }
    
}
