package cn.imeth.ctg.api;

/**
 * Created by Adi(adi@imeth.cn) on 2017/1/12.
 */
public abstract class AbstractResult<T> implements Result<T> {

    private int state = 200;
    private String message;
    private T result;

    public AbstractResult() {
    }

    public AbstractResult(int state, String message) {
        this.state = state;
        this.message = message;
    }

    public AbstractResult(int state, String message, T result) {
        this.state = state;
        this.message = message;
        this.result = result;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }
}
