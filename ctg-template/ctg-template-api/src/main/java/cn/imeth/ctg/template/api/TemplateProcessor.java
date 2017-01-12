package cn.imeth.ctg.template.api;

import cn.imeth.ctg.api.Param;
import cn.imeth.ctg.api.Result;

/**
 * 模板处理器
 *
 * Created by Adi(adi@imeth.cn) on 2017/1/12.
 *
 * @param <T> 模板生成类型
 */
public interface TemplateProcessor<R extends Result, P extends Param> {

    String getSing();

    void setParams(P params);

    void execute();

    R getResult();
}
