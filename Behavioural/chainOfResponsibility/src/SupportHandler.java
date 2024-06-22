public interface SupportHandler {
    void handleRequest(PriorityEnum priorityEnum);
    void setNextLevelHandler(SupportHandler nextLevelHandler);
}
