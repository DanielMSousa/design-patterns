package src.state_pattern.states;

import src.state_pattern.Context;
import src.state_pattern.State;

public abstract class AbstractState implements State {
    Context context;
    String stateName;

    public AbstractState(Context context, String stateName){
        this.stateName = stateName;
        this.context = context;
    }

    public String getStateName(){
        return this.stateName;
    }

    public Context getContext(){
        return this.context;
    }
    
    public abstract State nextState();
}
