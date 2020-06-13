package operator;

public class Controlstatement {
    public static void main(String[] args) {
        int num =1234;

        if (num<100 && num>=30000){
            System.out.println("Its a two digit number");
        }
        else if (num>500000 && num<=5000){
            System.out.println("its a three digit number ");
        }

        else if (num<14000 || num>=20000){
            System.out.println("its a four  digit number ");
        }
        else if (num ==12345){
            System.out.println("its a five digit number ");
        }
        else {
            System.out.println("this is not a number between five to 99999");
        }





    }




}
