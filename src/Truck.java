public class Truck extends Transport implements UpdateTyre, CheckEngine, CheckTrailer {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println(" Меняем покрышку грузовика");
    }

    @Override
    public void checkEngine() {
        System.out.println(" Проверяем двигатель грузовика ");
    }

    @Override
    public void checkTrailer() {
        System.out.println(" Проверяем прицеп грузовой машины ");
    }
}
