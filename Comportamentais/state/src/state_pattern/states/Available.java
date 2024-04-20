package src.state_pattern.states;

import src.state_pattern.Context;
import src.state_pattern.State;

public class Available extends AbstractState {
    public Available(Context context){
        super(context, "Available");
    }
    
    public State nextState(){
        return new Borrowed(this.context);
    }
}
