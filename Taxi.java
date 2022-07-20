import java.util.Scanner;

public class Taxi {

    int taxiNumber;
    String status = "일반";
    int oil = 100;
    int tPrice;
    int tP; int max_tP=4;
    int tAddPrice;

    public Taxi(int taxiNumber) {
        this.taxiNumber = taxiNumber;
    }

    public void showTaxi() {System.out.println("택시번호 : " + taxiNumber);}
    public void showInfo() {
        System.out.println("주유량 : " + oil);
        System.out.println("상태 : " + status);
    }

    public void taxiPassenger(){
        Scanner tPassenger = new Scanner(System.in);
        System.out.print("탑승객 : ");
        tP = tPassenger.nextInt();
        if (tP>4){System.out.println("최대 승객 수 초과!!");}

    }
    public void showTaxiPassenger(){
        Scanner tDestination = new Scanner(System.in);
        System.out.print("목적지 : ");
        String tDe = tDestination.next();

        Scanner tDistance = new Scanner(System.in);
        System.out.print("목적지까지 거리(km) : ");
        int tDi = tDistance.nextInt();

        System.out.println("");
        if (tP<5){
        System.out.println("탑승 승객 수 : " + tP);
        System.out.println("잔여 승객 수 : " + (max_tP-tP));
        System.out.println("기본 요금 확인 : " + 3000);
        System.out.println("목적지 : " + tDe);
        System.out.println("목적지까지 거리 : " + tDi + "km");
        tPrice = 1000*(tDi-1) + 3000;
        System.out.println("지불할 요금 : " + tPrice);
        status = "운행중";
        System.out.println("상태 : " + status);}

    }

    public void changeOil(){
        System.out.print("주유량 변화(부호표시필수) : ");
        Scanner changed_oil = new Scanner(System.in);
        int c_oil = changed_oil.nextInt();
        int Oil = oil+c_oil;
        oil = Oil;
        if (oil<0){oil = 0;}
    }

    public void tPay(){
        System.out.println("주유량 : " + oil);
        tAddPrice += tPrice;
        if (oil < 10){
            status="운행불가";
            System.out.println("상태 : "+status);
            System.out.println("누적요금 : " + tAddPrice +"원");
            System.out.println("주유가 필요합니다!!");}
        else{System.out.println("누적요금 : " + tAddPrice +"원");}
    }
}


