public class StateContext {
    private VendingMachineState vendingMachineState;

    public void setVendingMachineState(VendingMachineState vendingMachineState)
    {
        this.vendingMachineState = vendingMachineState;
    }

    public void handleRequest()
    {
        vendingMachineState.handleRequest();
    }
}
