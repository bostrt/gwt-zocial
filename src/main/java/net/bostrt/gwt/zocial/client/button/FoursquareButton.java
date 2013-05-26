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
public class FoursquareButton extends ZocialButton
{
    public FoursquareButton()
    {
        setStyleName(ZocialButtonResources.INSTANCE.zocial().zocial());
        addStyleName(ZocialButtonResources.INSTANCE.zocial().foursquare());
        setText("Check in with foursquare");
    }
}
