import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PowerUnitTest {

    public PowerUnit pu1 = new PowerUnit("DE600 v2", Producers.DeepCool, 600f, "Ventilators",
            6);


    @Test
    public void EqualsOverride_True_SimilarityCheck() throws Exception {
        PowerUnit pu2 = new PowerUnit("DE600 v2", Producers.DeepCool, 600f, "Ventilators", 6);
        Assertions.assertEquals(this.pu1, pu2);
    }

    @Test
    public void EqualsOverride_False_SimilarityCheck() throws Exception {
        PowerUnit pu2 = new PowerUnit("DE600 v2", Producers.DeepCool, 6000f, "Ventilators", 6);
        Assertions.assertNotEquals(this.pu1, pu2);
    }

}