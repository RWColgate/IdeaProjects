package pl.sda.zadania;

public class Zadania_1_1 {
    /*
    Zadanie 1: Napisz aplikację HelloWorld - która wypisuje napis HelloWorld (posłuż się System.out.println());
Zadanie 2: Napisz aplikację w której zadeklaruj dwie zmienne liczbowe, przypisz do nich dwie dowolne wartości. PRZYPISZ DO NICH wartości inicjalne i przemnóż je przez siebie. Wynik działania wypisz na konsoli (System.out.println).
Zadanie 3: Zadeklaruj 3 zmienne - zmienna 'a', zmienna 'b', zmienna 'c'. Przypisz jej 3 wartości - ważne żeby były różne. Następnie wykonaj na nich następujące działania:
            a) przepisz wartości - do zmiennej 'a' przypisz wartość 'b', do zmiennej 'b' przypisz wartość 'c', do zmiennej 'c' przypisz wartość 'a'.
            b) wypisz wartości na ekran.
Zadanie 4:
    Zadeklaruj zmienne logiczne (boolean) które noszą nazwe:
    jest_cieplo
    wieje_wiatr
    swieci_slonce

    oraz zmienne:
    ubieram_sie_cieplo - jesli nie jest cieplo lub wieje wiatr
    biore_parasol - jesli nie swieci slonce ale nie wieje wiatr
    ubieram_kurtke - jesli wieje, nie ma slonca i nie jest cieplo
Zadanie 5: Zadeklaruj dwie zmienne - 'waga' oraz 'wzrost'. Przypisz do nich jakieś wartości.
            Stwórz instrukcję warunkową ('if') który sprawdza czy osoba (np. taka która wchodzi
            na kolejkę/rollercoaster) jest wyższa niż 150 cm wzrostu i nie przekracza wagą 180 kg.
Zadanie 5
    a: Dopisz do poprzedniej aplikacji dodatkową zmienną - wiek. Jeśli osoba jest młodsza niż 10 lat, lub starsza niż 80, to nie może wejść na kolejkę.
    b: Dopisz/zmień do/w poprzedniej aplikacji - osoba może wejść na kolejkę jeśli jej wzrost jest od 150 do 220 cm wzrostu.
    c: Dopisz deskryptywne wyjasnienia. Jesli osoba nie moze wejsc na kolejke, to wypisz na konsole odpowiedni komunikat dlaczego. np.
                    Jesli osoba nie moze wejsc z powodu wagi, to powinien sie wypisac komunikat ze nie moze wejsc bo przekracza limit wagowy
                    Jesli osoba nie moze wejsc z powodu wieku, to powinien sie wypisac INNY komunikat o tym ze nie moze wejsc z powodu wieku.

Zadanie 6:
    Napisz aplikację której zadaniem jest liczenie srednich ocen z kilku przedmiotów.
        - ocena_matematyka
        - ocena_chemia
        - ocena_j_polski
        - ocena_j_angielski
        - ocena_wos
        - ocena_informatyka
        Aplikacja ma wyliczac średnią wszystkich ocen, srednią ocen z przedmiotów ścisłych (matematyka, chemia, informatyka), oraz średnią z ocen przedmiotów humanistycznych (pozostałe).
        Wszystkie trzy średnie mają być wypisane na ekran. Zwróć uwagę na zaokrąglenia.
        Jeśli którakolwiek z ocen jest niedostateczna, lub średnia z ocen z którejś części jest niedostateczna, to wyświetl napis:
        Ocena z [część] jest niedostateczna.
Zadanie 7:
        Napisać program służący do konwersji wartości temperatury podanej w stopniach
        Celsjusza na stopnie w skali Fahrenheita (stopnie Fahrenheita = 1.8 * stopnie
        Celsjusza + 32.0)
Zadanie 8:
    Zadeklaruj trzy zmienne (liczby). Wypisz na ekran wszystkie z nich, a następnie wypisz na ekran największą oraz najmniejszą z nich.
Zadanie 9:
    Posługując się stringami oraz Scannerem. Wykonaj zadanie:
    zmodyfikuj zadanie z rollercoasterem (zadanie 5). Na początku aplikacji były 3 zmienne.
    Tym razem nie przypisuj do nich stałych wartości, tylko załaduj je z
    wejścia od użytkownika.
Zadanie 10:
    Napisać program obliczający należny podatek dochodowy od osób ﬁzycznych. Program ma pobierać od użytkownika dochód i po obliczeniu wypisywać na ekranie należny podatek. Podatek obliczany jest wg. następujących reguł:
    • do 85.528 podatek wynosi 18% podstawy minus 556,02 PLN,
    • od 85.528 podatek wynosi 14.839,02 zł + 32% nadwyżki ponad 85.528,00
Zadanie 11:
    Napisać program realizujący funkcje prostego kalkulatora, pozwalającego na wykonywanie operacji dodawania, odejmowania, mnożenia i dzielenia na dwóch liczbach rzeczywistych. Program ma identyﬁkować sytuację wprowadzenia błędnego symbolu działania oraz próbę dzielenia przez zero. Zastosować instrukcję if else do wykonania odpowiedniego działania w zależności od wprowadzonego symbolu operacji. Scenariusz działania programu:
        a) Program wyświetla informację o swoim przeznaczeniu.
        b) Wczytuje pierwszą liczbę.
        c) Wczytuje symbol operacji arytmetycznej: +, -, *, /.
        d) Wczytuje drugą liczbę.
        e) Wyświetla wynik lub - w razie konieczności - informację o niemożności wykonania działania.
Zadanie 12:
     Napisać program, który pobiera od użytkownika liczbę całkowitą dodatnią, a następnie wyświetla na ekranie kolejno wszystkie liczby niepatrzyste nie większe od podanej liczby. Przykład, dla 15 program powinien wyświetlić 1, 3, 5, 7, 9, 11, 13, 15.
        B)
            Napisać program, który wykorzystuje pętle i wypisuje liczby podzielne przez 3 lub przez 5 w przedziale od 3 do 100 (3,5,6,9,10,...)
        C)
            Napisać program, który wykorzystuje pętle i wczytuje od użytkownika przedział liczbowy (użytkownik ma podać dolną granicę zakresu i górną) (początek i koniec przedziału), a następnie wypisz wszystkie liczby z tego przedziału podzielne przez 6.
Zadanie 13:
    Napisać program pobierający od użytkownika dwie liczby całkowite A oraz B, A < B, a następnie wyznaczający sumę ciągu liczb od A do B, czyli sumę ciągu (A,A + 1,...,B). Obliczenia należy wykonać dwukrotnie stosując kolejno pętle: while, for.
        Przykład: Dla A = 4 i B = 11 program powinien wyświetlić: 60 60
Zadanie 14*:
    Napisz program który wypisuje litery od 'a' do 'z';
Zadanie 15:
    Napisz program, który wypisuje “Hello World” zadaną przez użytkownika ilość razy.

Zadanie 16:
    Napisz program, który wypisuje “Hello World” dopóki użytkownik podaje liczby większe od 0.
Zadanie 17:
    Napisać program, który wczytuje od użytkownika liczbę całkowitą dodatnią n, a następnie wyświetla na ekranie wszystkie potęgi liczby 2 nie większe, niż podana liczba. Przykładowo, dla liczby 71 program powinien wyświetlić:
    1 2 4 8 16 32 64
Zadanie 18:
        Napisać program, który pobiera od użytkownika ilość liczb N, a następnie wczytuje
        N liczb całkowitych od użytkownika.
        W następnej kolejności program powinien wyświetlić sumę największej oraz najmniejszej z podanych liczb oraz ich średnią arytmetyczną.
     */
}
