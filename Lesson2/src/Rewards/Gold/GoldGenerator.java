package Rewards.Gold;

import Abstraction.IGameItem;
import Abstraction.ItemGenerator;

public class GoldGenerator extends ItemGenerator {

    @Override
    public IGameItem createItem() {
        return new GoldRewards();
    }
}
