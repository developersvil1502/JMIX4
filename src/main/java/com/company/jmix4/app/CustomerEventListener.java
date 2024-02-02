package com.company.jmix4.app;

import com.company.jmix4.entity.PointTemplate;
import com.company.jmix4.entity.Template;
import io.jmix.core.DataManager;
import io.jmix.core.event.EntitySavingEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class CustomerEventListener {
    @Autowired
    private DataManager dataManager;

    @EventListener
    public void onTemplateSaving(EntitySavingEvent<Template> event) {

            Template template = event.getEntity();
           // PointTemplate points = eventPoint.getEntity();
            if (template.getPointTemplates() != null) {
                template.setCountPoints(template.getPointTemplates().size());
                System.out.println("================");
                System.out.println(template.getPointTemplates().size());
                System.out.println(template);
                System.out.println("================");
            }

        }


    }
