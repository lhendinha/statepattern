public class main {
    public static void main(String[] args) {
        Context context = new Context();

        StartFoodProduction startState = new StartFoodProduction();
        startState.action(context);

        System.out.println(context.getState().toString());

        StopFoodProduction stopState = new StopFoodProduction();
        stopState.action(context);

        System.out.println(context.getState().toString());
    }
}
