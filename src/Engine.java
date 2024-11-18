public abstract class Engine extends vehicle implements diagnostable {

    public Engine(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void service(){
        checkEngine();
        super.service();
    }






}
