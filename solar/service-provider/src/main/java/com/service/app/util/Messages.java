package com.service.app.util;

import java.text.MessageFormat;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Messages {

    public static final String BUNDLE_NAME = "ussdmenu"; //$NON-NLS-1$
    private static ResourceBundle resourceBundle = ResourceBundle.getBundle(BUNDLE_NAME);
    private static final Logger LOGGER = Logger.getLogger(Messages.class.getName());

    private Messages() {
    }

    public static String getMessage(final String key, final Object... arguments) {
        try {
            if (arguments != null)
                return MessageFormat.format(resourceBundle.getString(key), arguments);
            return resourceBundle.getString(key);
        } catch (MissingResourceException e) {
            LOGGER.log(Level.ALL, "Message key not found: " + key);
            return '!' + key + '!';
        }
    }
}
