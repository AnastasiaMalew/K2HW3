public class Truck extends BuyTransport {
        public Truck(String modelName, int wheelCount) {
            super(modelName, wheelCount);
        }

        public String toString() {
            return String.format("Truck: modelName - %s, wheelsCount - %s ",
                    modelName, wheelsCount);
        }

    public String modelName;
    public int wheelsCount;


}
