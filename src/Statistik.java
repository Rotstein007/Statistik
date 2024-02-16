public class Statistik {

    static double berechneMittelwert () {
        int anzahl = 0;
        int summe = 0;

        while (true) {
            int eingabe = TastaturEingabe.readInt("Zahl Eingeben: ");

            if (eingabe < 0) break;

            anzahl++;
            summe += eingabe;
        }

        return (double)summe / anzahl;
    }

}