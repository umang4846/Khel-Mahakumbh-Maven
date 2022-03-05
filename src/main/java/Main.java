import constants.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//        System.out.println(System.getProperty("user.dir").concat("\\chromedriver.exe"));
//        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir").concat("\\chromedriver.exe"));
//        WebDriver webDriver = new ChromeDriver();
//        webDriver.manage().window().maximize();
//        webDriver.get("https://www.google.com/");
//        Thread.sleep(5000);
//        webDriver.close();


        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir").concat("\\chromedriver.exe"));
//        ChromeOptions chromeOptions = new ChromeOptions();
//        chromeOptions.addArguments("--headless");
//        chromeOptions.addArguments("--no-sandbox");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        driver.get(Constants.LOGIN);
        System.out.println(driver.getTitle());
        WebElement school = driver.findElement(By.xpath("//label[contains(text(),'શાળા/કૉલેજ')]"));
        school.click();
        System.out.println(school.getText());

        System.out.println("Radio Button School Selected");

        Thread.sleep(50000);

        driver.get(Constants.INDIVIDUAL_REGISTRATION);

        //WebElement vyakthigatRegistration = driver.findElement(By.xpath("//label[contains(text(),'વ્યક્તિગત રજીસ્ટ્રેશન')]"));
        //   vyakthigatRegistration.click();

        String firstName = "FirstName";
        driver.findElement(By.id("first_name")).sendKeys(firstName.trim());
        Thread.sleep(500);

        String middleName = "MiddleName";
        driver.findElement(By.id("middle_name")).sendKeys(middleName.trim());
        Thread.sleep(500);

        String lastName = "LastName";
        driver.findElement(By.id("last_name")).sendKeys(lastName.trim());
        Thread.sleep(500);


        /*
        <option value="3">અંડર 11</option>
<option value="4">અંડર 14</option>
<option value="5">અંડર 17</option>*/

        String under11 = "under 11";
        String under14 = "under 14";
        String under17 = "under 17";
        Select ageGroupDropDown = new Select(driver.findElement(By.name("individual_player_ms_age_groups_id")));
        if (!under11.isEmpty())
            ageGroupDropDown.selectByVisibleText("અંડર 11");
        Thread.sleep(500);


        String gender = "Male";

        WebElement genderRadioButton;
        if (gender.equalsIgnoreCase("male"))
            genderRadioButton = driver.findElement(By.xpath("//label[contains(text(),'પુરૂષ')]"));
        else
            genderRadioButton = driver.findElement(By.xpath("//label[contains(text(),'સ્ત્રી')]"));
        genderRadioButton.click();
        System.out.println(genderRadioButton.getText() + " is selected as gender");
        Thread.sleep(500);


        //Date of birth in dd/MM/YYYY format
        String dob = "03-02-2001";

        driver.findElement(By.id("date_of_birth")).sendKeys(dob.trim());
        //Select s = new Select(driver.findElement(By.xpath("//select[@name=’selType’]")));

        Thread.sleep(3000);

        Select gamesNameDropDown = new Select(driver.findElement(By.name("individual_player_ms_sports_id")));
        System.out.println("games dropdown " + gamesNameDropDown);
        gamesNameDropDown.selectByVisibleText("એથ્લેટિક્સ");
        Thread.sleep(3000);

//        Select SubGamesNameDropDown = new Select(driver.findElement(By.name("individual_player_ms_sub_sports_id_multi[]")));
//        System.out.println("sub games dropdown " + SubGamesNameDropDown);
//        SubGamesNameDropDown.selectByVisibleText("50 મીટર(સીધી શાળા કક્ષાથી શરૂ થતી સ્પર્ધા)");
//        Thread.sleep(500);


        String mobileNumber = "9824794773";
        driver.findElement(By.id("mobile_number")).sendKeys(mobileNumber.trim());
        Thread.sleep(500);

        String weightInKg = "28";
        driver.findElement(By.id("weight")).sendKeys(weightInKg.trim());
        Thread.sleep(500);

        String heightInCm = "123";
        driver.findElement(By.id("height")).sendKeys(heightInCm.trim());
        Thread.sleep(500);

        String aadharCardNumber = "28121212121212122";
        driver.findElement(By.id("aadhaar_card_number")).sendKeys(aadharCardNumber.trim());
        Thread.sleep(500);

        String email = "email@gmail.com";
        driver.findElement(By.id("email")).sendKeys(email.trim());
        Thread.sleep(500);

        String guardianFirstName = "guardianFirstName";
        driver.findElement(By.id("guardian_first_name")).sendKeys(guardianFirstName.trim());
        Thread.sleep(500);

        String guardianLastName = "guardianLastName";
        driver.findElement(By.id("guardian_last_name")).sendKeys(guardianLastName.trim());
        Thread.sleep(500);

        String guardianMobileNumber = "9999999999";
        driver.findElement(By.id("guardian_mobile_number")).sendKeys(guardianMobileNumber.trim());
        Thread.sleep(500);

        String bankName = "bankName";
        driver.findElement(By.id("bank_name")).sendKeys(bankName.trim());
        Thread.sleep(500);

        String bankBranch = "bankBranch";
        driver.findElement(By.id("branch")).sendKeys(bankBranch.trim());
        Thread.sleep(500);

        String bankAccountOwnerName = "bankAccountOwnerName";
        driver.findElement(By.id("bank_account_name")).sendKeys(bankAccountOwnerName.trim());
        Thread.sleep(500);

        String bankAccountNo = "1234567891011";
        driver.findElement(By.id("account_no")).sendKeys(bankAccountNo.trim());
        Thread.sleep(500);

        String bankISFCCode = "ABCD0123456";
        driver.findElement(By.id("ifsc_code")).sendKeys(bankISFCCode.trim());
        Thread.sleep(500);

        String coachName = "coachName";
        driver.findElement(By.id("coach_name")).sendKeys(coachName.trim());
        Thread.sleep(500);

        String coachMobileNumber = "8888899999";
        driver.findElement(By.id("coach_mobile_number")).sendKeys(coachMobileNumber.trim());
        Thread.sleep(500);

        String coachAddress = "coachAddress";
        driver.findElement(By.id("coach_address")).sendKeys(coachAddress.trim());
        Thread.sleep(500);


        WebElement defaultCheck1 = driver.findElement(By.id("defaultCheck1"));
        defaultCheck1.click();
        Thread.sleep(500);

        //driver.findElement(By.id("individual_player_ms_sports_id")).sendKeys("FIRST NAME");
        // driver.findElement(By.id("first_name")).sendKeys("FIRST NAME");
        // driver.findElement(By.id("first_name")).sendKeys("FIRST NAME");


        Thread.sleep(100000);

        //   WebElement school = driver.findElement(By.id("form_type2"));


        //   driver.get(Constants.DASHBOARD);
        //    System.out.println(driver.getTitle());


//
//        Thread.sleep(1000);
//
//        if (driver.getPageSource().contains("I'm Feeling Lucky")) {
//            System.out.println("Pass");
//        } else {
//            System.out.println("Fail");
//        }
//        driver.quit();
    }
}
