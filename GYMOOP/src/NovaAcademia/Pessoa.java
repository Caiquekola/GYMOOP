/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NovaAcademia;

public abstract class Pessoa {

    private int id;
    private String nome;
    private String cpf;
    private int idade;
    
    
    //Construtor geral
    public Pessoa(int ID, int idade, String cpf, String nome) {
        this.id = ID;
        this.idade = idade;
        this.cpf = cpf;
        this.nome = nome;
    }
    //Construtor para Instrutor, ID/SENHA;
    public Pessoa(int id){
        this.id = id;
    }
        
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    

}
