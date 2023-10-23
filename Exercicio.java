package poogym;
public class Exercicio {
    private int repet;
    private int series;
    private String nomeExe;
    private String diaSemana;
    private double peso;
    
    public Exercicio(){
    }
    
    public Exercicio(String nome, int repet, int series, double peso, String dia){
        this.nomeExe = nome;
        this.repet = repet;
        this.series = series;
        this.peso = peso;
        this.diaSemana = dia;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public int getRepet() {
        return repet;
    }

    public void setRepet(int repet) {
        this.repet = repet;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getNomeExe() {
        return nomeExe;
    }

    public void setNomeExe(String nomeExe) {
        this.nomeExe = nomeExe;
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }
    
    public void info(){
        System.out.println("Exercicio: " + nomeExe);
        System.out.println("Dias da semana: " + diaSemana);
        System.out.println("Treino: " + series + "X" + repet);
        System.out.println("Peso: " + peso + "Kg");
    }
}
