package com.github.jyzhangbo.data.datasource;

import com.alibaba.druid.pool.DruidDataSource;
import org.nutz.dao.Dao;
import org.nutz.dao.impl.NutDao;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @author zhangbo
 *
 */
@Configuration
public class DabaBaseSource {

  @ConfigurationProperties(prefix = "data")
  @Bean
  public DataSource dataSource() {
    DruidDataSource druidDataSource = new DruidDataSource();
    return druidDataSource;
  }

  @Bean
  public Dao getDao(DataSource dataSource) {
    Dao dao = new NutDao(dataSource);
    return dao;
  }

}
