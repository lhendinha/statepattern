import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StateTest {
    private Context context;

    @BeforeEach
    void setUp() {
        context = new Context();
    }

    @Test
    void testStartFoodProduction() {
        System.out.println("Running: testStartFoodProduction");

        StartFoodProduction startState = new StartFoodProduction();

        startState.action(context);

        assertEquals(context.getState().toString(), "Started food production");
    }

    @Test
    void testStopFoodProduction() {
        System.out.println("Running: testStopFoodProduction");

        StopFoodProduction stopState = new StopFoodProduction();

        stopState.action(context);

        assertEquals(context.getState().toString(), "Stopped food production");
    }
}
