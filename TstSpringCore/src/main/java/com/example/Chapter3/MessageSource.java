package com.example.Chapter3;

import org.springframework.context.MessageSourceResolvable;
import org.springframework.context.NoSuchMessageException;

import java.util.Locale;

public interface MessageSource {

    String getMessage(MessageSourceResolvable resolvable, Locale locale)throws NoSuchMessageException;
    String getMessage(String code, Object[] args, Locale locale)throws NoSuchMessageException;
    String getMessage( String code, Object[] args, String defaultMessage, Locale locale);
}
