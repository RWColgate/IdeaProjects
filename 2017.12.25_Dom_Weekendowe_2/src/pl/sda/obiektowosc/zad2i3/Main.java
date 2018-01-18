package pl.sda.obiektowosc.zad2i3;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Main {
        private static final SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        private static final Calendar calendar = Calendar.getInstance();

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        MojaData mojaData1 = new MojaData(24,2,2015);
        MojaData mojaData2 = new MojaData(Calendar.DAY_OF_MONTH, Calendar.MONTH, Calendar.YEAR);


        mojaData1.wyswietlDate();
//        dateFormat.get2DigitYearStart();
//        Date date = new Date();
//        System.out.println(Calendar.MONTH);
//        System.out.println(Calendar.YEAR);
//        System.out.println(localDate.getMonth());

//        mojaData1.wyswietlDate();
//        mojaData2.wyswietlDate();
//
//        System.out.println("Przerwa");
//
//        Wydarzenie wydarzenie = new Wydarzenie("WydarzenieX",mojaData2);
//        System.out.print(wydarzenie.ilePozodstaloLat()+" ");
//        System.out.print(wydarzenie.ilePozostaloMiesiecy()+ " ");
//        System.out.println(wydarzenie.ilePozostaloDni());
//
//        System.out.println("Przerwa_2");
//
//        wydarzenie.toString();
    }

}
