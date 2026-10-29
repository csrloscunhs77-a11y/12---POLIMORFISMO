package conversor;

public class TesteConversor {
    public static void main(String[] args) {
        Conversor conversor = new Conversor();

        double fahrenheit = conversor.converter(25.0);
        System.out.printf("25 °C = %.1f °F%n", fahrenheit);

        double milhas = conversor.converter(10.0, true);
        System.out.printf("10 km = %.2f milhas%n", milhas);

        String maiusculo = conversor.converter("sobrecarga de métodos");
        System.out.println("Texto em maiúsculas: " + maiusculo);
    }
}
