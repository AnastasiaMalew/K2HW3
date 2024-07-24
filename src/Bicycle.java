public class Bicycle extends BuyTransport {
    public Bicycle(String modelName, int wheelCount) {
        super(modelName, wheelCount);
    }

    public String toString() {
        return String.format("Bicycle: modelName - %s, wheelsCount - %s ",
                modelName, wheelsCount);
    }

    }

