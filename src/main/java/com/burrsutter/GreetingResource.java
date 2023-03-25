package com.burrsutter;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Date;


@Path("/")
public class GreetingResource {
    int cnt = 1;
    private static final String HOSTNAME = 
        System.getenv().getOrDefault("HOSTNAME", "unknown");


    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String root() {
        Locale locale;
        DateFormat dateFormat; 
        String pattern; 
        SimpleDateFormat simpleDateFormat; 
    
        locale = new Locale("en", "US");
        dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
        // pattern = "dd-M-yyyy hh:mm:ss"; // euro
        pattern = "M-dd-yyyy hh:mm:ss"; // us
        simpleDateFormat = new SimpleDateFormat(pattern);
        String stringNow = simpleDateFormat.format(new Date());

        System.out.println("Aloha: " + cnt);
        return "Aloha Quarkus " + cnt++ + " " + stringNow + " on " + HOSTNAME;
    }

    @GET
    @Path("/hello")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello";
    }
}