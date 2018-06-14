package kr.ac.jejunu.portalfinal;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;


@SpringBootApplication
@MapperScan(value={"kr.ac.jejunu.portalfinal.mapper"})
public class PortalfinalApplication {

	public static void main(String[] args) {
		SpringApplication.run(PortalfinalApplication.class, args);
	}

	//SqlSessionFactory 설정
	@Bean
	public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
		SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
		sessionFactory.setDataSource(dataSource);

        Resource[] res = new PathMatchingResourcePatternResolver().getResources("classpath:mappers/*Mapper.xml");

        sessionFactory.setMapperLocations(res);
		return sessionFactory.getObject();
	}
}
