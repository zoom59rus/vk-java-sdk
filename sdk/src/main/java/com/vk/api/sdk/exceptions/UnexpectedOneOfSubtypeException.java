package com.vk.api.sdk.exceptions;

import java.util.Set;

public class UnexpectedOneOfSubtypeException extends Exception {
    public UnexpectedOneOfSubtypeException(String subtypeValue, Class<?> oneOfType, Set<String> allowed) {
        super("Unexpected subtype " + subtypeValue + " in OneOf " + oneOfType.toString() + ". Allowed subtype values: " + allowed.toString());
    }
}