package pl.sda.zadania;

public class Zadania_1 {
    /*
    Zadanie 19*:
    Napisać program, który pobiera od użytkownika ciąg liczb całkowitych. Pobieranie danych kończone jest podaniem wartości 0 (nie wliczana do danych). W następnej kolejności program powinien wyświetlić sumę największej oraz najmniejszej z podanych liczb oraz ich średnią arytmetyczną.
Wskazówka:
    Nie jest potrzebna tablica.
Wskazówka:
    Czytaj liczby tak długo aż wczytana liczba nie jest 0 (while).

Zadanie 20:
    Gra w ”Za dużo, za mało”. Komputer losuje liczbę z zakresu 1 . . . 100, a gracz
    (użytkownik) ma za zadanie odgadnąć, co to za liczba poprzez podawanie kolejnych
    wartości. Jeżeli podana wartość jest:
        • większa – wyświetlany jest komunikat „Podałeś za dużą wartość”,
        • mniejsza – wyświetlany jest komunikat „Podałeś za małą wartość”,
        • identyczna z wylosowaną – wyświetlany jest komunikat „Gratulacje” i gra
            się kończy.
Zadanie 21:
    Napisać program rysujący w konsoli „choinkę” złożoną ze znaków gwiazdki (*).
    Użytkownik programu powinien podać liczbę całkowitą n, n > 0, określającą
    wysokość choinki (liczbę wierszy).
    Przykład: dla n = 5 wynik powinien wyglądać następująco:
            *
           ***
          *****
         *******
        *********

Zadanie 22:
    Napisać program, dla podanej liczby całkowitej wyświetla jej dzielniki. Przykładowo, dla liczby 21 dzielniki to: 1, 3, 7, 21.
Zadanie 23*: (bardzo matematyczne)
    Napisać program, który sprawdza, czy podana liczba całkowita n,n > 1, jest liczbą pierwszą.
Zadanie 24:
    Napisać program, który:
        • utworzy tablicę 10 liczb całkowitych i wypełni ją wartościami losowymi z
            przedziału [−10, . . . , 10],
        • wypisze na ekranie zawartość tablicy,
        • wyznaczy najmniejszy oraz najwięszy element w tablicy,
        • wyznaczy średnią arytmetyczną elementów tablicy,
        • wyznaczy ile elementów jest mniejszych, ile większych od średniej.
        • wypisze na ekranie zawartość tablicy w odwrotnej kolejności, tj. od ostatniego
            do pierwszego.

        Wszystkie wyznaczone wartości powinny zostać wyświetlone na ekranie.
        Wylosowane liczby:
                -3 9 2 -10 -3 -4 -1 -5 -10 8
            Min: -10, max: 9
            Średnia: -1,00
            Mniejszych od śr.: 6
            Większych od śr.: 3
            Liczby w odwrotnej kolejności:
                8 -10 -5 -1 -4 -3 -10 2 9 -3
Zadanie 25:
    Napisać program, który utworzy tablicę 20 liczb całkowitych z przedziału 1 . . . 10,
    a następnie wypisze na ekranie ile razy każda z liczb z tego przedziału powtarza
    się w tablicy.
        Przykład:
            Wylosowane liczby: 6 5 4 5 10 5 8 3 10 6 6 6 4 3 2 8 1 3 4 7
            Wystąpienia:
                1 - 1
                2 - 1
                3 - 3
                4 - 3
                5 - 3
                6 - 4
                7 - 1
                8 - 2
                9 - 0
                10 - 2
Zadanie 26*:
    Napisać program, który wczytuje od użytkownika liczbę całkowitą, a następnie
    wyświetla jej reprezentację w kodzie binarnym (ZM). Podczas konwersji liczby
    należy kolejne jej bity zapisywać w pomocniczej tablicy liczb całk. o rozmiarze
    32. Konwersji należy dokonać korzystając z operacji dzielenia całkowitego oraz
    operacji modulo.

    Przykład:
        Wejście:
            -75 (liczba podana przez użytkownika)
        Wynik:
            Liczba -75 binarnie: 1.1001011
Zadanie 27:
    Stwórz program który na wejściu przyjmuje liczbę N a następnie na wyjściu wypisuje tabliczkę mnożenia do tej liczny (tj. do NxN).
Zadanie 28*:
    Napisz program, który pobiera od użytkownika dodatnią liczbę naturalną n i
    tworzy tablicę a zmiennych typu logicznego (boolean) o rozmiarze n×n. Następnie
    program powinien wypełnić utworzoną tablicę, tak by a[i][j] = true jeżeli liczby
    (i+1) oraz (j+1) są względnie pierwsze, tzn. nie mają wspólnych dzielników poza
    1. Tak utworzoną tablicę należy wypisać na ekranie, przy czym dla wartości true
    należy wyświetlić znak ”+”, natomiast dla wartości false znak ”.”. Przykład:
        Podaj liczbę (> 0): 10
                  1 2 3 4 5 6 7 8 9 10
                1 + + + + + + + + + +
                2 + . + . + . + . + .
                3 + + . + + . + + . +
                4 + . + . + . + . + .
                5 + + + + . + + + + .
                6 + . . . + . + . . .
                7 + + + + + + . + + +
                8 + . + . + . + . + .
                9 + + . + + . + + . +
                10 + . + . . . + . + .
Zadanie 29:
     Napisać program, który wczytuje od użytkownika ciąg znaków, a następnie wy-
     świetla informację o tym ile razy w tym ciągu powtarza się jego ostatni znak.
     Przykład, dla ciągu „Abrakadabra” program powinien wyświetlić 4, ponieważ
     ostatnim znakiem jest literka „a”, która występuje w podanym ciągu łącznie 4
     razy
Zadanie 30 A:
    Napisać program, który wczytuje od użytkownika ciąg znaków, a następnie tworzy
    łańcuch będący odwróceniem podanego łańcucha i wyświetla go na ekranie.
    Przykładowo, dla łańcucha „Kot” wynikiem powinien być łańcuch „toK”.

Zadanie 30 B*:
    Spróbuj odwrócić ciąg stosując rekurencję.
Zadanie 31:
    Napisać program, który wczytuje od użytkownika ciąg znaków, a następnie sprawdza, czy podany ciąg jest palindromem.
Zadanie 32:
        Napisać program, który sumuje cyfry w tekście podanym przez użytkownika.
            Przykład:
                "Ala ma 1 psa i 2 koty. Jola ma 10 rybek i 2 papugi."
            Wynik:
                6
Zadanie 33:
    Napisz program, który sprawdzi, czy w podanym przez użytkownika wyrażeniu
    arytmetycznym nawiasy są poprawnie sparowane. Wyrażenie podawane jest jako
    pojedynczy łańcuch znaków. Program powinien wyświetlić stosowny komunikat.
    Przykład a:
        "2 * (3.4 - (-7)/2)*(a-2)/(b-1)))"
    Wynik:
        Błędne sparowanie nawiasów
    Przykład b:
        "2 * (3.4 - (-7)/2)*(a-2)/(b-1))"
    Wynik:
        OK
Zadanie 34:
    Napisz program, który umożliwia szyfrowanie podanego ciągu znaków przy użyciu
    szyfru Cezara, który jest szczególnym przypadkiem szyfru podstawieniowego
    monoalfabetycznego.
    Użytkownik program podaje tekst do zaszyfrowania oraz liczbę n, o którą przesunięty
    jest alfabet za pomocą którego szyfrujemy tekst. Dla uproszczenia można
    przyjąć, że łańuch wejściowy składa się tylko z małych liter alfabetu angielskiego,
    tj. ’a’ – ’z’ (26 znaków) oraz spacji.
    Przykład 1.
        Podaj łańcuch znaków do zaszyfrowania: abrakadabraz
        Podaj przesunięcie: 2
        Zaszyfrowany tekst: cdtcmcfcdtcb
    Przykład 2.
        Podaj łańcuch znaków do zaszyfrowania: cdtcmcfcdtcb
        Podaj przesunięcie: -2
        Zaszyfrowany tekst: abrakadabraz
Zadanie 35:
    1.  Napisz program, który prosi użytkownika o dwie liczby a i b, i wyświetla wynik dzielenia a/b. Jeżeli b jest ujemne program powinien wyświetlić odpowiedni komunikat.
        a.  Wariant 1: Zastosuj instrukcję if
        b.  Wariant 2: Zastosuj instrukcję try-catch
Zadanie 36:
    Stwórz program obliczający równanie kwadratowe (http://matematyka.pisz.pl/strona/54.html). Na wejściu użytkownik podaje wartość zmiennych A, B i C,
    a na wyjściu wypisują sie odpowiednie komunikaty o wartościach x1 i x2 lub x0, a także wartość delty.

Dodatkowe:
1.  Napisz program (*metodę) który:
        a.  Liczy sumę liczb w tablicy
        b.  Liczy średnia liczb w tablicy
        c.  Liczy iloczyn liczb w tablicy
        d.  Liczy silnię
        e.  Liczy sumę ciągu arytmetycznego
        f.  Liczy sumę ciągu geometrycznego
        g.  *Zlicza ilość wystąpień danego znaku w Stringu
2.  Napisz program, który dla tablicy słów:
        a.  Sumuje ilość liter w słowach
        b.  Liczy średnią długość słowa
3.  Napisz program który rysuje:
        a.  Prostokąt
        Np. 2x4:
        ****
        ****
        b.  Trójkąt
        c.  Pusty prostokąt
        Np. 2x4
        ******
        *    *
        *    *
        ******
        d.  * Pusty trójkąt
        e.  * Koło
     */
}
