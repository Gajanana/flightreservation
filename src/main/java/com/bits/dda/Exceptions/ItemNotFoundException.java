package com.bits.dda.Exceptions;

import org.webjars.NotFoundException;

public class ItemNotFoundException extends NotFoundException {


    public ItemNotFoundException(Long id) {
        super(String.format("Item [%s] is not found", id));
    }

}
