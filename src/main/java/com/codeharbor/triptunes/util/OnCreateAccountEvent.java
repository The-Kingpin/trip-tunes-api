package com.codeharbor.triptunes.util;

import com.codeharbor.triptunes.dto.UserDTO;
import org.springframework.context.ApplicationEvent;

public class OnCreateAccountEvent extends ApplicationEvent {
    private final UserDTO userDTO;
    private final String appUrl;

    public OnCreateAccountEvent(UserDTO userDTO, String appUrl) {
        super(userDTO);
        this.userDTO = userDTO;
        this.appUrl = appUrl;
    }

    public String getAppUrl() {
        return appUrl;
    }

    public UserDTO getAccount() {
        return this.userDTO;
    }
}
