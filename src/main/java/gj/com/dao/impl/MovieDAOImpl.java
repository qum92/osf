package gj.com.dao.impl;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import gj.com.dao.MovieDAO;

@Repository
public class MovieDAOImpl implements MovieDAO {
	@Autowired
	private SqlSessionFactory ssf;
	
	public List<Map<String, String>> selectMovieList() {
		SqlSession ss = ssf.openSession();
		return ss.selectList("movie.selectMovieList");
	}

}
