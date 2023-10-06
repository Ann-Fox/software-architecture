package Core;

import Abstraction.ItemGenerator;
import Rewards.Brass.BrassGenerator;
import Rewards.Gold.GoldGenerator;
import Rewards.Silver.SilverGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Core {

     public void run() {
        List<ItemGenerator> generatorList = new ArrayList<>();
        generatorList.add(new GoldGenerator());
        generatorList.add(new SilverGenerator());
        generatorList.add(new BrassGenerator());
        // generatorList.add(...)

        int randomGeneratorNumber = GetRandomInt(generatorList.size());

        ItemGenerator randomGenerator = generatorList.get(randomGeneratorNumber);
        String reward = randomGenerator.openReward();
        System.out.println(reward);
    }

    public int GetRandomInt(int maxValue) {
        int randomNumber = ThreadLocalRandom.current().nextInt(0, maxValue);
        return randomNumber;
    }
}
