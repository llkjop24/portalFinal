package kr.ac.jeju.portalfinal;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
public class PortalfinalApplicationTests {

    @Autowired
    private DataSource ds;

    @Autowired
    private SqlSessionFactory sqlSession;

    @Test
    public void contextLoads() {
    }

    @Test
    public void testConnection() throws SQLException {
        System.out.println("ds :" + ds);

        Connection con = ds.getConnection();

        System.out.println("con : " + con);

        con.close();
    }

    @Test
    public void testSqlSession(){
        System.out.println("sqlSession;" + sqlSession);
    }

}
