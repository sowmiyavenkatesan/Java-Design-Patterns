public class LevelThreeSupport implements SupportHandler{
    SupportHandler nextLevelHandler;

    @Override
    public void setNextLevelHandler(SupportHandler nextLevelHandler)
    {
        this.nextLevelHandler = nextLevelHandler;
    }

    @Override
    public void handleRequest(PriorityEnum priorityEnum)
    {
        if(priorityEnum == PriorityEnum.ADVANCED)
        {
            System.out.println("Level 3 Support handled the request");
        }
        else if(nextLevelHandler != null)
        {
            System.out.println("Escalate to other respective department");
        }
    }
}