public class Main {
    public static void main(String[] args) {

        String[] ListaProfessores = {"Alana", "Thiago", "Samanta", "Alexia", "Ordilei"};
        for (int contador = 0; contador < ListaProfessores.length; contador++) {
            System.out.println("o indice atual é " + contador);
            if (contador == 0) {
                System.out.println("o numero de indice do(a) professor(a)" + ListaProfessores[contador] + "é Zero");
            } else if (contador % 2 == 0) {
                System.out.println("o numero de indice do(a) professor(a)" + ListaProfessores[contador] + "é par");
            } else {
                System.out.println("o numero de indice do(a) professor(a)" + ListaProfessores[contador] + "é impar");


            }
        }
    }

}
