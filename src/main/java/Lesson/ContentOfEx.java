package Lesson;

public class ContentOfEx {
    //02
    public static final String L02_EX01 = "Utwórz 2 listy: studentów oraz ocen. Lista ocen powinna pozwalać na przypisanie dowolnej liczby ocen dla dowolnej ilości studentów.\nPrzygotuj metodę obliczającą " +
            "średnią ocen dla każdego studenta oraz wyświetlającą wynik.\n";
    public static final String L02_EX02 = "Napisz metodę, porównującą czas wykonania podobnych operacji (dodawanie,\n" +
            "usuwanie, pobranie danych) dla identycznych danych w LinkedList i ArrayList.\n" +
            "Wykorzystaj klasy Instant oraz Duration:\n";
    public static final String L02_EX03 = "Dodaj listę firmy do klasy Pracownik. Lista powinna stanowić pola tej klasy. Napisz\n" +
            "metodę, która zmodyfikuje dowolny obiekt tej klasy, dodając do listy nazwy firm\n" +
            "pracownika (wpisane z klawiatury).\n";
    public static final String L02_EX04 = "Utwórz listę, do której losowo dodasz oceny z zakresu ocen na studiach\n" +
            "(2,3,3.5,4,4.5,5). Napisz metodę, która jako parametr otrzyma liczbę ocen i wypełni\n" +
            "listę ich odpowiednią ilością. Przeszukaj listę i wskaż procentowy udział każdej z ocen\n" +
            "w całości wyników.";
    public static final String L02_EX05 = "Utwórz zbiór, przechowujący imiona osób na roku. Napisz metodę, która wczyta\n" +
            "określoną liczbę imion (metoda powinna zawierać stosowną pętlę). Wyświetl\n" +
            "zawartość zbioru. Wykonaj zadanie dla zbiorów różnego typu, zaobserwuj różnice.";
    public static final String L02_EX06 = "Wykorzystując zbiór, przygotuj metodę która jako parametr przyjmie słowo\n" +
            "i wyświetli wszystkie zawarte w nim litery (bez duplikatów, np. dla ALA należy\n" +
            "wyświetlić A, L).";
    public static final String L02_EX07 = "Przygotuj 3 mapy różnych typów. Do każdej dodaj identyczne pary klucz – wartość\n" +
            "(dowolne). Uruchom program w trybie debugowania i zaobserwuj różnice\n" +
            "w prezentowaniu wartości w mapie.\n";
    public static final String L02_EX08 = "Przygotuj mapę, która przechowa oceny z dowolnej liczby przedmiotów";
    public static final String L02_EX09 = "• Przygotuj klasę Person (imię, nazwisko, wiek, zawód). Przygotuj mapę, która jako\n" +
            "klucz przyjmie pesel, a jako wartość – obiekt klasy Person. Zaimplementuj metodę\n" +
            "dodającą do mapy oraz wyświetlającą dane pobrane z mapy.";

