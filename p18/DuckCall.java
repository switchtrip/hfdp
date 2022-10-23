public class DuckCall {
    QuackBehaviour call;
    public DuckCall(){
        call = new Quack();
    }
    public void call(){
        call.quack();
    }
    public void setQuackBehavior(QuackBehaviour ca){
       call = ca; 
    }
}
