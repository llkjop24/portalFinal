package kr.ac.jejunu.portalfinal;

import kr.ac.jejunu.portalfinal.domain.BoardVO;
import kr.ac.jejunu.portalfinal.mapper.BoardMapper;
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

	@Autowired
    private BoardMapper mapper;


	@Test
	public void contextLoads() {
	}

	@Test
	public void testConnection() throws SQLException {
		System.out.println("ds :" + ds);

		Connection con = ds.getConnection();

		System.out.println("con :" + con);

		con.close();
	}

	@Test
    public void testSqlSession() throws Exception {
	    System.out.println("sqlSession : " + sqlSession);
    }

    @Test
    public void testMapper() throws Exception{
        BoardVO vo = new BoardVO();

        vo.setSubject("제목입니다.");
        vo.setContent("내용입니다.");
        vo.setWriter("작성자입니다.");

        mapper.boardInsert(vo);

    }

}
