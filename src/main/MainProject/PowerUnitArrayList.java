import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PowerUnitArrayList {

    static List<PowerUnit> powerUnits = new ArrayList<>();

    public static List getPowerUnits(){

        powerUnits.add(new PowerUnit("DE600 v2", Producers.DeepCool, 600f, "Ventilators", 6));
        powerUnits.add(new PowerUnit("QD450 v3", Producers.DeepCool, 450f, "Liquid", 4));
        powerUnits.add(new PowerUnit("MonsterHide", Producers.MSI, 1000f, "Liquid", 4));
        powerUnits.add(new PowerUnit("LD 1094", Producers.DeepCool, 700f, "Ventilators", 6));
        powerUnits.add(new PowerUnit("HypCool 800", Producers.HyperX, 800f, "Ventilators", 5));


        return powerUnits;
    }

    public static double getMaxPower() {

        List<PowerUnit> powerUnits = getPowerUnits();

        DoubleSummaryStatistics collect = powerUnits.stream()
                .filter(s -> s.getPower() > 0)
                .collect(Collectors.summarizingDouble(PowerUnit::getPower));

        return collect.getMax();

    }

    public static double getSumPower() {

        List<PowerUnit> powerUnits = getPowerUnits();

        DoubleSummaryStatistics collect = powerUnits.stream()
                .filter(s -> s.getPower() > 0)
                .collect(Collectors.summarizingDouble(PowerUnit::getPower));

        return collect.getSum();

    }

    public static double getAveragePlugs() {

        List<PowerUnit> powerUnits = getPowerUnits();

        DoubleSummaryStatistics collect = powerUnits.stream()
                .filter(s -> s.getPlugs() > 0)
                .collect(Collectors.summarizingDouble(PowerUnit::getPlugs));

        return collect.getAverage();

    }

    public static List<String> getAllPowerUnitsFromOneProducer(Producers producer, Predicate<PowerUnit> predicateInstance) {

        List<PowerUnit> powerUnits = getPowerUnits();

        List<String> collect = powerUnits.stream()
                .filter(s -> s.getProducer().equals(producer))
                .filter(predicateInstance)
                .map(PowerUnit::getModel)
                .distinct()
                .collect(Collectors.toList());

        return collect;
    }

    public static double getOneListFromMasiveOfLists(int index) {

        List<PowerUnit> powerUnits = getPowerUnits();

        List<List<PowerUnit>> listOfPowerUnits = new ArrayList<>();

        listOfPowerUnits.add(powerUnits);

        int ind;
        double avg = 0;

        if(index < 0){
            ind = 0;
        }
        else
            ind = index;

        List<Float> collect = listOfPowerUnits.get(ind).stream()
                .map(PowerUnit::getPower)
                .distinct()
                .collect(Collectors.toList());

        for (Float aFloat : collect) {
            avg += aFloat;
        }


        return avg / collect.size();

    }


}
