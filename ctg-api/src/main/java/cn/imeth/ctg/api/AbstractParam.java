package cn.imeth.ctg.api;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Adi(adi@imeth.cn) on 2017/1/12.
 */
public abstract class AbstractParam implements Param {

    private HashMap<String, Object> params = new HashMap<String, Object>();

    public Map<String, Object> getParams() {
        return new HashMap<String, Object>(params);
    }

    public <T> T get(String key) {
        return (T) params.get(key);
    }

    public <T> void put(String key, T value) {
        params.put(key, value);
    }

    public void setTemplateSign(String sign) {
        put("ctg-param-template-sign", sign);
    }

    public String getTemplateSign() {
        return get("ctg-param-template-sign");
    }

    public void setTemplateProcessSign(String sign) {
        put("ctg-param-template-process-sign", sign);
    }

    public String getTemplateProcessSign() {
        return get("ctg-param-template-process-sign");
    }

}
