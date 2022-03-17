package ispirer_systems.tasks.Task2;

public class MainTask2 {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();
        list.add(10);
        list.add(11);
        list.add(12);
        System.out.println(list);
        System.out.println(list.indexOf(12));
        list.add(2, 77);
        list.add(0, 100);
        list.add(-10, 777);
        list.add(12, 777);
        System.out.println(list);
        list.remove(4);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.indexOf(10));
        System.out.println(list.get(2));
        list.clear();
    }
}
