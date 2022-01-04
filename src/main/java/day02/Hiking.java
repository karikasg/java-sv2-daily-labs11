package day02;

import java.util.List;

public class Hiking {

    List<Double> altitudes;

    public Hiking(List<Double> altitudes) {
        this.altitudes = altitudes;
    }

    public double getPlusElevation() {
        double sum = 0;
        double dif;
        if (altitudes.size()>1) {
            for (int i=0 ; i < altitudes.size()-1; i++) {
                dif = altitudes.get(i+1) - altitudes.get(i);
                if (dif > 0) {
                    sum += dif;
                }
            }
        }
        return sum;
    }
}
