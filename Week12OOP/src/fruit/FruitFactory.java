package fruit;

public class FruitFactory {
    public Fruit provideFruit(String type) {
        if (type.equals("Apple")) {
            return new Apple();
        }
        return null;
    }

    public Apple provideApple() {
        return new Apple();
    }
}
