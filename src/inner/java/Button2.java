package inner.java;

public class Button2 implements View2{
    @Override
    public State2 getCurrentState() {
        return new Button2State();
    }

    @Override
    public void restoreState(State2 state) {

    }

    public class Button2State implements State2{

    }
}
