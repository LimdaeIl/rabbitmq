package com.market.payment;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class PaymentEndpoint {

  @Value("${spring.application.name}")
  private String appName;

  @RabbitListener(queues = "${message.queue.payment}")
  public void receiveMessage(String orderId) {
    log.info("receive orderId:{}, appName : {}", orderId, appName);
  }
}
