public class StopFoodProduction implements State {
    public void action(Context context) {
        System.out.println("Stopped food production");
        context.setState(this);
    }

    public String toString(){
        return "Stopped food production";
    }
}