package cn.imeth.ctg.template.process.html;

import cn.imeth.ctg.api.AbstractParam;
import cn.imeth.ctg.template.api.ParamBuilder;

/**
 * Created by Adi(adi@imeth.cn) on 2017/1/12.
 */
public class HtmlTemplateParam extends AbstractParam {


    public static class Builder extends ParamBuilder<HtmlTemplateParam> {

        public HtmlTemplateParam initParams() {
            return new HtmlTemplateParam();
        }
    }

}
