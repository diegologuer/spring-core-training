package app.engine;

public class V6Engine implements Engine{
    private int quantityOfCylinders;

    public void setQuantityOfCylinders(int quantityOfCylinders) {
        this.quantityOfCylinders = quantityOfCylinders;
    }

    @Override
    public void start() {
        System.out.println("Engine starts...");
    }

    @Override
    public String toString(){
        return "Quantity of cylinders: " + quantityOfCylinders;
    }
}
