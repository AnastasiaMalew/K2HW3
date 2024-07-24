public class Car extends BuyTransport{
    public Car(String modelName, int wheelCount) {
        super(modelName, wheelCount);
    }

    public String toString() {
        return String.format("Car: modelName - %s, wheelsCount - %s ",
                modelName, wheelsCount);
    }


}
