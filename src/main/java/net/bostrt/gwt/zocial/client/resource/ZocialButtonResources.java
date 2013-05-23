/*
 * Copyright 2013 Robert Bost
 */
package net.bostrt.gwt.zocial.client.resource;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;

/**
 *
 * @author Robert Bost <bostrt at gmail dot com>
 */
public interface ZocialButtonResources extends ClientBundle
{
    public static final ZocialButtonResources INSTANCE = 
            GWT.create(ZocialButtonResources.class);
    
    @Source("zocial.css")
    ZocialCss zocial();
}
