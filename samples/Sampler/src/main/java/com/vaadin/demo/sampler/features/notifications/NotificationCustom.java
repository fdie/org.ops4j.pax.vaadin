package com.vaadin.demo.sampler.features.notifications;

import com.vaadin.demo.sampler.APIResource;
import com.vaadin.demo.sampler.Feature;
import com.vaadin.demo.sampler.NamedExternalResource;
import com.vaadin.ui.Window;

@SuppressWarnings("serial")
public class NotificationCustom extends Feature {

    @Override
    public Version getSinceVersion() {
        return Version.OLD;
    }

    @Override
    public String getName() {
        return "Customized notification";
    }

    @Override
    public String getDescription() {
        return "A notification can have a caption, a richtext"
                + " description, and an icon. Position and delay can"
                + " also be customized.<br/>Note that more often than"
                + " not, less is more: try to make the messages short"
                + " and to the point.";
    }

    @Override
    public APIResource[] getRelatedAPI() {
        return new APIResource[] { new APIResource(Window.class),
                new APIResource(Window.Notification.class) };
    }

    @Override
    public Class<? extends Feature>[] getRelatedFeatures() {
        return getSiblingFeatures();
    }

    @Override
    public NamedExternalResource[] getRelatedResources() {
        return new NamedExternalResource[] { new NamedExternalResource(
                "Monolog Boxes and Transparent Messages",
                "http://humanized.com/weblog/2006/09/11/monolog_boxes_and_transparent_messages/") };

    }

}
