package cn.monch.web;

import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.*;

//定义组件, 视图解析器, 拦截器等等
public class SpringAdapter implements WebMvcConfigurer
{
    /*@Bean
    public HandlerInterceptor getLoginInterceptor(){
        return new LoginInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry){
        registry.addInterceptor(getLoginInterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns("/error")
                .excludePathPatterns("/static/*");
    }*/

    @Override
    public void configureViewResolvers(ViewResolverRegistry registry)
    {
        registry.jsp("/WEB-INF/pages", ".jsp");
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry){
        registry.addResourceHandler("/static/**")
                .addResourceLocations("classpath:/static/");
    }

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")                   //设置允许跨域的路径
                .allowedOrigins("*")                            //设置允许跨域请求的域名
                .allowCredentials(true)                         //是否允许证书 不再默认开启
                .allowedMethods("GET", "POST", "PUT", "DELETE") //设置允许的方法
                .maxAge(3600);                                  //跨域允许时间
    }
}
