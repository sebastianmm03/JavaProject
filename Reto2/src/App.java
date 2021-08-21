public class App {
    public static void main(String[] args) throws Exception {
        SchoolGradingSystem S1=new SchoolGradingSystem();
        S1.readData();
        System.out.printf("%.2f %n",S1.question1());
        System.out.println(S1.question2());
        System.out.println(S1.question3());
        System.out.println(S1.question4());
    }
}