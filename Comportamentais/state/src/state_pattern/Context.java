package src.state_pattern;

import src.state_pattern.states.*;

public class Context {
    State state;
    public Context(){
        this.state = new Available(this);
    }

    public String returnName(){
        return this.state.getStateName();
    }

    void setState(State state){
        this.state = state;
    }

    void nextState(){
        this.state = this.state.nextState();
    }
}
