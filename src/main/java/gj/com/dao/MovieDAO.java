package gj.com.dao;

import java.util.List;
import java.util.Map;

public interface MovieDAO {
	
	public List<Map<String,String>> selectMovieList();
}
