package trabalho;

/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author u09656283104
 */
public class Pessoa {
    
    private String nome;
    protected int idade;
    double salario;
    
    public Pessoa(){
    }
    public Pessoa(String nome, int idade, double salario){
        
    }
     public Pessoa(String nome, double salario){
         
    }
      public Pessoa(String nome, int idade){
          
    }
      

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa("Marcos", 50);
}
}