public class Main {

    public static void main(String[] args) {
        String nomeAluno = "Carlos";

        Calcular calculo = new Calcular();
        calculo.setNota1(8);
        calculo.setNota2(7);

        System.out.println("Aluno: " + nomeAluno);
        System.out.println("Media: " + calculo.getMedia());

        if (calculo.getMedia() >= 6) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}