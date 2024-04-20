package src.state_pattern;

public interface State {
    Context getContext();
    State nextState();
    String getStateName();
}
