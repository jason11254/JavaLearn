/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.arduino.dht;

/**
 *
 * @author MB-study
 */
public abstract class Callback {
    private boolean relayValue;
    public abstract void getValue(String fulldata);
    public void setRelayValue() {
        relayValue = !relayValue;
    }
    public boolean getRelayValue() {
        return relayValue;
    }
    
}
