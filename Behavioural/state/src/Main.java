public class Main {
    public static void main(String[] args) {
        StateContext stateContext = new StateContext();

        stateContext.setVendingMachineState(new ProductSelectionState());
        stateContext.handleRequest();

        stateContext.setVendingMachineState(new HandlePayment());
        stateContext.handleRequest();

        stateContext.setVendingMachineState(new DispensingState());
        stateContext.handleRequest();
    }
}