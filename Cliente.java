/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poogym;

/**
 *
 * @author ADMIN
 */
public class Cliente {
    
    public Cliente(String Nome, String Cpf, String Telefone, String endereco){
        this.nome = Nome;
        this.cpf = Cpf;
        this.telefone = Telefone;
        this.endereco = endereco;
    }
    public Cliente(){
        
    }
    private String nome;
    private String cpf;
    private String telefone;
    private String endereco;
    private Corpo corpo;
    private Ficha ficha;

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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Corpo getCorpo() {
        return corpo;
    }

    public void setCorpo(Corpo corpo) {
        this.corpo = corpo;
    }

    public Ficha getFicha() {
        return ficha;
    }

    public void setFicha(Ficha ficha) {
        this.ficha = ficha;
    }
    
    
    
}