    //03
    public static final String L03_EX01 = "Napisz metodę, wczytującą imię, nazwisko, zawód oraz maksymalną szerokość pola (dowolnej  zmiennej).\n" +
            "Sprawdź,  czy  którakolwiek  ze  zmiennych  jest  dłuższa  od założonej maksymalnej szerokości pola. Wykorzystaj złożony warunek logiczny.";
    public static final String L03_EX02 = "Napisz metodę, która otrzyma tablicę Stringów oraz prefix i sprawdzi, ile elementów tablicy  posiada  wskazany  prefix.\n" +
            "Metoda  powinna  zwracać  typ  całkowity. Wykorzystaj pętlę for–each";
    public static final String L03_EX03 = "Zmodyfikuj  (sparametryzuj)  poprzednią  metodę  tak,  by  umożliwiała  ona  także sprawdzenie, ile elementów posiada określony sufix.\n" +
            "Działanie metody (sprawdzanie prefixu / sufixu) ma zależeć od wartości parametru. ";
    public static final String L03_EX04 = "Napisz funkcję, pobierającą ciąg znaków, początek oraz koniec obszaru wycinania.\n" +
            "Zwróć  wycięty  fragment  tekstu  w  formacie:  Tekst  oryginalny:   tekst_oryginalny, zakres  wycinania: początek,\nkoniec,  wynik  wycinania: wynik, długość  wyciętego ciągu: dlugosc";
    public static final String L03_EX05 = "Napisz  funkcję  typu  boolean,  sprawdzającą  czy  wprowadzone  (polskie)  imię  jest imieniem żeńskim. ";
    public static final String L03_EX06 = "Napisz  funkcję,  która  sprawdzi  jaki  znak  najczęściej  występuje  w  podanym  ciągu znaków. Następnie dokonaj podziału ciągu (split) na podstawie wyszukanego znaku.\n" +
            "Wyświetl  informacje  o  liczbie  elementów  w  powstałej  tablicy  oraz  znaku,  na podstawie którego dokonano podziału.";
    public static final String L03_EX07 = "Przygotuj  klasę  Person,  zawierającą  następujące  pola:  imię,  nazwisko,  pesel,  wiek, data urodzenia, płeć.\n" +
            "Wczytaj dane: imię, nazwisko, pesel. Przygotuj metody, które wypełnią  pola  płeć,  wiek  i  data  urodzenia\n" +
            "na  podstawie  danych  z  innych  pól (wykorzystaj odpowiednie metody z klasy String).";
    public static final String L03_EX08 = "Napisz  metodę,  która  utworzy  ciąg  znaków,  wykorzystując  dane  z  obiektuklasy Person.\n" +
            "Na końcu każdej linii dodaj stałą, zawierającą nazwę przedmiotu. Wykorzystaj klasę StringBuilder.";
    public static final String L03_EX09 = "Przygotuj  metodę, która otrzyma jako parametr listę obiektów klasy Person i zwróci listę String (wykorzystaj metodę z poprzedniego zadania).";
    public static final String L03_EX10 = "Napisz  metodę,  która  dla  dowolnego  ciągu  znaków  wyświetli  w  kolejnych  liniach wartości znaków z tablicy ascii wraz ze znakami w formacie: znak : numerAscii.";
    public static final String L03_EX11 = "Napisz  metodę,  która  dla  dowolnego  ciągu  znaków  wyświetli  wszystkie  zawarte wnim litery oraz ilość ich wystąpień.";
    public static final String L03_EX12 = "Napisz metodę  która  pobierze  od  użytkownika  hasło  dostępu  i  porówna  je zzadeklarowanymwzorem. Jeśli hasła będą zgodne –należy wyświetlić komunikat „przyznano  dostęp”.\n" +
            "Jeśli  hasła  nie  są  zgodne  ale  są  tej  samej długości –należy wyświetlić błędne znaki i ich pozycje, " +
            "np.:\no Pozycja 1 –oczekiwano A otrzymano \n" +
            "Rozbuduj poprzedni  kod  tak,  by  wyświetlał  różnice  również  w  przypadku  haseł oróżnej długości";

    //04
    public static final String L04_EX01 = "•Przygotuj klasę Person, zawierającą pola, pozwalające na przechowanie powyższych danych.\n" +
            "• Przygotuj klasę, zawierającą stałe (ciąg wejściowy oraz niezbędne indeksy).\n" +
            "• Przygotuj klasę, pozwalającą na wypełnienie obiektu klasy Person danymi.\n" +
            "• Zaimplementuj wyświetlanie danych z obiektu.\n" +
            "• Dodaj klasę adres –zmodyfikuj obiekt klasy Person";

    //05
    public static final String L05_EX01 = "Napisz  funkcję,  która  sprawdzi,  czy przekazane  w  parametrze  słowo  jest palindromem.\n" +
            "Funkcja powinna być napisana w sposób optymalny –jej wykonywanie powinno zostać zakończone, gdy uzyskana zostanie odpowiednia informacja.\n"
            + "Zmodyfikuj funkcję tak, by działała poprawnie również dla pełnych zdań.";
    public static final String L05_EX02 = "•Utwórz stałą –ciąg zawarty w treści zadania.\n" +
            "•W poniższym ciągu:\nThere's an evolutionary imperative why we give a crap about our family and friends. And there's an evolutionary imperative why we don't give a crap about anybody else. If we loved all people indiscriminately, we couldn't function.House MD\n" +
            "•Znajdź najdłuższy oraz najkrótszy wyraz. Wskaż ich miejsce (kolejność) w ciągu. Jeżeli więcej niż jedno słowo posiada taką samą długość, za najkrótsze / najdłuższe należy uznać ostatnie z nich." +
            "•Wyświetl  najkrótsze  i  najdłuższe  słowo –jeśli  w  ciągu  występuje  więcej  słów odługości najkrótszego lub najdłuższego słowa –wyświetl wszystkie.\n" +
            "•Wyświetl wszystkie słowa z zamienionym jednym znakiem (użytkownik musi określić znak do zmiany oraz znak, na który należy zmienić) wykorzystaj pętlę for –each.\n" +
            "•Wszystkie  zadania  powinny  być  zrealizowane  przez  oddzielne  metody  w  klasie odowolnej nazwie.";

}
