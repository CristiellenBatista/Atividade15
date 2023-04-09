import java.util.Scanner;

public class Atividade15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tamanho em metros quadrados da área a ser pintada: ");
        double area = sc.nextDouble();

        double litros_de_tinta = area / 3.0;
        int latas_de_tinta = (int) Math.ceil(litros_de_tinta / 18.0);
        double preco_total = latas_de_tinta * 80.0;

        System.out.printf("Serão necessárias %d latas de tinta, ao preço total de R$ %.2f.%n", latas_de_tinta, preco_total);

        sc.close();
    }
}

