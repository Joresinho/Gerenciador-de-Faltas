/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.util.ArrayList;
import java.util.List;
import java.io.*;
/**
 *
 * @author informatica
 */
public class Turma  implements Serializable{
    //Declaração dos atributos da classe.
    private String nome;
    private List<Aluno> alunos;   
   
    //Método Construtor
    public Turma(String nome){
        this.nome = nome;
        this.alunos = new ArrayList<>();
            }
    public void setNome(String nome){
    this.nome = nome;    
    }
    public String getNome(){
        return nome;
    }
    
        public void adicionarAluno(Aluno aluno){
         alunos.add(aluno);
        }
        
        public Aluno buscarAluno(String nome){
            for(Aluno aluno : alunos){
                if(aluno.getNome().equalsIgnoreCase(nome)) {
                return aluno;  
                }
            }
    return null;
}
        public void registrarFalta(String nome){
            Aluno aluno = buscarAluno(nome);
            if (aluno != null){
                aluno.incrementarFalta();
            } else {
                System.out.println("ALuno não encoãntrado");
            }
        }
        
            public void listarAlunos(){
            System.out.println("Turma" + nome);
                for(Aluno aluno: alunos){
                System.out.println(aluno);
            }            
        }
        
        // Método para salvar a turma em um arquivo
        public void salvarDados(String filePath){
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))){
         oos.writeObject(this); //Salva o objeto 'Turma' inteiro
            System.out.println("Dados salvos com sucesso!");
        } catch(IOException e) {
            System.err.println("Erro ao salvar os dados: " + e.getMessage());
        }   
        }
        
        //Método para carregar a turma de um arquivo
        public Turma carregarDados(String filePath){
          try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))){
             return (Turma) ois.readObject();
          }  catch(IOException | ClassNotFoundException e){
              System.out.println("Erro ao carregar os dados: " + e.getMessage());
          return null;
          }
        }
}

