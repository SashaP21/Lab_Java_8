package lsp;

public class Sparrow extends Bird implements Flyable {
    @Override
    public void eat() {
        System.out.println("Воробей ест");
    }

    @Override
    public void fly() {
        System.out.println("Воробей летит");
    }
}
