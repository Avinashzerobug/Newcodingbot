package com.source.runner;

import java.time.LocalDateTime;
import java.time.Month;

import com.source.dto.WarDto;
import com.source.repository.WarRepositary;
import com.source.repository.WarRepositaryImpl;

public class WarRepositaryRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WarRepositary repo = new WarRepositaryImpl();
		WarDto dto = new WarDto();
		dto.setEndDate(2023);
		dto.setName("Russia vs Ukraine War");
		dto.setNoOfDeaths(20000);
		dto.setStartDate(2022);
		dto.setStartedBy("Russia");
		dto.setWonBy("Russia");
		dto.setStartedWith("Ukraine");
		dto.setCreatedby("Avinash Mullur");
		dto.setUpdatedBy("Avinash Assassin");
		dto.setStarted(LocalDateTime.now());
		dto.setEnded(LocalDateTime.now());
		dto.setUpdatedDateTime(LocalDateTime.of(2022,Month.DECEMBER,11,12,13));
		dto.setCreatedDateTime(LocalDateTime.now());
		
		repo.creating(dto);
		System.out.println(System.lineSeparator());
		System.out.println("----After Checking the equal Properties----");
		System.out.println(System.lineSeparator());
		
		
		
		repo.findStartedBy("Russia", 2022);
		repo.findByStartedAndStartedWith("Ukraine","Russia",LocalDateTime.now(),LocalDateTime.now());
		repo.total();
		
		
	}

}
