package utilities;

import org.testng.annotations.DataProvider;

public class DataSet {

    @DataProvider(name = "invalidUserCredentials")
    public static Object invalidCredentials(){
        Object[][] data ={
                {"test@yopmail.com", "password", "Invalid password. Please check your password and try again."},
                {"username@yopmail.com", "Automation%1234", "Invalid password. Please check your password and try again."},
                {"username@yopmail.com", "password", "Invalid password. Please check your password and try again."}
        };
        return data;
    }
}
