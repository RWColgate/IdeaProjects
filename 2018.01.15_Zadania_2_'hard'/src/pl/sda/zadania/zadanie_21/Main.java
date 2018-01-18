package pl.sda.zadania.zadanie_21;

public class Main {
    public static void main(String[] args) {
        Town town = new Town();

        Peasant chlop = new Peasant("chlop");
        Townsman  mieszczanin = new Townsman("mieszczanin");
        King krol = new King("krol");
        Soldier zolnierz = new Soldier("zolnierz");

        town.citizenList.add(chlop);
        town.citizenList.add(mieszczanin);
        town.citizenList.add(krol);
        town.citizenList.add(zolnierz);

        town.whoCanVote();
        town.howManyCanVote();
    }
}
