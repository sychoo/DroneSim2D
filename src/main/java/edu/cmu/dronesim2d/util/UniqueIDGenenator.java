package edu.cmu.dronesim2d.util;

import java.util.UUID;

public class UniqueIDGenenator {

    public static  String generate(){
        return UUID.randomUUID().toString();
    }
}
