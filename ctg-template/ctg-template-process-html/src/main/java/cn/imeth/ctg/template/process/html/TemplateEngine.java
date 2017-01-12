package cn.imeth.ctg.template.process.html;

import org.beetl.core.Configuration;
import org.beetl.core.GroupTemplate;
import org.beetl.core.resource.ClasspathResourceLoader;

import java.io.IOException;

/**
 * Created by Adi(adi@imeth.cn) on 2017/1/12.
 */
public class TemplateEngine {

    public static GroupTemplate getBeetlEngine() {

        GroupTemplate gt = null;
        try {
            gt = new GroupTemplate(new ClasspathResourceLoader("/"), Configuration.defaultConfiguration());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return gt;
    }

}
