
public class Main {
    public static void main(String[] args) {
        Corpo corpo = new Corpo(1.76, 73);
        double imc = corpo.imc();
        System.out.printf("IMC: %.2f \n", imc);
        corpo.analisaImc(imc);
        corpo.setSexo('m');
        corpo.setIdade(24);
        corpo.setBraco(32);
        corpo.setCintura(57);
        corpo.setPanturrilha(37);
        double tmb = corpo.tmb();
        System.out.println("Taxa metabolica basal: " + tmb + " cal");
        System.out.println("Quantidade de agua diaria: " + corpo.agua() + " mL");
        Scanner in = new Scanner(System.in);
        System.out.println("");
        corpo.getInfoGeral();
    }
}
