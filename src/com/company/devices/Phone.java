package com.company.devices;

public class Phone extends Device{

    public enum OperationSystem {
        ANDROID, WINDOWS_MOBILE, IOS
    }

    Double screenSize;

    public OperationSystem operationSystem;

    @Override
    public void turnOn() {
        System.out.println("wciskam przycisk");
        System.out.println("czekam");
        System.out.println("widzę jabłko");
    }

    public void installAnApp(String appName){
        System.out.println("instaluje" + appName);
    }

    public void installAnApp(String appName, String appVersion){
        System.out.println("instaluje" + appName + appVersion);
    }

}
