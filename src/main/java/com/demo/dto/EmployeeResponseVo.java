package com.demo.dto;

import lombok.Data;

@Data

public class EmployeeResponseVo {

	private long id;
	
	private String name;
	
	private double salary;
	
	private String errCode;
	
	private String errDesc;

}
