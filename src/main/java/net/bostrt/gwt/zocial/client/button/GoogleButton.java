/*
 * Copyright 2013 Robert Bost
 */
package net.bostrt.gwt.zocial.client.button;

import net.bostrt.gwt.zocial.client.ZocialButton;
import net.bostrt.gwt.zocial.client.resource.ZocialButtonResources;

/**
 *
 * @author Robert Bost <bostrt at gmail dot com>
 */
public class GoogleButton extends ZocialButton
{
    public GoogleButton()
    {
        setStyleName(ZocialButtonResources.INSTANCE.zocial().zocial());
        addStyleName(ZocialButtonResources.INSTANCE.zocial().google());
        setText("Sign in with Google");
    }
}
