package cn.imeth.ctg.template.api;

import cn.imeth.ctg.api.Param;

/**
 * Created by Adi(adi@imeth.cn) on 2017/1/12.
 */
public abstract class ParamBuilder<T extends Param> {

    private T params;

    public ParamBuilder() {
        this.params = initParams();
    }

    public abstract T initParams();

    public ParamBuilder setTemplateSign(String sign) {
        params.setTemplateSign(sign);
        return this;
    }

    public <V> ParamBuilder set(String key, V value) {
        params.put(key, value);
        return this;
    }

    public T build() {
        return params;
    }
}
