package com.log.Html.Controller;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@Controller
@RequestMapping("/login/")
public class HtmlController {
	@RequestMapping(value = "cont", method = RequestMethod.GET)
	public ResponseEntity<?> loginMethod(@RequestParam Map<String, String> reqParam) throws Exception {
		//System.out.println(reqParam);
		String user = reqParam.get("name");
		String passw = reqParam.get("pass");

		String userName = "Subha";
		String password = "9080";
		if (userName.equals(user) && password.equals(passw)) {

			reqParam.put("Status", "Login Successfull");
		} 
		else {
			reqParam.put("Status", "Login Unsuccessfull");
		}
		return new ResponseEntity<>(reqParam, HttpStatus.OK);
	}
}
