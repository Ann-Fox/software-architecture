package Rewards.Brass;

import Abstraction.IGameItem;
import Abstraction.ItemGenerator;

public class BrassGenerator extends ItemGenerator {

    @Override
    public IGameItem createItem() {
        return new BrassRewards();
    }
}
