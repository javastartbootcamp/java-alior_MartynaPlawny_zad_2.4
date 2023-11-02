package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Category kategoria1 = new Category("włoskie", "dania z kuchni włoskiej");
        Category kategoria2 = new Category("słodycze", "coś słodkiego dla każdego");

        Product produkt1 = new Product("pesto pistacjowe", "340EUR", "pesto pistacjowe podane z makaronem penne", kategoria1);
        Product produkt2 = new Product("pizza", "100EUR", "pizza z serem mozarella, oliwkami i serem parmigiano", kategoria1);
        Product produkt3 = new Product("panna cotta", "200USD", "panna cotta ze śmietany, wanilii i cukru", kategoria2);
        Product produkt4 = new Product("pierogi ruskie", "150PLN", "tradycyjne pierogi ruskie z serem białym, cebulą i skwarkami", null);

        SpecialOffer ofertaSpecjalna = new SpecialOffer("świąteczna promocja - szaleństwo", "2023-11-02 do 2-23-12-31", 0.2f, produkt1);

        System.out.println("Produkt pierwszy:");
        produkt1.pokazInfo();
        System.out.println("\nProdukt drugi:");
        produkt2.pokazInfo();
        System.out.println("\nProdukt trzeci:");
        produkt3.pokazInfo();
        System.out.println("\nProdukt czwarty:");
        produkt4.pokazInfo();

        System.out.println("\nOferty specjalne:");
        ofertaSpecjalna.pokazInfo();
    }
}