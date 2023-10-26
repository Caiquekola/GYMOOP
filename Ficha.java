package poogym;

import java.util.ArrayList;
public class Ficha {
    private ArrayList<Exercicio> exercicio = new ArrayList<Exercicio>();

    public ArrayList<Exercicio> getExercicio() {
        return exercicio;
    }

    public void setExercicio(ArrayList<Exercicio> exercicio) {
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
