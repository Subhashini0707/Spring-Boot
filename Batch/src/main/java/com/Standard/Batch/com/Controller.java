package com.Standard.Batch.com;

import java.io.FileInputStream;

import java.util.Map;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/arith/")

public class Controller {
	@RequestMapping(value = "load", method = RequestMethod.GET)
	public ResponseEntity<?> loadProperty(@RequestParam Map<String, String> requestParams) throws Exception {
		System.out.println(requestParams);
		try {
			
			requestParams.put("status", "rrr");

			Logger log = LogManager.getLogger("Batch");
			log.debug("testAPI started: " + requestParams);
			log.info("testAPI started: " + requestParams);

		} catch (Exception e) {
			System.out.println(e);
		}
		return new ResponseEntity<>(requestParams, HttpStatus.OK);
	}
}
