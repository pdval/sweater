package com.example.sweater.domain;/*
 *
 * Author(s):
 * Dmitry Privalov
 *
 */

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {
    USER;

    public String getAuthority() {
        return name();
    }
}
