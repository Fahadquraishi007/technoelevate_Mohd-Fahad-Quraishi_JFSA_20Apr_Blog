  
package com.te.springmvc.beans;

import java.io.Serializable;

import lombok.Data;

@Data
public class UserDetails implements Serializable {

	private int empId;

	private String user;

	private String password;
}