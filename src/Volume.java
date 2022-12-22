package ua.hillel.homework2;

public class Volume {
    public static void main(String[] args) {
        double a, b, h, volume, length;
        a = 5;
        b = 8;
        h = 4;
        volume = a*b*h;
        length = (a+b)*2;
        System.out.println("Об'єм паралелепіпеда=" +volume + "\n" +"Периметр="+ length);
    }
}
