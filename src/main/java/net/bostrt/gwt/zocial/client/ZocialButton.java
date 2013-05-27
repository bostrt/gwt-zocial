/*
 * Copyright 2013 Robert Bost
 */
package net.bostrt.gwt.zocial.client;

import net.bostrt.gwt.zocial.client.resource.ZocialButtonResources;
import com.google.gwt.user.client.ui.Button;

/**
 *
 * @author Robert Bost <bostrt at gmail dot com>
 */
public abstract class ZocialButton extends Button
{
    static 
    {
        ZocialButtonResources.INSTANCE.zocial().ensureInjected();
    }

    /**
     * Toggle this button between showing text and icon only.
     * @param iconOnly True to only show icon and hide text. False to show text.
     */
    public void setIconOnly(boolean iconOnly)
    {
        if(iconOnly) {
            addStyleName(ZocialButtonResources.INSTANCE.zocial().icon());
        } else {
            removeStyleName(ZocialButtonResources.INSTANCE.zocial().icon());
        }
    }
}
