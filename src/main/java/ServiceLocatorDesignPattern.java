import java.io.IOException;

public class ServiceLocatorDesignPattern {
    public static void main(String[] args) throws IOException {
        System.out.println("\tSomeone gave you a Maryland Quarter...");
        StateQuarter stateQuarter = StateQuarterLocator.getQuarter("Maryland");
        stateQuarter.add();
        System.in.read();

        System.out.println("\tSomeone gave you a Texas Quarter...");
        stateQuarter = StateQuarterLocator.getQuarter("Texas");
        stateQuarter.add();
        System.in.read();

        // now this should be added to the collection
        System.out.println("\n");
        System.out.println("\tSomeone gave you a Maryland Quarter... Don't I have one?");
        stateQuarter = StateQuarterLocator.getQuarter("Maryland");
        System.in.read();

        System.out.println("\tSomeone gave you a Texas Quarter... Don't I have one?");
        stateQuarter = StateQuarterLocator.getQuarter("Texas");
    }
}