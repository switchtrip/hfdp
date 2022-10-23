public class MiniDuckSimulator {
    public static void main(String[] args){
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.display();
        model.performFly();
        model.setFlyBehaviour(new FlyRocketPowered());
        model.performFly();

        // Brain Power
        DuckCall dc = new DuckCall();
        dc.call();
        dc.setQuackBehavior(new MuteQuack());
        dc.call();
    }
}
