package com.jiaopi404.demos2.demo1;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("database")
public class PropertyDemo {
    private String driverName;

    private String url;

    private String username;

    private String password;

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        System.out.println("setter, driverName is: " + driverName);
        this.driverName = driverName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "PropertyDemo{" +
                "driverName='" + driverName + '\'' +
                ", url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
