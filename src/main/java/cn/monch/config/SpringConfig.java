package cn.monch.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = "cn.monch.service")
@PropertySource("classpath:config/dataSource.properties")
public class SpringConfig
{
    @Value("${jdbc.driver}")
    private String driver;

    @Value("${jdbc.url}")
    private String url;

    @Value("${jdbc.username}")
    private String username;

    @Value("${jdbc.password}")
    private String password;

    @Bean   //配置数据源
    public DataSource getDataSource()
    {
        return new DriverManagerDataSource(url, username, password);
    }

    @Bean   //配置 SqlSession 工厂
    public SqlSessionFactoryBean getSqlSessionFactory(DataSource dataSource)
    {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        return sqlSessionFactoryBean;
    }

    @Bean   //配置 dao 注解扫描
    public MapperScannerConfigurer getMapperScannerConfigurer()
    {
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setBasePackage("cn.monch.dao");
        return mapperScannerConfigurer;
    }

    @Bean   //配置事务管理器
    public DataSourceTransactionManager getTransactionManager(DataSource dataSource)
    {
        return new DataSourceTransactionManager(dataSource);
    }
}
