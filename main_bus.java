public class main_bus {
    public static void main(String[] args) {

        Bus bus1 = new Bus(100);
        Bus bus2 = new Bus(200);

        {
            bus1.showBus();
            bus2.showBus();

            System.out.println("");
            bus1.showPassenger();

            System.out.println("");
            bus1.showOil();

            System.out.println("");
            bus1.showOil();

            System.out.println("");
            bus1.showPassenger();

            System.out.println("");
            bus1.showPassenger();

            /*System.out.println("");
            System.out.println("<속도변경>");
            bus1.speed();*/

            System.out.println("");
            bus1.showOil();
            System.out.println("");
        }
    }
}
