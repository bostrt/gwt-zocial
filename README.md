gwt-zocial
==========

GWT buttons using the [Zocial CSS](http://zocial.smcllns.com) theme.

Add to your project
-------------------
Add the following to your pom.xml file

    <dependency>
        <groupId>net.bostrt.gwt</groupId>
        <artifactId>zocial</artifactId>
        <version>1.0-SNAPSHOT</version>
    </dependency>

Add the following to your *.gwt.xml file

    <inherits name="net.bostrt.gwt.zocial.Zocial"/>

That's it!

In Code
-------

Now you can create buttons directly in code

    import net.bostrt.gwt.zocial.client.button.GooglePlusButton;
    ...
    GooglePlusButton gPlusButton = new GooglePlusButton();
    gPlusButton.addClickHandler(...);
    
UiBinder
--------

You can also use these buttons in UiBinder 

    <ui:UiBinder xmlns:ui="urn:ui:com.google.gwt.uibinder"
             xmlns:z="urn:import:net.bostrt.gwt.zocial.client.button">
        ...
        <z:GooglePlusButton ui:field="gPlusButton" />
        ...
