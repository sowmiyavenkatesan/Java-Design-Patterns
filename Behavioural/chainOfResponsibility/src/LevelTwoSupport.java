public class LevelTwoSupport implements SupportHandler{
    SupportHandler nextLevelHandler;

    @Override
    public void setNextLevelHandler(SupportHandler nextLevelHandler)
    {
        this.nextLevelHandler = nextLevelHandler;
    }

    @Override
    public void handleRequest(PriorityEnum priorityEnum)
    {
        if(priorityEnum == PriorityEnum.INTERMEDIATE)
        {
            System.out.println("Level 2 Support handled the request");
        }
        else if(nextLevelHandler != null)
        {
            System.out.println("Request escalated to Level 3");
            nextLevelHandler.handleRequest(priorityEnum);
        }
    }
}