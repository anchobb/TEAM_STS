package com.test.app.Domain.Dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MembershipDto {
	private String id;
	private String name;
	private LocalDate startDate;
	private LocalDate endDate;
	private String membershipCode;
	
	
}