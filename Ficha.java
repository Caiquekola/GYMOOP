package poogym;

<<<<<<< HEAD
import java.util.List;
public class Ficha {
    private List<Exercicio> exercicio;

    public List<Exercicio> getExercicio() {
        return exercicio;
    }

    public void setExercicio(List<Exercicio> exercicio) {
=======
import java.util.ArrayList;
public class Ficha {
    private ArrayList<Exercicio> exercicio = new ArrayList<Exercicio>();

    public ArrayList<Exercicio> getExercicio() {
        return exercicio;
    }

    public void setExercicio(ArrayList<Exercicio> exercicio) {
>>>>>>> 6f9d593475ca4ba177ace3fc0850b66af44b8631
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
