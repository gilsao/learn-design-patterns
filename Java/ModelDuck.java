public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay(); // Um pato modelo não pode voar inicialmente
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}