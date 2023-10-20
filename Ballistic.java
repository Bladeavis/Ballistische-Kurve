public class Ballistic {
    public static void main(String[] args) {
        double höhe_x = Double.parseDouble(args[0]);
        double geschwindigkeit_v = Double.parseDouble(args[1]);
        double zeit_t = Double.parseDouble(args[2]);
        double g = 9.81;
        double ergebnis = höhe_x + geschwindigkeit_v * zeit_t - g * zeit_t * zeit_t / 2;
        System.out.println(ergebnis);
    }
}