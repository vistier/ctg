package cn.imeth.ctg.template.api;

/**
 * 模板处理器管理中心
 * <p>
 * Created by Adi(adi@imeth.cn) on 2017/1/12.
 */
public interface TemplateProcessManager {

    /**
     * 通过sign获取模板处理器
     *
     * @param sign
     * @return
     */
    TemplateProcessor getTemplateProcessor(String sign);

    /**
     * 初始化管理管理,
     * 加载出所有的模板处理器
     */
    void init();

    void destroy();
}
