package org.twentyfive.shop_manager_api_layer.exceptions;

public class LabelNotFoundException extends RuntimeException {
    public LabelNotFoundException(String message) {
        super(message);
    }
}
