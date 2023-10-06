package Rewards.Silver;

import Abstraction.IGameItem;
import Abstraction.ItemGenerator;

public class SilverGenerator extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new SilverRewards();
    }
}