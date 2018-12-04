package com.example.event.save;

import org.springframework.context.ApplicationEvent;

public class SaveEvent extends ApplicationEvent {
    private Long merchantId;

    public SaveEvent(Object source, Long merchantId) {
        super(source);
        this.merchantId = merchantId;
    }

    public Long getSaveId() {
        return merchantId;
    }

}