
package NovaAcademia;


public class Instrutor extends Pessoa implements Autenticacao{
    private int senha;
    private int quantClientes;
    
    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
    
    public Instrutor(int id, int idade, String cpf, String nome, int senha){
        super(id,idade,cpf,nome);
        this.setSenha(senha);
    }
    public Instrutor(int id, int senha){
        super(id);
        this.senha = senha;
    }
    public boolean autentica(int senha){
        if(this.senha != senha){
            return false;
        }else{
            return true;
        }
    }
    
    
}
