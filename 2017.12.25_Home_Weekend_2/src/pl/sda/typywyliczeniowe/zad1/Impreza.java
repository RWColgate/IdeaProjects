package pl.sda.typywyliczeniowe.zad1;

import java.util.Random;

public class Impreza {
    private GatunekPiwa gatunekPiwa;
    private String typPiwa;

    public Impreza(GatunekPiwa gatunekPiwa, String typPiwa) {
        this.gatunekPiwa = gatunekPiwa;
        this.typPiwa = typPiwa;
    }

    public Impreza(GatunekPiwa randomBeer) {

    }


    @Override
    public String toString() {
        return "Impreza{" +"gatunekPiwa=" + gatunekPiwa +", typPiwa='" + typPiwa;
    }
}
