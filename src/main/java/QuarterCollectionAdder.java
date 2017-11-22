public class QuarterCollectionAdder {
    public Object lookup(String state){

        if(state.equalsIgnoreCase("MARYLAND")){
            System.out.println("Do I have a Maryland Quarter?  \n\tLet's add it!");
            return new Maryland();
        }
        else if (state.equalsIgnoreCase("TEXAS")){
            System.out.println("Do I have a Texas Quarter?  \n\tLet's add it!");
            return new Texas();
        }
        return null;
    }
}