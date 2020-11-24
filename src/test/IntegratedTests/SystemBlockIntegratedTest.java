import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;

class SystemBlockIntegratedTest {
    public MotherBoard m1 = new MotherBoard("LGA1155 P8P67 PRO", Producers.ASUS, "LGA1155",
            "P67", 4, 3, 8, "LightYourFate", Producers.DeepCool,
            100, "rgb");
    public Processor p1 = new Processor("Intel Core i5-9400F", Producers.Intel, 2.9f, 64,
            50f, 6);

    public ArrayList<RAM> set = new ArrayList<>();

    public RAM r1 = new RAM("HyperX Fury Black", Producers.HyperX, 8, "RAM", "DDR3",
            3200f);
    public HardDrive hd1 = new HardDrive("Kingston SSDNow A400", Producers.Kingston, 240,
            "Hard Drive", "SSD", 500f, 350f);
    public PowerUnit pu1 = new PowerUnit("DE600 v2", Producers.DeepCool, 600f, "Ventilators",
            6);
    public GraphicalProcessor gp1 = new GraphicalProcessor("GeForce GTX 1050 Ti", Producers.MSI, 4f,
            "GDDR5", 128f, 7f);
    public Body b1 = new Body("Pardo White", Producers.DeepCool, 45.6f, 20.3f, 35f, "Plastic");

    public SystemBlock dream = new SystemBlock(this.m1, this.p1, this.hd1, this.gp1, this.pu1, this.set, this.b1);

    @Test
    public void SetObjLikeTheField_Compostion_CompositionCheck() {
        Body mockedBody = Mockito.mock(Body.class);
        mockedBody.setHeight(30f);
        Mockito.when(mockedBody.getHeight()).thenReturn(30f);
        dream.setBd(mockedBody);
        Assertions.assertEquals(dream.getBd().getHeight(), 30f);
        Mockito.verify(mockedBody).getHeight();
    }

}