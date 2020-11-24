import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.*;

import java.util.ArrayList;

class ProducersTest {
    @Test
    public void GetProducerCountry_ExsistingKey_GetInfoFromObjectInEnum() throws Exception {
        Assertions.assertEquals("Taiwan", Producers.ASUS.getProducerCountry());
    }

    @Test
    public void GetSimilarProducers_StringWithInfo_GetAllSimilarProducersFromCountry() throws Exception {
        String result = Producers.Kingston.getSimilarProducers();
        Assertions.assertNotNull(result);
    }

    @Test
    public void ToString_CertainString_FromObjectGetCertainInfoWithOverridedToString() throws Exception {
        Assertions.assertEquals(String.class, Producers.ASUS.toString().getClass());
    }

    @Test
    public void SplitProducersCountry_ArrayListOfCountries_FromStringGetAStringOfCountries() throws Exception {
        ArrayList<String> listCountries = new ArrayList();
        listCountries.add("China");
        listCountries.add("Taiwan");
        listCountries.add("USA");
        Assertions.assertNotNull(Producers.ASUS.splitProducersCountry("China,Taiwan,USA"));
        Assertions.assertArrayEquals(new ArrayList[]{listCountries},
                new ArrayList[]{Producers.ASUS.splitProducersCountry("China,Taiwan,USA")});

    }

}