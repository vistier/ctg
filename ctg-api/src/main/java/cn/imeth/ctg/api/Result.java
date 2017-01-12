package cn.imeth.ctg.api;

/**
 * 生成结果
 *
 * Created by Adi(adi@imeth.cn) on 2017/1/12.
 */
public interface Result<T> {

    /**
     * 获取执行状态
     * @return
     */
    int getState();

    /**
     * 返回消息
     * @return
     */
    String getMessage();

    /**
     * 获取返回结果
     * @return
     */
    T getResult();

}
