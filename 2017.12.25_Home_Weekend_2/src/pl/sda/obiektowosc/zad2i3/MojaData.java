package pl.sda.obiektowosc.zad2i3;

public class MojaData {
    private int dni;
    private int miesiecy;
    private int lat;

    public MojaData(int dni, int miesiecy, int lat) {
        this.dni = dni;
        this.miesiecy = miesiecy;
        this.lat = lat;
    }

    public int getDni() {
        return dni;
    }

    public int getMiesiecy() {
        return miesiecy;
    }

    public int getLat() {
        return lat;
    }

    public void wyswietlDate() {
        String[] zestawMiesiace = new String[]{
                "sty", "lut", "mar", "kwi", "maj", "cze", "lip",
                "sie", "wrz", "paz", "lis", "gru"
        };
        String pom = null;
        for (int i = 0; i < zestawMiesiace.length; i++) {
//            pom = Integer.parseInt(miesiecy);
            if ((miesiecy -= 1) == i) {
                pom = zestawMiesiace[i];
                break;
            }
        }
        System.out.printf("%02d %s %d\n", dni, pom, lat);
    }
}

