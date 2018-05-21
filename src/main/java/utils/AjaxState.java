package utils;

public class AjaxState {

    private String state;
    private Object data;
    private String message;

    public AjaxState(String state, Object data, String message) {
        this.state = state;
        this.data = data;
        this.message = message;
    }

    public AjaxState() {
    }
}
