package com.api.parkingcontrol.consumers;

import com.api.parkingcontrol.dtos.EmailDto;
import com.api.parkingcontrol.models.EmailModel;
import com.api.parkingcontrol.services.EmailService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class EmailConsumer {

    @Autowired
    EmailService emailService;

        @RabbitListener(queues = "${spring.rabbitmp.queue}")
        public void listen(@Payload EmailDto emailDto){
            EmailModel emailModel = new EmailModel();
            BeanUtils.copyProperties(emailDto, emailModel);
            emailService.enviarEmail(emailModel);
            System.out.println("Email Status: " + emailModel.getStatusEmail().toString());
        }



}
