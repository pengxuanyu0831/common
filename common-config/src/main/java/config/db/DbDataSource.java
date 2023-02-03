package config.db;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

/**
 * @author xuanyu peng
 * @description:
 * @date 2023/2/3 22:40
 */
public class DbDataSource {

    /**
     * 数据源 1
     * @return
     */
    @Bean
    public DataSource dataSource1() {
        return new DataSource();
    }


    @Bean
    public PlatformTransactionManager transactionManager1(@Qualifier("dataSource1") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }


    /**
     * 数据源2
     * @return
     */
    @Bean
    public DataSource dataSource2() {
        return new DataSource();
    }

    @Bean
    public PlatformTransactionManager transactionManager2(@Qualifier("dataSource2") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }
}
