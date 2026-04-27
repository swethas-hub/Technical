public class Main {
    public static void main(String[] args) {
        int heads = 15;
        int legs = 40;

        int rabbits = (legs - 2 * heads) / 2;
        int chickens = heads - rabbits;

        System.out.println("Rabbits: " + rabbits);
        System.out.println("Chickens: " + chickens);
    }
}
