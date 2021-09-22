package com.solid.ocp;


/**
 * Open-Closed Principle(OCP)
 * The Open-closed principle states that according to new
 * requirements the module should be open for extension but close
 * for modification
 */
public interface NotificationServices {

    public void sendOTP(String medium);

    public void TransactionReport(String medium);
}
