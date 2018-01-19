package pl.sda.typywyliczeniowe.zad1;

import java.util.Random;

public enum GatunekPiwa {
    LAGER,
    PILZNER,
    STOUT,
    PORTER,
    MIODOWE;

    private static final GatunekPiwa[] VALUES = values();
    private static final int Size = VALUES.length;

    public static GatunekPiwa getRandomBeer(){
        Random r = new Random();
        return VALUES[r.nextInt(Size)];
    }

}
