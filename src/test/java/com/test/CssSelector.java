package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CssSelector extends Base {
public static void main(String[] args) {
		//		browserLaunch("https://www.facebook.com/");
//		driver.findElement(By.cssSelector("input#email")).sendKeys("1245");
	
		browserLaunch("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569870%7Cb%7Cfacebook%20create%20account%7C&placement=&creative=589460569870&keyword=facebook%20create%20account&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221432%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-12091220328%26loc_physical_ms%3D9061892%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=Cj0KCQjwy4KqBhD0ARIsAEbCt6j3RYzEMzhcNiAfcoMOdLV0kgImPrwhj9byMLsBim3NDoeePJnix3AaArFSEALw_wcB");
//		Starts  with^
//		driver.findElement(By.cssSelector("input[class^='inputtext ']")).sendKeys("kani1234");
		
//		endsWith
		driver.findElement(By.cssSelector("input[class$='_2ph-']")).sendKeys("1234");
		
		
}
}
