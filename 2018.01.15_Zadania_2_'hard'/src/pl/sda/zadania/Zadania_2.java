package pl.sda.zadania;

public class Zadania_2 {
    /*
    Zadania obiektowość:
Zadanie 1:
    Dodaj klasę Osoba o polach imie i wiek.
    Utwórz 3 osoby o różnych imionach i wieku.
    Wypisz ich dane w postaci:
    “Jestem <imie>, mam <wiek> lat.”

        a) stwórz do tego metodę printYourNameAndAge
        b) wypisz wartości używając metody toString
        c) wypisz dane używając metod getterów i setterów

Zadanie 2:
    Utwórz klasę TeddyBear, który będzie miał pole prywatne String name; Dodaj konstruktor, który przyjmie za parametr imię.
    Co to znaczy że pole jest prywatne?
    Dodaj metodę, która wyświetli imię misia;

Zadanie 3*:
    Stwórz klasę która reprezentuje dziennik w szkole.
    Zakładamy że dziennik ma zawsze 30 miejsc uczniów.
    Każdy dziennik posiada pole - ilość wpisanych uczniów.
    Dodaj metodę wypisania wszystkich uczniów.

    (Zakładamy że uczniowie to po prostu ich imiona i nazwiska - Lista obiektów klasy Student/Uczeń)
    (Stwórz metodę dodania ucznia i usunięcia ucznia)


Zadanie 4:
    Napisz program w którym jest jedna klasa 'Calculator'.
    Klasa reprezentuje model kalkulatora. Klasa powinna posiadać metodę:
        -   addTwoNumbers - która przyjmuje dwa parametry i zwraca wynik dodawania
        -   substractTwoNumbers - która przyjmuje dwa parametry i zwraca wynik odejmowania
        -   multiplyTwoNumbers - która przyjmuje dwa parametry i zwraca wynik mnożenia
        -   divideTwoNumbers - która przyjmuje dwa parametry i zwraca wynik dzielenia

    UWAGA! nie twórz pól klasy które reprezentują liczby działań. Podstawowym błędem popełnianym w tym zadaniu jest dodanie pól do klasy.
        Liczby na których masz wykonać działania są przekazywane jako argumenty/parametry metody!!!

    UWAGA! wynik jest zwracany z metody. W main'ie wykonaj działania na kalkulatorze, a następnie wartość zwróconą przypisz do zmiennej i wyświetl
        na konsoli

    Wszystkie metody zwracają wartości. Stwórz maina, a w nim jedną instancję klasy Calculator, a następnie przetestuj działanie wszystkich metod.
Zadanie 4*:
    Dodaj do kalkulatora powyżej obsługę komend. Użytkownik wpisuje komendy:
        dodaj 20 30
    i otrzymuje wynik dodawania.
        odejmij 20 30
    i otrzymuje wynik odejmowania
        pomnóż 20 30
    i otrzymuje wynik mnożenia
        podziel 20 30
    i otrzymuje wynik dzielenia

Zastosuj do tego pętlę while która ma trwać dopóki jest jakieś wejście:
while (scanner.hasNextLine())
 Zadanie 5:
        Stwórz program, a w nim:
            a) klasę kwadrat która jako parametr konstruktora przyjmuje długość krawędzi. w klasie stwórz metodę "obliczObwod" i "obliczPole" ktore ZWRACA wartości. Stwórz maina i przetestuj działanie.
            b) klasę prostokąt która przyjmuje w konstruktorze dwa parametry (długość obu boków) i stwórz  metodę "obliczObwod" i "obliczPole" ktora ZWRACA wartości pola i obwodu bryły. Stwórz maina i przetestuj działanie.
            c) klasę koło, która jako parametr przyjmuje promień. Dodaj w klasie koło metodę "obliczObwod" i "obliczPole" ktore ZWRACA wartości. Stwórz maina i przetestuj działanie.

Zadanie 6:
        Stwórz program a w nim klasę "BankAccount".
        konto bankowe powinno mieć metodę dodawania pieniędzy do konta, oraz odejmowania :
        (metoda addMoney która w parametrze przyjmuje ilosc pieniedzy do dodania oraz substractMoney która jako parametrz przyjmuje ilosc pieniedzy do odjecia).
        Dodaj do klasy metodę "printBankAccountStatus" która powinna wypisywać stan konta.
    UWAGA! nie twórz pól klasy do metod odejmowania i dodawania pieniedzy na koncie. To powinny być parametry metody!
Zadanie 7:
    Napisz klasę MyMath zawierającą poniższe metody dla typów int, double:
        - obliczanie wartości bezwzględnej z liczby: int abs(int a), double abs(double a)
        - obliczanie potęgi liczby: int pow(int a,int b), double pow(double a,int b)
    - odpowiedz na pytanie: czym jest polimorfizm metod i jak tutaj działa?

Zadanie 8:
    http://matematyka.pisz.pl/strona/54.html

    Napisz klasę QuadraticEquation (obliczanie równania kwadratowego) o trzech polach typu double a,b,c odpowiednim konstruktorze i metodach:
        - public double calculateDelta(),
        - public double calculateX1(),  - która sprawdza wartość delty i:
            a) jesli delta jest > 0 to podaje x1
            b) jesli delta jest < 0 to rzuca wyjatek DeltaLessThanZeroException
            c) jesli delta jest = 0 to zwraca x0
        - public double calculateX2().  - która sprawdza wartość delty i:
            a) jesli delta jest > 0 to podaje x2
            b) jesli delta jest < 0 to rzuca wyjatek DeltaLessThanZeroException
            c) jesli delta jest = 0 to zwraca wyjatek DeltaEqualsZeroException
    UWAGA! klasa nie powinna posiadać pola DELTA, ani X1 czy X2 !!! Wartość delta jest obliczana dynamicznie z metody. Wykorzystaj wywołanie metody obliczającej delte
            w innych metodach (np. calculateX2 czy calculateX1)
    Wartości trzech pól powinny być ustawiane w konstruktorze.
    Metody powinny obliczać wartości na podstawie wartości pól obiektu, a następnie zwracać wartości.
    Do obliczenia pierwiastka użyj:
        double pierwiastek = Math.sqrt(jakasWartosc);

Zadanie 9*:
    Do stworzenia jest aplikacja, w której stwórz klasę "Car" reprezentującą samochód.
    a)
    Samochód ma pola:
        - nazwę/markę,
        - ilość siedzeń,
        - pojemność silnika,
        - ilość koni mechanicznych,
        - obecną prędkość,
        - obecny przebieg,
        - rok produkcji

    Samochód ma metody:
    b)
        - getCarName - która ZWRACA nazwę/markę samochodu oraz obecny rok produkcji
    c)
        - addPassenger - która dodaje pasażera
        - removePassenger - która odejmuje pasażera
    d)
        - speedIncrease - która zwięsza obecną prędkość samochodu
        - speedDecrease - która zmniejsza prędkość obecną samochodu
        (samochód może przyspieszać lub zwalniać tylko jeśli jest minimum 1 pasażer[zakładamy że to kierowca])
    d)
        Zmodyfikuj samochód tak, aby mógł osiągać maksymalną prędkość nie wyższą niż (1.2*ilość koni mechanicznych) jeśli ma do 200 koni mechanicznych,
        oraz nie wyższą niż (1.0*ilość koni mechanicznych) jeśli ilość koni przekracza 200.

Zadanie 10*:
    Stwórz program, w programie stwórz klasę "Field" które reprezentuje planszę (pole) podobne do takiego
    jak gra w statki. Pole powinno posiadać tablicę dwuwymiarową KWADRATOWĄ zmiennych typu boolean.
    Każde pole posiada wartość true/false jeśli było/nie było sprawdzane.
    Wielkość tego pola powinna być określana w konstruktorze.

    dodaj metodę:
        - printField - która wypisuje na konsolę kwadrat i wartości pola.
            X - jeśli komórka była sprawdzana
            O - jeśli komórka nie była sprawdzana
        - checkCell - która jako parametrY przyjmuje współrzędną
            X oraz współrzędną Y komórki do sprawdzenia.
            Jeśli komórka nie była jeszcze sprawdzana to ją sprawdza,
            jeśli komórka była sprawdzana, to wypisuje komunikat że "komórka była sprawdzana".
        - w klasie Main w metodzie main dodaj instancję klasy "Field" a następnie dodaj obsługę
            komend ze Scanner'a, która pozwoli wywoływać metody printField oraz checkCell.

Zadanie 11 (LISTY - omówimy 06.10.2017) (na przykładzie ArrayList):
        Napisz metody (użyj pętli for i forEach):
            - Liczącą sumę liczb na liście
            - Liczącą iloczyn liczb na liście
            - Liczącą średnią liczb na liście
        * Napisz metodę liczącą:
            - Negujący wszystkie wartości logiczne na liście
            - Koniunkcję wartości logicznych na liście
            - Alternatywę wartości logicznych na liście
        Napisz klasę User o polach String name, String password. Utwórz listę typu User, dodaj do niej kilka obiektów, a następnie wypisz.

        Napisz program tworzący dziesięcioelementową listę i tablice liczb, a następnie sprawdzający ilu pozycjach wartości są identyczne.
            Przykład:
            Lista {1,2,4,2,5,12,3,2}
            Tablica {4,2,2,1,5,29,3,8}
                Wynik: 3
        *Napisz metodę która:
            - kopiuje listę
            - przepisuje listę do tablicy (podanej jako parametr)
            - przepisuje tablicę do listy (nowo utworzonej)
            - przepisuje dwie listy do jednej
            - przepisuje dowolną ilość list do jednej (varargs)
            - sprawdza, czy dwie listy są takie same

Zadanie 12*:
    Stwórz program, w programie stwórz klasę Circle, Square i Rectangle (lub skopiuj/użyj klas z zadania 7).
    Stwórz maina, a w nim obsługę komend:
        - oblicz [pole/obwód] [kwadrat/koło/prostokat] X Y

    gdzie:
        pole/obwód to opcja. Możemy wpisać jedno z dwóch.
        kwadrat/koło/prostokat to opcja. Możemy wpisać jedno z trzech.
        X oraz Y to długości boków/promienia. W przypadku koła podajemy tylko X jako długość promienia,
        w przypadku prostokątu podajemy X oraz Y, a w przypadku kwadratu również podajemy X.

Zadanie 13:
    Stwórz klasę Student która posiada:
        - pole numer indeksu
        - pole imie
        - pole nazwisko
        - listę ocen
    - kolekcję ocen:
        a) tablicę ocen (stwórz tablicę maksymalnie 100 ocen)
        b) listę ocen
        - metody getterów i setterów
        - metodę do obliczania średniej
        - metodę która zwraca true jeśli żadna z ocen w liście/tablicy ocen nie jest 1 ani 2,
            oraz false w przeciwnym razie.

Zadanie 14:
    Stwórz klasę 'paczka' która:
        - ma pole odbiorca
        - ma pole nadawca
        - ma pole 'czy została wysłana'
        - ma flagę 'czy jest zawartość'
        - dodaj gettery i settery
    Przetestuj aplikację w Main'ie.
        - dodaj domyślny (pusty) konstruktor, oraz konstruktor z odbiorcą i flagą zawartość,
        - ma metodę 'wyślij' która sprawdza czy jest zawartość, i czy jest odbiorca i wyświetla komunikat o nadaniu jeśli jest zawartość i odbiorca,
            oraz ustawia flagę 'czy została wysłana' na true.
        - ma metodę 'wyślij polecony' która sprawdza to samo co wyżej, ale sprawdza również czy
            nadawca jest ustawiony i pozwala wysłać tylko jeśli wszystkie pola są ustawione.
    Przetestuj aplikację w Main'ie.


Zadanie 15:
    Stwórz klasę Telefon która posiada:
        a)
        - pole 'czy dzwoni'
        - pole 'numer telefonu'
        - metody getterów i setterów dla wszystkich pól
        - metodę 'zadzwon' ktora zmienia wartość pola 'czy dzwoni' z false na true,
                ale tylko wtedy kiedy jest false(nie mozna wykonac drugiego polaczenia jesli juz dzwoni)
        - metode 'rozlacz' ktora zmienia wartosc pola 'czy dzwoni' na false z true,
                ale tylko wtedy kiedy jest true (kiedy trwa jakas rozmowa)
    Przetestuj aplikację w Main'ie
        b*)
        - pole 'zawartosc wyswietlacza' (String)
        - pole 'wybrany numer' (String)
        - zmodyfikuj metode zadzwon tak, zeby przyjmowala parametr (numer na ktory dzwonimy)
            po zmienieniu flagi 'czy dzwoni' na true ustaw 'wybrany numer' na numer z parametru.
            Ustaw pole 'zawartosc wyswietlacza' na tekst "Rozmowa z numer_telefonu".
    Przetestuj aplikację w Main'ie

Zadanie 16:
    Stwórz klasę Computer a w niej:
        pola:
            - nazwa komputera,
            - moc procesora(liczba zmiennoprzecinkowa),
            - rozmiar dysku (liczba całkowita),
            - wielkość pamięci RAM (liczba całkowita),
            - nazwa karty graficznej.
        metody:
            - stwórz gettery i settery do każdego pola OPRÓCZ karty graficznej,
            - stwórz metodę 'ustaw kartę graficzną' która ustawia pole 'nazwa karty graficznej' na jakąś wartość podaną w parametrze.
            - stwórz metodę 'czy posiada kartę graficzną' która zwraca true jeśli nazwa karty graficznej jest różna od null, lub false jeśli jest równa null.
            - stwórz metodę 'podaj moc obliczeniową' która zwraca:
                    (moc_procesora * 0.95 + (0.3 * ilość_pam_ram))  - jeśli nie ma karty graficznej
                    (moc_procesora * 1.45 + (0.25 * ilość_pam_ram))  - jeśli jest karta graficzna
            - stwórz metodę 'czy jest komputerem do gier'
                    - która zwraca true jeśli przelicznik mocy obliczeniowej z powyższej metody > 10
                    - która zwraca false jeśli przelicznik jest niższy niż 10.
    Przetestuj działanie programu w Main'ie
Zadanie 17*:
    Napisz generator (klasa z metodą “generate...()”): (gdzie trzy kropki to następne słowo, np. w przykładzie a, będzie to generateNumber())
        a) Kolejnych liczb.
        b) Kolejnych liczb w podanym przedziale. (przedział podawany w konstruktorze)
        c) Kolejnych liczb parzystych.
        d) Kolejnych wielokrotności liczby podanej w parametrze.
        e) Występujących na przemian wartości true, false.
        h) Kolejnych liter alfabetu (znaków unicode od a do z).


Zadanie 18**:
    Napisz klasę Person, Club, NoAdultException.
        a.  Klasa Person powinna zawierać, imię, nazwisko i wiek
        b.  Klasa Club powinna zawierać metodę enter(Person person), która wyrzuca wyjątek NoAdultException, jeżeli osoba jest niepełnoletnia.

Zadanie 19:
    Utwórz klasę FamilyMember z polem name i metodą introduce() która wypisuje komunikat "I am just a simple family member".
    Wykorzystaj dziedziczenie (extends FamilyMember ) w klasach Mother, Father, Son, Daugther.
    W metodzie introduce poszczególnych klas wpisz implementację:
        - i am mother ...
        - i am father ...
        - i am son ...
        - i am daughter ...

    Umieść rodzinę w liście i za pomocą pętli foreach wywołaj metodę introduce().

    B)
    Dodaj metodę (*abstrakcyjną) boolean isAdult do klasy FamilyMember, załóż że rodzice są zawsze dorośli, a dzieci nie.
    Nadpisz te metody w klasach podrzędnych.


Zadanie 20:
    Stwórz klasę nadrzędną Figure która posiada dwie metody abstrakcyjne:
        - metoda obliczPole
        - metoda obliczObwód
        Stwórz klasy podrzędne "Kwadrat", "Prostokąt", "Koło" które dziedziczą po Figure i
        zaimplementuj w nich metody obliczObwód i obliczPole. Stwórz maina, w tym mainie stwórz Listę
        obiektów Figure i dodaj kilka figur, a następnie w pętli foreach wypisz pola i obwody wszystkich figur.
        ** Zastosuj instanceof aby sprawdzić typ figury i wypisać dodatkowy komunikat o tym jaką figurę wypisujesz.

Zadanie 21:
    Stwórz klasę Citizen oraz klasy dziedziczące
        Peasant(Chłop),
        Townsman(Mieszczanin),
        King(Król),
        Soldier(Żołnierz)
    Wszystkie klasy posiadają pole imie
    Citizen powinien być klasą abstrakcyjną która posiada metodę abstrakcyjną 'canVote' która zwraca true dla
        townsman'a i soldier'a, ale false dla chłopa i króla.
    Stwórz klasę Town która posiada listę Citizenów. Dodaj do niej kilku citizenów (różnych w mainie) i
    stwórz metody howManyCanVote które zwracają ilość osób które mogą głosować.
    Stwórz w klasie Town metodę "whoCanVote" która zwraca imiona osób które mogą głosować.
     */
}
