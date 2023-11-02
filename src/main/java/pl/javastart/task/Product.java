package pl.javastart.task;

public class Product {
    String nazwa;
    String cena;
    String opis;
    Category kategoria;

    Product(String n, String c, String o, Category k) {
        nazwa = n;
        cena = c;
        opis = o;
        kategoria = k;
    }

    void pokazInfo() {
        boolean maKategorie = kategoria != null;
        String wyswietlInfoDlaKategorii;
        if (maKategorie) {
            wyswietlInfoDlaKategorii = kategoria.nazwa;
        } else {
            wyswietlInfoDlaKategorii = "brak";
        }

        System.out.printf("Nazwa produktu: %s\nCena: %s\nOpis: %s\nKategoria: %s\n",
                nazwa, cena, opis, wyswietlInfoDlaKategorii);
    }
}
