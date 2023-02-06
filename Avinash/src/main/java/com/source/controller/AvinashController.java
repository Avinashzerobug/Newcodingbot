package com.source.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.source.DTO.BevergeDTO;
import com.source.DTO.ChatDTO;
import com.source.DTO.EducationDTO;
import com.source.DTO.FamilyDTO;
import com.source.DTO.MobileDTO;

@Component
@RequestMapping("/")
public class AvinashController {

	@GetMapping("/avi")
	public String onAvinash(Model model)
	{
		System.out.println("Running the Avinash Mode");
		model.addAttribute("email","avinashmullur42462gmail.com");
		
		return "index.jsp";	
	}
	
	@GetMapping("/avya")
	public String onAvinash1(Model model)
	{
		System.out.println("Running the Avinash Mode");
            model.addAttribute("mobile", "9110819083");
		
		return "index.jsp";	
	}
	
	@GetMapping("/avinya")
	public String onAvinash2(Model model)
	{
		System.out.println("Running the Avinash Mode");
           model.addAttribute("AdharNumber", "397-550-941306");
		
		return "index.jsp";	
	}
	

	@GetMapping("/shiv")
	public String onAvinash3(Model model)
	{
		System.out.println("Running the Avinash Mode");
           model.addAttribute("Age", "23");
		
		return "index.jsp";	
	}
	

	@GetMapping("/mahadev")
	public String onAvinash4(Model model)
	{
		System.out.println("Running the Avinash Mode");
           model.addAttribute("DOB", "21-10-1999:Morning 6:00 Am");
		
		return "index.jsp";	
	}
	
	

	@GetMapping("/shiva")
	public String onAvinash5(Model model)
	{
		System.out.println("Running the Avinash Mode");
           model.addAttribute("salary", "3.5-4 LPA");
		
		return "index.jsp";	
	}
	

	@GetMapping("/fri")
	public String onAvinash6(Model model)
	{
		System.out.println("Running the Avinash Mode");
		List<String> ref= new ArrayList<String>();
		ref.add("friend");
		ref.add("Assassin");
		ref.add("Desmond");
		ref.add("conner");
		ref.add("Edward");
           model.addAttribute("friend",ref);
		
		return "index.jsp";	
	}
	

	@GetMapping("/place")
	public String onAvinash7(Model model)
	{
		System.out.println("Running the Avinash Mode");
		List<String> ref= new ArrayList<String>();
		ref.add("Navanagar");
		ref.add("Bagalkot");
		ref.add("GaddanKeri");
		ref.add("Zero point");
		ref.add("MuchKandi");
           model.addAttribute("place",ref);
		
		return "index.jsp";	
	}
	

