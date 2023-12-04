package poogym;

import java.util.ArrayList;

public class Ficha {
    
    private ArrayList<Exercicio> exercicio = new ArrayList<Exercicio>();
    private ArrayList<Exercicio> listagem = new ArrayList<Exercicio>();
    
    public Ficha(){
        novo("Supino inclinado c/ barra", "peito", 12, 4);
        novo("Crucifixo reto", "peito", 12, 3);
        novo("Supino reto c/ barra", "peito", 12, 3);
        novo("Voador", "peito", 12, 3);
        novo("Frances deitado c/ halteres", "triceps", 12, 3);
        novo("Corda cross", "triceps", 12, 4);
        novo("Barra cross", "triceps", 12, 3);
        novo("Triceps testa", "triceps", 12, 4);
        novo("Serrote", "costas", 12, 4);
        novo("Levantamento terra", "costas", 12, 3);
        novo("Pulley frontal", "costas", 12, 3);
        novo("Pulley atras", "costas", 12, 4);
        novo("Remada baixa", "costas", 12, 4);
        novo("Rosca alternada c/ banco inclinado", "biceps", 12, 4);
        novo("Martelo em pe", "biceps", 12, 4);
        novo("Rosca punho", "antebraco", 12, 4);
        novo("Leg press 45 graus", "pernas", 12, 4);
        novo("Extensor de pernas", "pernas", 12, 4);
        novo("Flexora sentada", "pernas", 12, 4);
        novo("Adutora", "pernas", 12, 4);
        novo("Stiff", "pernas", 12, 4);
        novo("Desenvolvimento maquina", "ombro", 10, 3);
        novo("Elevacao lateral c/ halteres sentado", "ombro", 10, 4);
        novo("Encolhimento c/ halteres", "trapezio", 10, 4);
        novo("Encolhimento c/ barra", "trapezio", 10, 4);
    }

    public void setListagem(ArrayList<Exercicio> listagem) {
        this.listagem = listagem;
    }
    
    public ArrayList<Exercicio> getExercicio() {
        return exercicio;
    }

    public void setExercicio(ArrayList<Exercicio> exercicio) {
        this.exercicio = exercicio;
    }
    
    public void adicionar(int index, double peso, String dia){
        listagem.get(index).setPeso(peso);
        listagem.get(index).setDiaSemana(dia);
        exercicio.add(listagem.get(index));
    }
    
    public void zerar(){
        exercicio.clear();
    }
    
    public void listar(){
        for (int index = 0; index < exercicio.size(); index++) {
            System.out.println("\n------------- " + index + " -------------");
            exercicio.get(index).info();
        }
    }
    
    public void listarOpcoes(){
        for (int index = 0; index < listagem.size(); index++) {
            System.out.println("------------- " + index + " -------------");
            listagem.get(index).info();
        }
    }
    
    public void apagar(int index){
        if(index < exercicio.size()) exercicio.remove(index);
        else System.out.println("Indice inexistente!");
    }
    
    private void novo(String nome, String musculo, int repet, int series){
        Exercicio exe = new Exercicio(nome, musculo, repet, series);
        listagem.add(exe);
    }
    
    public void novo(String nome, String musculo, int repet, int series, double peso, String dia){
        Exercicio exe = new Exercicio(nome, musculo, repet, series, peso, dia);
        exercicio.add(exe);
    }
}
