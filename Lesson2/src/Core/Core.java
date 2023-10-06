package Core;

import Abstraction.ItemGenerator;
import Rewards.Gold.GoldGenerator;

import java.util.ArrayList;
import java.util.List;

public class Core {

    public void run() {
        List<ItemGenerator> generatorList = new ArrayList<>();
        generatorList.add(new GoldGenerator());
        // generatorList.add(...)
        generatorList[...];

    }
}
