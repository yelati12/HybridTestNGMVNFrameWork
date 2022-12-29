package com.orangeHRM.or;

import org.openqa.selenium.By;

public class HomePage {

	public static By AddButton = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']");
	public static By firstname=By.xpath("//input[@name='firstName']");
	public static By MiddleName = By.xpath("//input[@name='middleName']");
	public static By LastName = By.xpath("//input[@name='lastName']");
	public static By CreateLoginDetailsToggle = By.xpath("//span[@class=\"oxd-switch-input oxd-switch-input--active --label-right\"]");
	public static By saveButton = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']");
	
}
