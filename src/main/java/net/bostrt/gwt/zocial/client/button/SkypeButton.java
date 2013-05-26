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
public class SkypeButton extends ZocialButton
{
    public SkypeButton()
    {
        setStyleName(ZocialButtonResources.INSTANCE.zocial().zocial());
        addStyleName(ZocialButtonResources.INSTANCE.zocial().skype());
        setText("Call me on Skype");
    }
}
