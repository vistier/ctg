package cn.imeth.ctg.template.manager;

import cn.imeth.ctg.core.utils.ClassUtils;
import cn.imeth.ctg.template.api.TemplateProcessManager;
import cn.imeth.ctg.template.api.TemplateProcessor;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Ctg模板处理器管理中心
 * <p>
 * Created by Adi(adi@imeth.cn) on 2017/1/12.
 */
public class CtgTemplateProcessManager implements TemplateProcessManager {

    private static final Class<cn.imeth.ctg.template.api.annotation.TemplateProcessor> ANNOTATION_CLASS = cn.imeth.ctg.template.api.annotation.TemplateProcessor.class;

    private String classPath = "cn.imeth.ctg";

    private Map<String, Class<TemplateProcessor>> processors = new HashMap<String, Class<TemplateProcessor>>();

    public TemplateProcessor getTemplateProcessor(String sign) {
        Class<TemplateProcessor> processor = processors.get(sign);

        if (processor == null) {
            throw new RuntimeException("找不到指定的模板处理器 " + sign);
        }

        try {
            return processor.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        throw new RuntimeException("创建模板处理器实例异常 " + sign);
    }

    public void init() {
        // 通过反射找出所有的模板文件

        Map<String, Class<TemplateProcessor>> classes = loadAnnotationClass(classPath);

        processors.putAll(classes);
    }

    public void destroy() {

    }


    public static Map<String, Class<TemplateProcessor>> loadAnnotationClass(String classPath) {
        Set<String> names = ClassUtils.getClassName(classPath, true);

        Map<String, Class<TemplateProcessor>> classes = new HashMap<String, Class<TemplateProcessor>>();

        for (String name : names) {
            try {
                Class<TemplateProcessor> clazz = loadClass(name);

                // 判断是不是注解文件
                if (clazz.isAnnotationPresent(ANNOTATION_CLASS)) {
                    cn.imeth.ctg.template.api.annotation.TemplateProcessor annotation = clazz.getAnnotation(ANNOTATION_CLASS);
                    String sign = annotation.value();

                    classes.put(sign, clazz);
                }

            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }

        return classes;
    }

    public static Class<TemplateProcessor> loadClass(String name) throws ClassNotFoundException {
        Class<TemplateProcessor> clazz = (Class<TemplateProcessor>) Class.forName(name);
        return clazz;
    }

    public String getClassPath() {
        return classPath;
    }

    public void setClassPath(String classPath) {
        this.classPath = classPath;
    }
}
