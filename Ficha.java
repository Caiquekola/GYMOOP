package poogym;

import java.util.List;
public class Ficha {
    private List<Exercicio> exercicio;

    public List<Exercicio> getExercicio() {
        return exercicio;
    }

    public void setExercicio(List<Exercicio> exercicio) {
        this.exercicio = exercicio;
    }
    
    public void novo(String nome, int repet, int series, double peso, String dia){
        Exercicio exe = new Exercicio(nome, repet, series, peso, dia);
        exercicio.add(exe);
    }
    
    public void zerar(){
        exercicio.clear();
    }
    
    public void listar(){
        for (int index = 0; index < exercicio.size(); index++) {
            System.out.println(index + ": ");
            exercicio.get(index).info();
        }
    }
    
    public void apagar(int index){
        exercicio.remove(index);
    }
}