	@GetMapping("/skill")
	public String onAvinash8(Model model)
	{
		System.out.println("Running the Avinash Mode");
           model.addAttribute("skill", "1. JAVA - \r\n"
           		+ "1) Understanding of classes, Objects\r\n"
           		+ "knowledge on Method Overloading\r\n"
           		+ ",Method Overriding. \r\n"
           		+ "2) Understanding OOPs Concepts\r\n"
           		+ "Inheritance, Polymorphism,\r\n"
           		+ "Abstraction and Encapsulation. \r\n"
           		+ "3) Knowledge on Access Specifiers, \r\n"
           		+ "Arrays, String, interface. \r\n"
           		+ "4) Knowledge on Exception and Types. \r\n"
           		+ "5) Knowledge on Collection, Collection\r\n"
           		+ "Hierarchy. \r\n"
           		+ "2. WEB TECHNOLOGIES - \r\n"
           		+ "HTML1) Good knowledge of HTML. \r\n"
           		+ "2) Attributes and HTML tags. \r\n"
           		+ "CSS - \r\n"
           		+ "1) Knowledge on how to design web\r\n"
           		+ "pages using CSS. \r\n"
           		+ "2) Created page on Colors,\r\n"
           		+ "Backgrounds and Borders. \r\n"
           		+ "JavaScript - \r\n"
           		+ "1) Basic knowledge on JavaScript. \r\n"
           		+ "2) Knowledge on how to design web\r\n"
           		+ "pages using JS. \r\n"
           		+ "3) And Popup Box in JS. \r\n"
           		+ "3. SPRING - \r\n"
           		+ "1) knowledge on scope of Bean");
		
		return "index.jsp";	
	}
	
	
	@GetMapping("/DTO")
	public String onAvinash9(Model model)
	{
		System.out.println("Running the Avinash Mode");
		EducationDTO dto = new EducationDTO();
		dto.setName("Avinash Mullur");
		dto.setSchoolName("Basaveshwar High School");
		dto.setSchoolMarks(80);
		dto.setSchoolLocation("Bagalkot");
		dto.setCollegeName("Basaveshwar Engineering College Bagalkot");
		dto.setCollegMarks(68);
		dto.setCollegeLocation("Vidyagiri");
		dto.setFavoriteTeacher("No one");
		dto.setNoOfFailSubjec(9);
		dto.setRanker(true);
           model.addAttribute("aviDTO", dto);
		
		return "index.jsp";	
	}
	
	@GetMapping("/fam")
	public String onAvinash10(Model model)
	{
		System.out.println("Running the Avinash DTO mode");
		FamilyDTO dto = new FamilyDTO();
		dto.setFatherName("KUMAR G MULLUR");
		dto.setGrandMotherName("ANUSUYA MULLUR");
		dto.setBrotherName("MANISH K MULLUR");
		dto.setLocation("BAGALKOT");
		dto.setNoOfMembers(4);
		dto.setGrandFatherName("GULAPPA MULLUR");
		dto.setGrandMotherName("LEELAVATI MULLUR");
		dto.setLocation2("BELAGAVI");
		dto.setCousin("BUNTY");
		dto.setNoOfCousin(8);
		   model.addAttribute("fam", dto);
	
		return "index.jsp";
	}
	
	@GetMapping("/mob")
	public String onAvinash11(Model model)
	{
		System.out.println("Running the Avinash Mobile DTO");
		MobileDTO dto = new MobileDTO();
		dto.setSimName("JIO");
		dto.setPackages("Costly wala");
		dto.setNumber2(2345654623L);
		dto.setNumber(1954343856L);
		dto.setCompanyName("Relance");
 
		 model.addAttribute("mob", dto);
		 
		 return "index.jsp";
		
	}
	
	@GetMapping("/bev")
	public String onAvinash12(Model model)
	{
		System.out.println("Running the juice mode");
		BevergeDTO dto = new BevergeDTO();
		dto.setBrand("KingFisher");
		dto.setOwnerName("Vijaya Mallya");
		dto.setTypes("All types");
		dto.setDrinks("KF Beer");
		dto.setFamousDrink("KF");
		dto.setTotalDrinks(400);
		dto.setCompanyName("KF");
		dto.setNetWorth("$4.5 Billion");
		
		 model.addAttribute("bev", dto);
		 return "index.jsp";
	}
	
	@GetMapping("/chat")
	public String onAvinash13(Model model)
	{
		System.out.println("Running the Chat mode");
		ChatDTO dto = new ChatDTO();
		dto.setAppName("WhatsAPp");
		dto.setAutentication("Google Autenticator ");
		dto.setCompany("Meta");
		dto.setCountry("USA");
		dto.setFeatures("Delete msg both user");
		dto.setLogo("WhatsAPP");
		dto.setNetWorth(4500000000L);
		dto.setNoOfUser(50000000L);
		dto.setOwner("Mark ZuckBerg");
		dto.setSafety(true);
		dto.setSecurity(false);
		model.addAttribute("chat", dto);
		 return "index.jsp";
	}
	
	
	
	
	
}
