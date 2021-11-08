public class StartFoodProduction implements State {
    public void action(Context context) {
        System.out.println("Started food production");
        context.setState(this);
    }

    public String toString(){
        return "Started food production";
    }
}