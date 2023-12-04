package NovaAcademia;
public class Cliente extends Pessoa{
    private CorpoCliente corpo;
    
    
    public Cliente(int id, int idade, String cpf, String nome) {
        super(id,idade,cpf,nome);

    }

    public Cliente(int id, int idade, String cpf, String nome, double peso, double altura) {
        super(id,idade,cpf,nome);
        CorpoCliente iCorporal = new CorpoCliente(peso,altura);
        this.corpo = iCorporal;
    }

    public CorpoCliente getCorpo() {
        return corpo;
    }

    public void setCorpo(CorpoCliente corpo) {
        this.corpo = corpo;
    }
    
    
    
}
