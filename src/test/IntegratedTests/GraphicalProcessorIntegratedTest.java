import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class GraphicalProcessorIntegratedTest {
    public GraphicalProcessor gp1 = new GraphicalProcessor("GeForce GTX 1050 Ti", Producers.MSI, 4f,
            "GDDR5", 128f, 7f);
    Calculate obj2 = new Calculate();

    @Test
    public void GetDivided_FloatNum_DivideOneIntByAnother() {
        Calculate mockedCalculator = Mockito.mock(Calculate.class);
        Mockito.when(mockedCalculator.getCapacityDividedFrequency(4, 7)).thenReturn((float)4/7);
        gp1.getDivided(4, 7, mockedCalculator);
        Assertions.assertEquals(gp1.getDivided(4, 7, obj2), (float)4/7);
        Mockito.verify(mockedCalculator).getCapacityDividedFrequency(4,7);
    }

}