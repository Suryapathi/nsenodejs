package com.kgisl.nsedata.controller;

import java.util.*;
import com.kgisl.nsedata.*;
import com.kgisl.nsedata.model.NseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import io.swagger.models.Model;


@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/")
public class NseController {
	// NseData nse=new NseData();
	//  nseDatas:Object;
	// @Autowire
	// private NseService nseService;
		//RestTemplate restTemplate ;
	//  RestTemplate <restTemplate> ;
	
		@RequestMapping(value={"showNseData"},method={RequestMethod.GET})
		public @ResponseBody String showUserTable(){
			RestTemplate restTemplate = new RestTemplate();
		  String nseDatas = restTemplate.getForObject("https://www.nseindia.com/live_market/dynaContent/live_watch/stock_watch/niftyStockWatch.json", String.class);  // or however I use restTemplates, havent done it yet so still fuzzy but shouldnt be too tricky.    
		//   String data = String.valueOf(nseDatas);
		//   System.out.println(data);
		  return nseDatas;
		
		//   model.addAttribute("nseDatas", nseDatas);
		//   return "server"; // returns a jsp simply looping through the list and displaying.
		}
}

	

