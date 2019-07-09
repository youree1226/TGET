package com.tget.web.rnp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tget.service.rnp.RNPService;


@Controller
@RequestMapping("/rnp/*")
public class ReviewAndPointController {

		///Field
		@Autowired
		@Qualifier("rNPServiceImpl")
		private RNPService rNPService;
		
		public ReviewAndPointController(){
			System.out.println(this.getClass());
		}
	
	
}
