package poogym;

import java.util.List;
public class Ficha extends Exercicio {
    private List<Exercicio> exercicio;
    
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
