package cn.imeth.ctg.api;

/**
 * Created by Adi(adi@imeth.cn) on 2017/1/12.
 */
public class StringResult extends AbstractResult<String> {

    public StringResult() {
    }

    public StringResult(int state, String message) {
        super(state, message);
    }

    public StringResult(int state, String message, String result) {
        super(state, message, result);
    }
}
