package com.example.event.save;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionPhase;
import org.springframework.transaction.event.TransactionalEventListener;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

@Component
public class SaveEventListener {
    private static Logger logger = LoggerFactory.getLogger(SaveEventListener.class);

    @Async
    @TransactionalEventListener(phase = TransactionPhase.AFTER_COMPLETION, fallbackExecution = true)
    public void initializationMerchantEvent(SaveEvent event) {
        Long saveId = event.getSaveId();
        System.out.println("saveId=" + saveId);
        System.out.println("com.example.event.save.SaveEventListener.initializationMerchantEvent()");
    }

}
