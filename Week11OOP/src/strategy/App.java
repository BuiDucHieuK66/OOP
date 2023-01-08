package strategy;

public class App {
    public static void main(String[] args) {
        Context context = new Context();
        int strategyId = 0;
        if (strategyId == 1) {
            context.setStrategy(new ConcreteStrategyAdd());
        } else if (strategyId == 2) {
            context.setStrategy(new ConcreteStrategyMultiply());
        } else {
            context.setStrategy(new ConcreteStrategySubtract());
        }
        System.out.println(context.executeStrategy(2, 3) + "");
    }
}
