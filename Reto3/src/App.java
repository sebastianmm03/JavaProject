public class App {
    public static void main(String[] args) throws Exception {
        SchoolGradingSystem SZS=new SchoolGradingSystem();
        SZS.loadData();
        System.out.printf("%.2f %n",SZS.stat1());
        System.out.println(SZS.stat2());
        System.out.println(SZS.stat3());
        System.out.println(SZS.stat4());
    }
}