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
}
