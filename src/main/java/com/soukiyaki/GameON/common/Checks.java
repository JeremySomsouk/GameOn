package com.soukiyaki.GameON.common;

import com.soukiyaki.GameON.common.exceptions.InvalidParameterException;

public class Checks {

    public static void checkIfNullParameter(Object obj, String message) throws InvalidParameterException {
        if (obj == null) throw new InvalidParameterException(message);
    }


    public static void checkIfNullOrEmptyParameter(String str, String message) throws InvalidParameterException {
        if (str == null || str.isEmpty()) throw new InvalidParameterException(message);
    }
}
