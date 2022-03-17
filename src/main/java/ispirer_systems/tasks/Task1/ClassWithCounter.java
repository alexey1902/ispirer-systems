package ispirer_systems.tasks.Task1;

public class ClassWithCounter {

    private static int counter;

    public ClassWithCounter() {
        counter++;
    }

    public static int getCounter() {
        return counter;
    }

    public static void showNumberOfInstances(){
        System.out.println("Amount of instances: " + getCounter());
    }

}
