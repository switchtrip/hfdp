public class MallardDuck extends Duck{
    public MallardDuck(){
        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
    }
    public void display(){
        System.out.println("This is a real Mallard duck");
    }
    public void mallardCall(){
        System.out.println("Only Mallards can do this ********");
    }
}
