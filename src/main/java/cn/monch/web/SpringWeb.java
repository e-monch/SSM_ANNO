package cn.monch.web;

import cn.monch.config.MVCConfig;
import cn.monch.config.SpringConfig;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.DispatcherType;
import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import java.util.EnumSet;

//配置 dispatcherServlet
public class SpringWeb extends AbstractAnnotationConfigDispatcherServletInitializer
{
    @Override   //指定 spring 配置类, 创建根容器
    protected Class<?>[] getRootConfigClasses()
    {
        return new Class[]{SpringConfig.class};
    }

    @Override   //指定 webmvc 配置类, 创建子容器
    protected Class<?>[] getServletConfigClasses()
    {
        return new Class[]{MVCConfig.class};
    }

    @Override   //指定 servlet 拦截请求路径
    protected String[] getServletMappings()
    {
        return new String[]{"/"};
    }

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException
    {
        super.onStartup(servletContext);

        //添加 CharacterEncodingFilter
        FilterRegistration.Dynamic characterEncodingFilter = servletContext.addFilter("characterEncodingFilter", CharacterEncodingFilter.class);
        characterEncodingFilter.setInitParameter("encoding", "UTF-8");
        characterEncodingFilter.setInitParameter("forceEncoding", "true");
        characterEncodingFilter.addMappingForUrlPatterns(
                EnumSet.of(DispatcherType.REQUEST, DispatcherType.FORWARD, DispatcherType.INCLUDE), false, "/*");
    }
}
