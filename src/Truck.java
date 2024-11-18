public class Truck extends Engine implements diagnostable {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    @Override
    public void service(){
        super.service();
        checkTrailer();
    }
}