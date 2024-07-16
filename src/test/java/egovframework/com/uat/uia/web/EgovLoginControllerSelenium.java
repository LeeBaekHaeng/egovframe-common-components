package egovframework.com.uat.uia.web;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EgovLoginControllerSelenium {

	@Test
	public void test() throws InterruptedException {
		// given
		WebDriver driver = new ChromeDriver();

		driver.get("http://localhost:8080/egovframework-all-in-one/uat/uia/egovLoginUsr.do");
		Thread.sleep(1000);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("location.reload();");
		Thread.sleep(1000);

		// 업무 탭 클릭
		js.executeScript("document.getElementById('typeUsr').click();");
//		WebElement typeUsr = driver.findElement(By.id("typeUsr"));
//		typeUsr.click();
		Thread.sleep(1000);

		// 아이디 입력
		WebElement id = driver.findElement(By.id("id"));
		id.sendKeys("TEST1");
		Thread.sleep(1000);

		// 패스워드 입력
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("rhdxhd12");
		Thread.sleep(1000);

		// when
		// 로그인 버튼 클릭
		js.executeScript("actionLogin();");

		// then
		// 로그아웃 버튼
		WebElement a = driver.findElement(By.tagName("a"));
		String aText = a.getText();
		if (log.isDebugEnabled()) {
			log.debug("aText={}", aText);
		}
		assertEquals("에러가 발생했습니다!", "로그아웃", aText);
	}

}
