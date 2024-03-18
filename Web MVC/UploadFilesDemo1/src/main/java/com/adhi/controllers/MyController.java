package com.adhi.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class MyController {
	@PostMapping("/uploadFile")
//	@PostMapping(value="/uploadFile", consumes=org.springframework.http.MediaType.MULTIPART_FORM_DATA_VALUE)
	public String getFileData(@RequestParam("myFile") MultipartFile file) {
		if(file.isEmpty()) {
			System.out.println("File Not Selected");
		}
		try {
			String originalFileName = file.getOriginalFilename();
			byte[] file_in_bytes = file.getBytes();
			
			System.out.println("File GOT: "+originalFileName);
 		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "status";
	}
}
