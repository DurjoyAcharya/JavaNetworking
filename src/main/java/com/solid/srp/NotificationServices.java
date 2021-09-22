package com.solid.srp;

public class NotificationServices {
    public void sendOTP(String medium)
    {
        if (medium.equals("email"))
        {
            //do some job
            //use java mail sender api
        }
        if (medium.equals("mobile"))
        {
            //do some job
            //use java twillio api
        }
    }
}
