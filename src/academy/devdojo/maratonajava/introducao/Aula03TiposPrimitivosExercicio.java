package academy.devdojo.maratonajava.introducao;

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Kirito";
        String endereco = "Av Joao das Galileias";
        double salario = 5432.12;
        String dataRecebimentoSalario = "20/12/2021";

        String relatorio = "Eu " + nome + " morando no endereço " + endereco + " confirmo que recebi o salario de " +
                salario + " na data de " + dataRecebimentoSalario + ".";
        System.out.println(relatorio);
    }
}
