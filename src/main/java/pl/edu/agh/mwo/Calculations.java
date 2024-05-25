package pl.edu.agh.mwo;

import java.util.*;

public class Calculations {
    //Liczba pit stopów w wyścigu
    static ArrayList<Integer> pitStopAmount =new ArrayList<>();

    public static ArrayList<Integer> getPitStopAmount() {
        return pitStopAmount;
    }

    public static void setPitStopAmount(ArrayList<Integer> pitStopAmount) {
        Calculations.pitStopAmount = pitStopAmount;
    }

    //czas trwania najdłuższego pit stopu wraz z numerem kierowcy
    static HashMap<String, String> pitStopTimeWithIDDriver = new HashMap<String, String>();

    public HashMap<String, String> getPitStopTimeWithIDDriver() {
        return pitStopTimeWithIDDriver;
    }
    public void setPitStopTimeWithIDDriver(HashMap<String, String> pitStopTimeWithIDDriver) {
        this.pitStopTimeWithIDDriver = pitStopTimeWithIDDriver;
    }

    //średnie czas trwania pit stopów w całym wyścigu
    int [] avgTimeOfPitStops;

    public int[] getAvgTimeOfPitStops() {
        return avgTimeOfPitStops;
    }

    public void setAvgTimeOfPitStops(int[] avgTimeOfPitStops) {
        this.avgTimeOfPitStops = avgTimeOfPitStops;
    }

    //numer pierwszego i ostatniego zjazdu na pit stop
    static ArrayList<Integer> FirstAndLastPitStopNumber = new ArrayList<>();

    public static ArrayList<Integer> getFirstAndLastPitStopNumber() {
        return FirstAndLastPitStopNumber;
    }

    public void setFirstAndLastPitStopNumber(ArrayList<Integer> firstAndLastPitStopNumber) {
        FirstAndLastPitStopNumber = firstAndLastPitStopNumber;
    }

    static int pitStopAmountMethod(){
        return pitStopAmount.size();
    }

    static HashMap<String, String>  pitStopTimeWithIDDriverMethod () {

        return null;
    }

    public static double findAverageTimeOfPitStops(int[] avgTimeOfPitStops) {
        int sum = Arrays.stream(avgTimeOfPitStops).sum();
        return (double) sum / avgTimeOfPitStops.length;
    }

    public static ArrayList<Integer> FirstAndLastPitStopNumberMethod (){

        ArrayList<Integer> lista = FirstAndLastPitStopNumber;

        return lista;
    }

}
