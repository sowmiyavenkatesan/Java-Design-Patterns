public class LevelOneSupport implements SupportHandler{

    SupportHandler nextLevelHandler;

    @Override
    public void setNextLevelHandler(SupportHandler nextLevelHandler)
    {
        this.nextLevelHandler = nextLevelHandler;
    }

    @Override
    public void handleRequest(PriorityEnum priorityEnum)
    {
        if(priorityEnum == PriorityEnum.BASIC)
        {
            System.out.println("Level 1 Support handled the request");
        }
        else if(nextLevelHandler != null)
        {
            System.out.println("Request escalated to Level 2");
            nextLevelHandler.handleRequest(priorityEnum);
        }
    }
}