/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

import Modelo.Aluno;
import Modelo.Turma;
import java.util.Scanner;
import java.io.*;
/**
 * Essa classe irá apresentar um simples menu
 * com as opções de adicionar aluno, registrar
 * falta, listar alunos, salvar e sair.
 * @author informatica
 */
public class Menu implements Serializable{
    
    Scanner sc = new Scanner(System.in);
        
                  
    public void exibirMenu(){
        
        boolean menu = true;
        
        while(menu == true){
        System.out.println("Bem vindo ao gerenciador de faltas!");
        System.out.println("Menu: ");
        System.out.println("1. Adicionar aluno.");
        System.out.println("2. Registrar falta.");
        System.out.println("3. Listar alunos.");
        System.out.println("4. Salvar e sair.");
        
        int x = sc.nextInt();
          
        switch(x){
            case(1):
                boolean adicionarAluno = true;
                
                
                while(adicionarAluno){
                    System.out.println("Digite o nome da turma");
                    String turma = sc.next();
                    Turma turmaObj = new Turma(turma);
                    switch(turmaObj.carregarDados(turma)){
                        case "Erro ao carregar os dados: ":
                            
                System.out.println("Digite o nome do aluno: ");
                Aluno aluno = new Aluno(sc.next());
                turmaObj.adicionarAluno(aluno);
                System.out.println("Aluno adicionado!\n Deseja adicionar mais alguém?\n 1.Sim.\n 2.Voltar para o menu.");
                int continuar = sc.nextInt();
                
                if(continuar == 2){
                    adicionarAluno=false;
                } else if(continuar==1){
                    adicionarAluno=true;
                } 
                    
                }
                    }
        }
    }
}
    }

