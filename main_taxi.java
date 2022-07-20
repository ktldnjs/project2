public class main_taxi {
    public static void main(String[] args) {
        Taxi taxi1 = new Taxi(8508);
        Taxi taxi2 = new Taxi(1188);

        {
            taxi1.showTaxi();
            taxi2.showTaxi();

            System.out.println("");
            taxi1.showInfo();

            System.out.println("");
            taxi1.taxiPassenger();
            taxi1.showTaxiPassenger();

            System.out.println("");
            taxi1.changeOil();

            System.out.println("");
            System.out.println("<요금 결제>");
            taxi1.tPay();

            System.out.println("");
            taxi1.taxiPassenger();

            System.out.println("");
            taxi1.taxiPassenger();
            taxi1.showTaxiPassenger();

            System.out.println("");
            taxi1.changeOil();

            System.out.println("");
            System.out.println("<요금 결제>");
            taxi1.tPay();
        }
    }
}


