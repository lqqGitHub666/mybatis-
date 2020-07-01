import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * @author 作者 lqq
 * @ClassName 类名 Test
 * @date 2020/7/1 17:19
 * @注释：
 */
public class Test {


    public static void main(String[] args) {
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build((InputStream) null);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Object mapper = sqlSession.getMapper(null);

    }
}
