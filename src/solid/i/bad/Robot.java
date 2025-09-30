package solid.i.bad;

public class Robot implements Worker {

    @Override
    public void work() {
        System.out.println("Robot work");
    }

    @Override
    public void eat() {
        throw new RuntimeException("Robot no need to eat");
    }

    @Override
    public void sleep() {
        throw new RuntimeException("Robot no need to sleep");
    }
}
