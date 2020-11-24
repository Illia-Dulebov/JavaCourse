import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class MotherBoardTest {
    public MotherBoard m1 = new MotherBoard("LGA1155 P8P67 PRO", Producers.ASUS, "LGA1155",
            "P67", 4, 3, 8, "LightYourFate", Producers.DeepCool,
            100, "rgb");

    @Test
    public void MotherBoardConstructor_ExceptionError_InvalidAmountOfSlotsEntered() throws Exception {
        try{
            MotherBoard m1 = new MotherBoard("LGA1155 P8P67 PRO", Producers.ASUS, "LGA1155",
                    "P67", -4, 3, 8, "LightYourFate", Producers.DeepCool,
                    100, "rgb");
            throw new SlotsAmountException("Invalid amount of slots", m1);
        }
        catch(SlotsAmountException e){
            Assertions.assertEquals("Invalid amount of slots", e.getMessage());

        }
    }

}