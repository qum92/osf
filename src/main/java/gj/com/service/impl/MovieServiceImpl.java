package gj.com.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gj.com.dao.MovieDAO;
import gj.com.service.MovieService;

@Service
public class MovieServiceImpl implements MovieService {
	@Autowired
	private MovieDAO mdao;
	

	public List<Map<String, String>> selectMovieList() {
		return mdao.selectMovieList();
	}

}
