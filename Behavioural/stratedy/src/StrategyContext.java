public class StrategyContext {
    private Strategy strategy;
    void setStrategy(Strategy strategy)
    {
        this.strategy = strategy;
    }
    String executeWays()
    {
        return strategy.getWays();
    }
}
