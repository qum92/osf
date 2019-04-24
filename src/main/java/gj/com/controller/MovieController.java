package gj.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import gj.com.service.MovieService;

@Controller
public class MovieController {
	@Autowired
	private MovieService ms;
	
	@RequestMapping("/movie/list")
	public String goMovieList(Model m) {
		m.addAttribute("movieList", ms.selectMovieList());
		return "/movie/list";
	}
}
