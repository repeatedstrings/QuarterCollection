public class StateQuarterLocator {
    private static QuarterCollection quarterCollection;

    static {
        quarterCollection = new QuarterCollection();
    }

    public static StateQuarter getQuarter(String state){

        StateQuarter stateQuarter = quarterCollection.getQuarter(state);

        if(stateQuarter != null){
            return stateQuarter;
        }

        QuarterCollectionAdder context = new QuarterCollectionAdder();
        StateQuarter stateQuarter1 = (StateQuarter)context.lookup(state);
        quarterCollection.addQuarter(stateQuarter1);
        return stateQuarter1;
    }
}
