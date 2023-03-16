package com.space.app.controller;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/")
public class ImageController {

	public ImageController() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("created"+this.getClass().getSimpleName());
	}

	@PostMapping("/upload")
	public String onUpload(@RequestParam("img") MultipartFile multipartFile) throws IOException
	{
		System.out.println("multipartfile"+multipartFile);
		System.out.println(multipartFile.getOriginalFilename());
		System.out.println(multipartFile.getContentType());
		System.out.println(multipartFile.getSize());
		System.out.println(multipartFile.getBytes());
		
		
		byte[] bytes = multipartFile.getBytes();
		Path path = Paths.get("G:\\spacestation-files\\"+multipartFile.getOriginalFilename());
		Files.write(path, bytes);
		
		
		
		return "ImageUpload";
		
	}
	
	
	@GetMapping("/download")
	public void onDownload(HttpServletResponse response,@RequestParam String fileName) throws IOException
	{
		response.setContentType("image/jpeg");
		File file = new File("G:\\spacestation-files\\"+fileName); //this File is used getting image file into the refernce type so we can do performance on it
		
		//from line 58 - 62 is used to convert file into bytes ---> response
		InputStream in = new BufferedInputStream(new FileInputStream(file));
		ServletOutputStream out = response.getOutputStream();                  
		IOUtils.copy(in, out);
		response.flushBuffer();		
	}
	
	
	
}
