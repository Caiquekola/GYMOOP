package poogym;
public class Cliente {
    
    public Cliente(String Nome, String Cpf, String Telefone, String endereco){
        this.nome = Nome;
        this.cpf = Cpf;
        this.telefone = Telefone;
        this.endereco = endereco;
        this.ficha = new Ficha();
    }
    public Cliente(){
        this.ficha = new Ficha();
    }
    private String nome;
    private String cpf;
    private String telefone;
    private String endereco;
    private CorpoCliente corpoCliente;
    private Ficha ficha;
    private int qntFichas=0;

    public CorpoCliente getCorpoCliente() {
        return corpoCliente;
    }

    public void setCorpoCliente(CorpoCliente corpoCliente) {
        this.corpoCliente = corpoCliente;
    }

    
    public Ficha getFicha() {
        return ficha;
    }

    public void setFicha(Ficha ficha) {
        this.ficha = ficha;
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
    
    public String toString(){
        String result = String.format("Nome: %s\nCpf: %s\n"
                + "Endereço: %s\nTelefone: %s",this.nome,this.cpf,
                this.endereco,this.telefone);
        return result;
    }
    
}
