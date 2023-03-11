public class Car extends Transport implements CheckEngine, UpdateTyre {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println(" Меняем покрышку автомобиля ");
    }

    @Override
    public void checkEngine() {
        System.out.println(" Проверяем двигатель автомобиля ");
    }

}
