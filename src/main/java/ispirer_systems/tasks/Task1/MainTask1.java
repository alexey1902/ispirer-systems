package ispirer_systems.tasks.Task1;

public class MainTask1 {
    public static void main(String[] args) {
        new ClassWithCounter();
        ClassWithCounter.showNumberOfInstances();
        new ClassWithCounter();
        ClassWithCounter.showNumberOfInstances();
        new ClassWithCounter();
        ClassWithCounter.showNumberOfInstances();
    }
}
