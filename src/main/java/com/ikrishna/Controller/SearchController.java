package com.ikrishna.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {
	
	@RequestMapping("/")
	public String methodName()
	{
		return "newhome";
	}
	
	@RequestMapping("/search")
	public RedirectView searchResult(@RequestParam("query") String query)
	{
		System.out.println(query);
		RedirectView redirect=new RedirectView();
		redirect.setUrl("https://www.google.com/search?q="+query);
		return redirect;
	}

}
