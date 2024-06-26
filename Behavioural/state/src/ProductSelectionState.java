public class ProductSelectionState implements VendingMachineState{
    @Override
    public void handleRequest()
    {
        System.out.println("Select item to be dispensed..");
    }
}