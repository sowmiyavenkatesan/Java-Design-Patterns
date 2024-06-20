import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int option;
        StrategyContext strategyContext = new StrategyContext();
        String resp = "";
        System.out.println("Enter the mode of transportation \n 1. Bi-Cycle 2. Walk 3. Train \n");
        Scanner sc = new Scanner(System.in);
        option = sc.nextInt();
        switch (option)
        {
            case 1:
                strategyContext.setStrategy(new BiCycleStrategy());
                break;
            case 3:
                strategyContext.setStrategy(new TrainStrategy());
                break;
            default:
                strategyContext.setStrategy(new WalkStrategy());
        }
        resp = strategyContext.executeWays();
        System.out.println(resp);
    }
}