package paraBankCustReg;

public interface Selectors {
    String url = "https://parabank.parasoft.com/parabank/index.htm";
    String regBtn = "Register";
    String usrnamelogin = ".input";
    String firstNameField = "customer.firstName";
    String lastNameField = "customer.lastName";
    String addressField = "customer.address.street";
    String cityField = "customer.address.city";
    String stateField = "customer.address.state";
    String zipcodeField = "customer.address.zipCode";
    String phonenumField = "customer.phoneNumber";
    String ssnField = "customer.ssn";
    String usernameField = "customer.username";
    String passwordField = "customer.password";
    String confirmPasswordField = "repeatedPassword";
    String registerBtn = "//input[@value='Register']";

    /*  keys to send*/

    String firstNametxt ="Joe";
    String lastNametxt ="Tochi";
    String addrtxt ="2 Oluyide str";
    String citytxt ="Ikeja";
    String statetxt ="Lagos";
    String zipcodetxt ="100323";
    String phnumtxt ="07045635364";
    String ssntxt ="998767536";
    String usrntxt ="jtvch";
    String pwdtxt ="jtochi2023";

    String confirmMessageTitle = "h1";

    String confirmMessagetxt = "Welcome jtvch";

}
