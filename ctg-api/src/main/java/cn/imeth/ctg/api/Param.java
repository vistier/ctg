package cn.imeth.ctg.api;

import java.util.Map;

/**
 * 建议: 每个模板处理器实现自己的参数构建器
 * <p>
 * Created by Adi(adi@imeth.cn) on 2017/1/12.
 */
public interface Param {

    /**
     * @param sign 模板标识
     */
    void setTemplateSign(String sign);

    /**
     * 模板标识
     *
     * @return
     */
    String getTemplateSign();

    /**
     * @param sign 模板处理器标识
     */
    void setTemplateProcessSign(String sign);

    /**
     * 模板处理器标识
     *
     * @return
     */
    String getTemplateProcessSign();

    public Map<String, Object> getParams();

    /**
     * 设置模板变量
     *
     * @param key
     * @param value
     * @param <T>
     */
    <T> void put(String key, T value);

    /**
     * 获取模板变量
     *
     * @param key
     * @param <T>
     * @return
     */
    <T> T get(String key);

}
