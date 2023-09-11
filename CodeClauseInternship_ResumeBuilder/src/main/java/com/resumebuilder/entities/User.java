package com.resumebuilder.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	private String linkedin;
	private String github;
	private String lastName;
	@Column(unique = true)
	private String email;
	private String password;
	private String address;
	private String gender;
	private String contact;
	private List<String> skills;
	private List<String> works;
	private String imageUrl;
	private String about;
	private String others;
	
	List<String> educations;
	
	
	public List<String> getEducations() {
		return educations;
	}
	public void setEducations(List<String> educations) {
		this.educations = educations;
	}
	public String getAbout() {
		return about;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public List<String> getSkills() {
		return skills;
	}
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	
	public String getLinkedin() {
		return linkedin;
	}
	public void setLinkedin(String linkedin) {
		this.linkedin = linkedin;
	}
	public String getGithub() {
		return github;
	}
	public void setGithub(String github) {
		this.github = github;
	}
	public List<String> getWorks() {
		return works;
	}
	public void setWorks(List<String> works) {
		this.works = works;
	}
	public String getOthers() {
		return others;
	}
	public void setOthers(String others) {
		this.others = others;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", lasttName=" + lastName + ", email=" + email + ", password="
				+ password + ", address=" + address + ", gender=" + gender + ", contact=" + contact + ", skills="
				+ skills + ", imageUrl=" + imageUrl + ", about=" + about + ", educations=" + educations
				+ ", getEducations()=" + getEducations() + ", getAbout()=" + getAbout() + ", getLasttName()="
				+ getLastName() + ", getImageUrl()=" + getImageUrl() + ", getSkills()=" + getSkills() + ", getId()="
				+ getId() + ", getName()=" + getName() + ", getEmail()=" + getEmail() + ", getPassword()="
				+ getPassword() + ", getAddress()=" + getAddress() + ", getGender()=" + getGender() + ", getContact()="
				+ getContact() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
}
