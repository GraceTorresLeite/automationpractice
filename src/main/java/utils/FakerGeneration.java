package utils;


import java.util.Locale;

import org.openqa.selenium.WebDriver;

import com.github.javafaker.Faker;

public class FakerGeneration {
	private Faker faker;
    private String firstName;
    private String lastName;
    private String email;
    private String company;
    private String profession;
    private String genre;
    private String age;
    private String address;
    private String phone;
    private String code;
    private String date;
   

    public FakerGeneration(WebDriver driver){

        faker = new Faker(new Locale("pt-BR"));
    }

    public String getFirstName(){

         firstName = faker.name().firstName();
         return firstName;

        //return faker.name().firstName();
    }

    public String getLastName(){

        lastName = faker.name().lastName();
        return lastName;
    }

    public String getEmail(){

       email = faker.internet().emailAddress();
       return email;
    }

    public String getCompany(){

        company = faker.company().name();
        return company;
    }

    public String getProfession(){

        profession = faker.job().title();
        return profession;
    }

    public String getGenre() {
        genre = faker.demographic().sex();
        return genre;
    }

    public String getAge(){

        age = faker.number().digit();
        return age;
    }

    public String getAddress(){

        address = faker.address().streetAddress();
        return address;
    }
    public String getAddressFirtsName(){

        address = faker.address().firstName();
        return address;
    }
    public String getAddressLastName(){

        address = faker.address().lastName();
        return address;
    }
    public String getAddressNumber(){

        address = faker.address().streetAddressNumber();
        return address;
    }
    
    public String getAddressCity(){

        address = faker.address().cityName();
        return address;
    }
    
    public String getAddressState(){

        address = faker.address().state();
        return address;
    }
    
    public String getAddressCountry(){

        address = faker.address().country();
        return address;
    }
    
    public String getAddressPostalCode(){

        address = faker.address().countryCode();
        return address;
    }
    
    public String getPhoneHome(){

        phone = faker.phoneNumber().phoneNumber();
        return phone;
    }
    
    public String getPhoneMobile(){

        phone = faker.phoneNumber().cellPhone();
        return phone;
    }
    
    public String getBooleanAddressSecundary() {
    	address = faker.address().streetAddress(false);
    	return address;
    }
    
    public String getDateYear(){
//    	Calendar c1 = Calendar.getInstance(); 
//    	c1.set(Calendar.YEAR, 1979); 
//    	
//    	Calendar c2 = Calendar.getInstance(); 
//    	c2.set(Calendar.YEAR, 2005); 
//    	
//    	Date datefrom = c1.getTime(); 
//    	Date dateto = c2.getTime(); 
    
        date = faker.number().digit();
        return date;
    }
    
    public String getDateDay() {
    
    	date = faker.number().digit();
        return date;
    }
    
    public String getDateMonth() {
        
    	date = faker.number().digit();
        return date;
    }
    
    public String getPassword(){

        code = faker.code().isbn10();
        return code;
    }

}
