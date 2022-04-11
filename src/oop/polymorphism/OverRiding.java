package oop.polymorphism;
class Bank{
    int retofInterest(){
        return 0;
    }
    void cal(int rate,int year){
        int totalInterest=rate*year;
    }
    void cal(int rate,int month,int year){
        int totalInterest=rate*month*year;
    }

}
class IFIC extends Bank{
    int retofInterest(){
        return 5;
    }
    public void cal(int rate, int year){
        System.out.println(rate*year);
    }

}
class UCBL extends Bank{
    int retofInterest(){
        return 8;
    }
}
class Agrani extends Bank{
    int retofInterest(){
        return 3;
    }
}

public class OverRiding {
    public static void main(String[] args) {
        IFIC ific=new IFIC();
        System.out.println("IFIC Interest Rate: "+ific.retofInterest());
        ific.cal(5,2);

        UCBL ucbl=new UCBL();
        System.out.println("UCBL Interest Rate: "+ucbl.retofInterest());

        Agrani agrani=new Agrani();
        System.out.println("Agrani Interest Rate: "+agrani.retofInterest());
    }

}
