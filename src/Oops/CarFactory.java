package Oops;

public class CarFactory {
    public static void main(String[] args) {
        Car nidhi = new Car();
        //after taking car
        nidhi.Color="blue";
        nidhi.Airbags=0;
        System.out.println(nidhi.Color);
        System.out.println(nidhi.Airbags);

        System.out.println("----------------------------------");

        Car Amrita = new Car();
        //after taking
        Amrita.Headlight=3;
        Amrita.hasFm=false;
        System.out.println(Amrita.hasFm);
        System.out.println(Amrita.Headlight);

    }
}
