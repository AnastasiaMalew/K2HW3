public class BuyTransport {
    public String modelName;
    public int wheelsCount;

    public BuyTransport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }
    public void updateTyre() {
        System.out.println("Меняем покрышку");
        System.out.println("Проверяем двигатель");
        System.out.println("Проверяем прицеп");
    }
}
