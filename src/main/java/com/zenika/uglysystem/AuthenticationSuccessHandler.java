package com.zenika.uglysystem;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.security.authentication.event.AuthenticationSuccessEvent;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Component;

@Component
public class AuthenticationSuccessHandler implements ApplicationListener<AuthenticationSuccessEvent> {

    private static final Logger LOG = LoggerFactory.getLogger(AuthenticationSuccessHandler.class);

    @Override
    public void onApplicationEvent(AuthenticationSuccessEvent event) {
        Authentication authentication = event.getAuthentication();
        // this should not be logged, but keep it in mind for the other teams
        // LOG.info("{} logged in", ((User) authentication.getPrincipal()).getUsername());
    }
}
