package pl.sda.zadanie1;

import jdk.nashorn.internal.objects.NativeUint8Array;
import org.omg.CORBA.PRIVATE_MEMBER;

public class Garaz<T extends Samochod> {
    private T miejsce1;
    private T miejsce2;

    @Override
    public String toString() {
        return "miejsce1=" + miejsce1 +", miejsce2=" + miejsce2;
    }

    public void zaparkujAuto(T auto){
        if(miejsce1==null){
            miejsce1=auto;
            System.out.printf("%s zaparkowane na 1 miejscu\n",auto.getMarka());
        }else if( miejsce2==null){
            System.out.printf("%s zaparkowane na 2 miejscu\n",auto.getMarka());
            miejsce2=auto;
        }else{
            throw new InsufficieentSpaceException();
        }
    }
    public void wyprowadzAuto(T auto){
        if(miejsce1==auto){
            miejsce1=null;
        }else if( miejsce2==auto){
            miejsce2=null;
        }else{
            throw new RuntimeException(String.format("Nie ma twojego %s w garazu",auto.getMarka()));
        }
    }
}
