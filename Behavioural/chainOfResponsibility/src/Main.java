public class Main {
    public static void main(String[] args) {

        // This design pattern focus on delegating the request to the respective object based
        // on the needs.
        SupportHandler levelOne = new LevelOneSupport();
        SupportHandler levelTwo = new LevelTwoSupport();
        SupportHandler levelThree = new LevelThreeSupport();

        levelOne.setNextLevelHandler(levelTwo);
        levelTwo.setNextLevelHandler(levelThree);

        System.out.println("Sending intermediate request to Level 1");
        levelOne.handleRequest(PriorityEnum.INTERMEDIATE);
    }
}