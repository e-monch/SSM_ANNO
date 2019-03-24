package cn.monch.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "cn.monch.controller")
public class MVCConfig implements WebMvcConfigurer
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

    @Bean
    public InternalResourceViewResolver getInternalResourceViewResolver()
    {
        return new InternalResourceViewResolver("/WEB-INF/pages/", ".jsp");
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry){
        registry.addResourceHandler("/static/**")
                .addResourceLocations("classpath:/static/")
                .addResourceLocations("/favicon.ico");
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
