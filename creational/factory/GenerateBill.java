package creational.factory;

public class GenerateBill {
    public static void main(String[] args) {
        GetPlanFactory getPlanFactory = new GetPlanFactory();
        IPlan iPlan = getPlanFactory.getPlan("DOMESTICPLAN");
        iPlan.setRate();
        System.out.println("DOMESTICPLAN " + iPlan.calculateBill(20));

        iPlan = getPlanFactory.getPlan("INSTITUTIONALPLAN");
        iPlan.setRate();
        System.out.println("INSTITUTIONALPLAN " + iPlan.calculateBill(20));

        iPlan = getPlanFactory.getPlan("COMMERCIALPLAN");
        iPlan.setRate();
        System.out.println("COMMERCIALPLAN " + iPlan.calculateBill(20));
    }
}
