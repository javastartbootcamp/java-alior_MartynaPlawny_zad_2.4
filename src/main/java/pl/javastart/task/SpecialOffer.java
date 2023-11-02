package pl.javastart.task;

public class SpecialOffer {
    String opis;
    String czasObowiazywania;
    float rabat;
    Product produkt;

    SpecialOffer(String o, String cz, float r, Product p) {
        opis = o;
        czasObowiazywania = cz;
        rabat = r;
        produkt = p;
    }

    void pokazInfo() {
        System.out.printf("%s\nCzas obowiązywania: %s\nRabat: %s\nDla produktu: %s\n",
                opis, czasObowiazywania, rabat, produkt.nazwa);
    }
}
