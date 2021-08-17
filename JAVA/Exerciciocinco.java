public class Exerciciocinco {
public static void main(String[] args) {
    int a = 10;
    int b = 10;
    int c = 10;
    int delta = (b * b) - (4 * a * c);
    int resultado1 = (-b - delta) / (2 * a);
    int resultado2 = (-b + delta) / (2 * a);

    System.out.println(resultado1);
    System.out.println(resultado2);
}
}