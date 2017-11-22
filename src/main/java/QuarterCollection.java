import java.util.ArrayList;
import java.util.List;

/**
 * This is the bit of the application that we are interacting with.
 * In Minecraft, this is like the gameRegistry;
 *
 */
public class QuarterCollection {

    private List<StateQuarter> quarters;

    public QuarterCollection(){
        quarters = new ArrayList<StateQuarter>();
    }

    public StateQuarter getQuarter(String state){

        for (StateQuarter quarter : quarters) {
            if(quarter.getState().equalsIgnoreCase(state)){
                System.out.println("I already have a " + state + " quarter");
                return quarter;
            }
        }
        return null;
    }

    public void addQuarter(StateQuarter newStateQuarter){
        boolean exists = false;

        for (StateQuarter stateQuarter : quarters) {
            if(stateQuarter.getState().equalsIgnoreCase(newStateQuarter.getState())){
                exists = true;
            }
        }
        if(!exists){
            quarters.add(newStateQuarter);
        }
    }
}