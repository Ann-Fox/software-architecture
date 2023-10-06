package Abstraction;

// Абстракции класса фабрики
public abstract class ItemGenerator {

    // Метод взаимодействия с абстрактной продукцией
    public String openReward() {
        IGameItem gameItem = createItem();
        return gameItem.open();
    }

    public abstract IGameItem createItem();
}
