package pl.sda.obiektowosc.zad16;

public class Czas {
    private int godziny;
    private int minuty;
    private int dni;

    public Czas(int godziny, int minuty, int dni) {
        this.godziny = godziny;
        this.minuty = minuty;
        this.dni = dni;
    }

    @Override
    public String toString() {
        if (dni == 1) return String.format("%02d : %02d i %d dzien", godziny, minuty, dni);
        else return String.format("%02d : %02d i %d dni", godziny, minuty, dni);
    }

    public Czas dodaj(Czas t) {
        int godziny = t.godziny + 10;
        int minuty = t.minuty + 20;
        int ile = 0;
        do {
            if (godziny > 24) {
                godziny -= 24;
                ile++;
            }
            if (minuty > 60) {
                minuty -= 60;
                godziny += 1;
            }
        } while (godziny > 24 || minuty > 60 || godziny < 0 || minuty < 0);
        return new Czas(godziny, minuty, ile);
    }

    public Czas odejmij(Czas t) {
        int godziny = t.godziny - 10;
        int minuty = t.minuty - 29;
        int ile = 0;
        do {
            if (godziny > 24) {
                godziny -= 24;
                ile++;
            }
            if (godziny < 0) {
                godziny += 24;
                ile--;
            }
            if (minuty > 60) {
                minuty -= 60;
                godziny += 1;
            }
            if (minuty < 0) {
                minuty += 60;
                godziny -= 1;
            }
        } while (godziny > 24 || minuty > 60 || godziny < 0 || minuty < 0);
        return new Czas(godziny, minuty, ile);
    }

    public Czas pomnoz(Czas t) {
        int godziny = t.godziny * 2;
        int minuty = t.minuty * 3;
        int ile = 0;
        do {
            if (godziny > 24) {
                godziny -= 24;
                ile++;
            }
            if (godziny < 0) {
                godziny += 24;
                ile--;
            }
            if (minuty > 60) {
                minuty -= 60;
                godziny += 1;
            }
            if (minuty < 0) {
                minuty += 60;
                godziny -= 1;
            }
        } while (godziny > 24 || minuty > 60 || godziny < 0 || minuty < 0);
        return new Czas(godziny, minuty, ile);
    }
}
