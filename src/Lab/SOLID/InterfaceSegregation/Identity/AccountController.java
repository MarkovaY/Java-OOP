package Lab.SOLID.InterfaceSegregation.Identity;


import Lab.SOLID.InterfaceSegregation.Identity.Interfaces.Account;

public class AccountController {
    private final Account manager;

    public AccountController(Account manager) {
        this.manager = manager;
    }
    public void changePassword(String oldPass,String newPass){
        this.manager.changePassword(oldPass,newPass);
    }
}