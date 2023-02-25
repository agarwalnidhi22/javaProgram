package Oops1;


    class car{
        int gear;
        String color;
        void setGC(int x, String s){
            gear=x;
            color=s;
        }
        void display(){
            System.out.println(gear);
            System.out.println(color);
        }
    }
    class sportsCar extends car{
        void show(){
            setGC(4,"blue");
            display();
        }
    }
    class Inheritense{
        public static void main(String[] args) {
            sportsCar s1= new sportsCar();
            s1.display();

        }
    }


