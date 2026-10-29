package conversor;

public class Conversor {
    public double converter(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public double converter(double quilometros, boolean paraMilhas) {
        return paraMilhas ? quilometros * 0.621371 : quilometros / 0.621371;
    }

    public String converter(String texto) {
        return texto.toUpperCase();
    }
}
