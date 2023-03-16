package com.space.app.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.space.app.Entity.SpaceStationEntity;
import com.space.app.dto.SpaceStationDTO;
import com.space.app.service.SpaceStationService;

@Controller
@RequestMapping("/")
public class SpaceStationController {

	@Autowired
	private SpaceStationService service;

	private List<String> astranuatName = Arrays.asList("Buzz Aldrin", "Michael Collins", "Niel Armastrong");

	public SpaceStationController() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("creating the controller using no arg constructor ");
	}

	@GetMapping("space")
	public String onSpaceStation(Model model) {
		System.out.println("Running the get mapping on space");

		List<String> astranuatName = Arrays.asList("Buzz Aldrin", "Michael Collins", "Niel Armastrong");
		model.addAttribute("astranuatName", astranuatName);
		return "SpaceStation";
	}

	@GetMapping("search")
	public String onSpace(@RequestParam int id, Model model) {
		System.out.println("Running the on Space Mode");
		SpaceStationDTO dto = this.service.findById(id);
		if (dto != null) {
			model.addAttribute("dto", dto);
		} else {
			model.addAttribute("message", "Data is not found check the proper id");
		}

		return "SpaceSearch";
	}

	@PostMapping("space")
	public String onSpaceStation(Model model, SpaceStationDTO dto) {
		System.out.println("Running the method in post" + dto);
		Set<ConstraintViolation<SpaceStationDTO>> violations = service.validateAndSave(dto);
		if (violations.isEmpty()) {
			System.out.println("no violation are in dto");
			return "SpaceStationSuccess";
		}
		model.addAttribute("astranuatName", astranuatName);
		model.addAttribute("errors", violations);
		model.addAttribute("dto", dto);
		System.out.println("errors are in the violations");
		return "SpaceStation";

	}

	@GetMapping("searchbycountry")
	public String onSearchByCountries(@RequestParam String countries,Model model)
	{
		System.out.println("Running the OnSearchByCountries controller:"+countries);
		List<SpaceStationDTO> list = this.service.findByCountries(countries);
		model.addAttribute("list", list);
		return "CountrySearch";
		
	}
	
	
	@GetMapping("spaceup")
	public String onUpDate(@RequestParam int id,Model model)
	{
		
		System.out.println("Running the update:"+ id);
		SpaceStationDTO dto = this.service.findById(id);
		model.addAttribute("dto", dto);
		model.addAttribute("countries", dto.getCountries());
		List<String> astranuatName = Arrays.asList("Buzz Aldrin", "Michael Collins", "Niel Armastrong");
		model.addAttribute("astranuatName",astranuatName);
		model.addAttribute("noOfStation", dto.getNoOfStation());
		
		return "UpdateSpace";
	}
	 
	
	
	
	@PostMapping("spaceup")
	public String onUpDate(SpaceStationDTO dto,Model model)
	{
		System.out.println("Running on UpDate:"+dto);
		Set<ConstraintViolation<SpaceStationDTO>> violation = this.service.validateAndUpdate(dto);
		
		if(violation.size() > 0)
		{
			model.addAttribute("error",violation);
		}
		else
		{
			model.addAttribute("message","space update success...");
		}
		
		return "UpdateSpace";
		
	}
	
	
	@GetMapping("delete")
	public String deleteSpace(@RequestParam int id,Model model)
	{
	 boolean dto =   this. service.deleteSpace(id);
	 System.out.println(dto);
	 model.addAttribute("id",id);
	 model.addAttribute("message", "Delete is initalize");
		return "Delete";
		
		
	}
	
	@GetMapping("all")
	public String loadAllData(Model model)
	{
		System.out.println("Running the all data method");
		List<SpaceStationDTO> dto = this.service.allData();
		if(dto!=null)
		{
		model.addAttribute("dto",dto);
		}
		else
		{
			model.addAttribute("message","data not found here");
		}

		return "alldata";
	}
	
	@GetMapping("searchByName")
	public String onfindByName(@RequestParam String name, Model model) {
		System.out.println("Running on search for name " + name);
		List<SpaceStationDTO> dto = this.service.findByName(name);
		if (dto != null) {
			model.addAttribute("dto", dto);
		} else {
			model.addAttribute("message1", "Data not found");
		}
		return "FindByName";
	}
	
	@GetMapping("searchByNameAndCountries")
	public String onfindByNameAndCountry(@RequestParam String name, @RequestParam String countries,Model model) {
		System.out.println("Running on search for name and color " + name + countries);
		if(!name.isEmpty() && countries.isEmpty()){
			List<SpaceStationDTO> dtoName=this.service.findByName(name);
			System.out.println("Name size "+dtoName.size());
			if(dtoName.size()!=0) {
				model.addAttribute("dtoName",dtoName);
				return "searchByNameAndCountries";
			}else {
				model.addAttribute("message1", "Data not found");
				return "searchByNameAndCountries";		
			}
			
		}else if(name.isEmpty() && !countries.isEmpty()) {
			List<SpaceStationDTO> dtoCountries=this.service.findByCountries(countries);
			System.out.println("Country size "+dtoCountries.size());
			if(dtoCountries.size()!=0) {
				model.addAttribute("dtoCountries",dtoCountries);
				return "SpaceStationNameAndCountry";
			}else {
				model.addAttribute("message2", "Data not found");
				return "SpaceStationNameAndCountry";
		}
	}
		else {
			List<SpaceStationDTO> dto=this.service.findByNameAndCountry(name, countries);
			if (dto != null) {
				model.addAttribute("dto", dto);
				return "SpaceStationNameAndCountry";
			} else {
				model.addAttribute("message3", "Data not found");
			return "SpaceStationNameAndCountry";
		}
	}
}	
	
}
