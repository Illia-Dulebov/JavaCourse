import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Array;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class PowerUnitArrayListTest {

    @Test
    public void getPowerUnits_List_getPowerUnitsInList() throws Exception {

        List powerUnits = PowerUnitArrayList.getPowerUnits();

        Assertions.assertNotNull(powerUnits);
        Assertions.assertNotNull(PowerUnitArrayList.getPowerUnits());
        Assertions.assertEquals(PowerUnitArrayList.getPowerUnits(), powerUnits);

    }

    @Test
    public void getMaxPower_Double_MaxPowerFromList() throws Exception {

        Assertions.assertNotNull(PowerUnitArrayList.getMaxPower());
        Assertions.assertEquals(PowerUnitArrayList.getMaxPower(), 1000f);

    }

    @Test
    public void getSumPower_Double_SumPowerFromList() throws Exception {

        Assertions.assertNotNull(PowerUnitArrayList.getSumPower());
        Assertions.assertEquals(PowerUnitArrayList.getSumPower(), 3550f);

    }

    @Test
    public void getAveragePlugs_Double_AveragePlugsFromList() throws Exception {

        Assertions.assertNotNull(PowerUnitArrayList.getAveragePlugs());
        Assertions.assertEquals(PowerUnitArrayList.getAveragePlugs(), 5f);

    }

    @Test
    public void getAllPowerUnitsFromOneProducer_ArrayList_allPUsFromOneCountry() throws Exception {

        ArrayList<String> lst  = new ArrayList<>();

        Assertions.assertNotNull(PowerUnitArrayList.getAllPowerUnitsFromOneProducer(Producers.DeepCool, 100));
        Assertions.assertEquals(PowerUnitArrayList.getAllPowerUnitsFromOneProducer(Producers.DeepCool, 100)
                .getClass(), lst.getClass());

    }

    @Test
    public void getAllPowerUnitsFromOneProducer_() throws Exception {


        Assertions.assertNotNull(PowerUnitArrayList.getOneListFromMasiveOfLists(0));
        Assertions.assertEquals(PowerUnitArrayList.getOneListFromMasiveOfLists(0), 710f);

    }

}