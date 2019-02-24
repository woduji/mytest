package filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * 生命周期总结：
 *    1.过滤器对象在服务器启动的时候就创建了
 *    2.服务器创建每个过滤器只创建1次，说明每个过滤器对象全局唯一（节省内存空间）
 */
@WebFilter(filterName = "_03LifeCycleFilter",urlPatterns = "/Demo3Servlet")
public class _03LifeCycleFilter implements Filter{
    /**
     * init方法，初始化方法，当过滤器对象创建的时候调用,方法只会被调用一次
     * @param filterConfig
     * @throws ServletException
     */
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("==调用了_03LifeCycleFilter的init方法==");
    }
    /**
     * doFilter,过滤请求与响应的方法，每次请求符合过滤资源路径的目标资源才调用
     * @param servletRequest
     * @param servletResponse
     * @param filterChain
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("==调用了_03LifeCycleFilter的diFilter方法==");
    }
    /**
     * destroy销毁方法，当服务器关闭或重启都会调用
     */
    @Override
    public void destroy() {
        System.out.println("==调用了_03LifeCycleFilter的destroy方法==");
    }
}
