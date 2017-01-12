package cn.imeth.ctg.template.process.html;

import cn.imeth.ctg.api.StringResult;
import cn.imeth.ctg.template.api.TemplateProcessor;
import org.beetl.core.GroupTemplate;
import org.beetl.core.Template;

/**
 * Created by Adi(adi@imeth.cn) on 2017/1/12.
 */
@cn.imeth.ctg.template.api.annotation.TemplateProcessor("html-template-processor")
public class HtmlTemplateProcessor implements TemplateProcessor<StringResult, HtmlTemplateParam> {

    public static final String SIGN = "html-template-processor";

    static GroupTemplate gt = TemplateEngine.getBeetlEngine();

    private HtmlTemplateParam param;
    private StringResult result;


    public String getSing() {
        return SIGN;
    }

    public void setParams(HtmlTemplateParam params) {
        this.param = params;
    }

    public void execute() {

        result = new StringResult();

        if (param == null) {
            result = new StringResult(500, "参数异常");
            return;
        }

        try {
            Template t = gt.getTemplate(param.getTemplateSign());

            // 绑定变量
            t.binding(param.getParams());

            String value = t.render();

            result = new StringResult(200, "生成成功", value);

        } catch (Exception e) {
            result = new StringResult(500, "生成失败 " + e.getMessage());
        }
    }

    public StringResult getResult() {
        if (result == null) {
            throw new RuntimeException("未执行execute()");
        }

        return result;
    }

}
