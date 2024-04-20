package src.state_pattern.states;

import src.state_pattern.Context;
import src.state_pattern.State;

public class Borrowed extends AbstractState {
    public Borrowed(Context context){
        super(context, "Borrowed");
    }
    
    public State nextState(){
        return new Overdue(this.context);
    }
}
