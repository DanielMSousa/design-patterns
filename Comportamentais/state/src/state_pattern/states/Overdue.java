package src.state_pattern.states;

import src.state_pattern.Context;
import src.state_pattern.State;

public class Overdue extends AbstractState {
    public Overdue(Context context){
        super(context, "Overdue");
    }
    
    public State nextState(){
        return new Available(this.context);
    }
}
