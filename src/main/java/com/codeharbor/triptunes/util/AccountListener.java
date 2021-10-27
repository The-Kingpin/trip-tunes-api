package com.codeharbor.triptunes.util;

import com.codeharbor.triptunes.dto.UserDTO;
import com.codeharbor.triptunes.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class AccountListener implements ApplicationListener<OnCreateAccountEvent> {

    //better is to get the url from application.yaml for the purpose of the example I am using hardcoded constant
    private static final String SERVER_URL = "http://localhost:8081/";
    private JavaMailSender mailSender;
    private UserService userService;

    @Autowired
    AccountListener(JavaMailSender mailSender, UserService userService) {
        this.mailSender = mailSender;
        this.userService = userService;
    }

    @Override
    public void onApplicationEvent(OnCreateAccountEvent event) {
        this.confirmCreateAccount(event);
    }

    private void confirmCreateAccount(OnCreateAccountEvent event) {
        //get the account from inside the event
        //create verification token (Spring)
        UserDTO userDTO = event.getAccount();
        String token = "token:" + userDTO.getUsername().hashCode();

        //get email properties



        //send email
    }
}
