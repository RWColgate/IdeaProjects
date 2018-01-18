package pl.sda.zadania.zadanie_8;

public class ZadanieTresc {
    /*

Zadanie 8:
    http://matematyka.pisz.pl/strona/54.html

    Napisz klasę QuadraticEquation (obliczanie równania
     kwadratowego) o trzech polach typu double a,b,c odpowiednim konstruktorze i metodach:
        - public double calculateDelta(),
        - public double calculateX1(),  - która sprawdza wartość delty i:
            a) jesli delta jest > 0 to podaje x1
            b) jesli delta jest < 0 to rzuca wyjatek DeltaLessThanZeroException
            c) jesli delta jest = 0 to zwraca x0
        - public double calculateX2().  - która sprawdza wartość delty i:
            a) jesli delta jest > 0 to podaje x2
            b) jesli delta jest < 0 to rzuca wyjatek DeltaLessThanZeroException
            c) jesli delta jest = 0 to zwraca wyjatek DeltaEqualsZeroException
    UWAGA! klasa nie powinna posiadać pola DELTA, ani X1 czy X2 !!! Wartość delta jest
    obliczana dynamicznie z metody. Wykorzystaj wywołanie metody obliczającej delte
            w innych metodach (np. calculateX2 czy calculateX1)
    Wartości trzech pól powinny być ustawiane w konstruktorze.
    Metody powinny obliczać wartości na podstawie wartości pól obiektu, a następnie
    zwracać wartości.
    Do obliczenia pierwiastka użyj:
        double pierwiastek = Math.sqrt(jakasWartosc);
     */
}
