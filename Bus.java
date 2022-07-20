import java.util.Scanner;

public class Bus {

    int busNumber;
    String status = "운행중입니다";
    int oil = 100;
    int max_passenger = 30;
    int speed = 40;


    public Bus(int busNumber) {this.busNumber = busNumber;}
    public void showBus() {System.out.println("버스번호 : " + busNumber);}
    public void showPassenger(){
        status = "운행중"; //승객은 운행중일때만 태울 수 있도록.
        Scanner passenger = new Scanner(System.in);
        System.out.print("탑승객 : ");
        int p = passenger.nextInt();
        if (p>30){System.out.println("초과 승객입니다!!!");}
        else{
        System.out.println("남은 좌석 : " + (max_passenger - p));

        int price = p*1000;
        System.out.println("버스누적요금 : " + price);}
    }
    public void speed(){
        System.out.println("현재 주유량은 " + oil + "입니다.");
        if (oil >=10){
            System.out.println("현재 속도는 " + speed + "입니다");
            System.out.print("변경할 속도를 말씀해주세요(+-표시필수) : ");
            Scanner changed_speed = new Scanner(System.in);
            int c_speed = changed_speed.nextInt() + speed;
            if (c_speed<0){ c_speed=0;}
            System.out.println("현재 속도는 " + c_speed + "입니다.");}
        else{System.out.println("주유량이 적어 속도변경을 할 수 없습니다");}
    }


    public void showOil(){
        System.out.print("주유량 변화(+-표시필수) : ");
        Scanner changed_oil = new Scanner(System.in);
        int c_oil = changed_oil.nextInt();
        oil += c_oil;
        if (oil<0){oil = 0;}
        status = "차고지행"; //주유량 변화가 생기면 무조건 차고지행. 차고지에서 주유한다는 개념.
        System.out.println("상태 : "+status);
        System.out.println("주유량 : " + oil);

        if(oil<10){System.out.println("주유가 필요합니다!!");}
    }
}



