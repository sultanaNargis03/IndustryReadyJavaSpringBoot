package com.telusko.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

import lombok.Data;

import lombok.Data;

@Entity
@Data
public class Profile 
{
	@Id
	private Integer pid;
	private String name;
	
	@Lob
	@Column(name="IMAGE")
	private byte[] img;
	@Column(name="DOC")
	
	private char[] charfile;
}
