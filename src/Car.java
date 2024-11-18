public class Car extends Engine{

    private static final int WheelsCount = 4;

    public Car(String modelName, int wheelsCount) {
        super(modelName, WheelsCount);
    }

    @Override
    public void service(){
        super.service();

    }
}