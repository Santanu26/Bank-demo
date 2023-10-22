package com.example.message.function;

import com.example.message.dto.AccountMessageDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Function;

@Configuration
public class MessageFunctions {

    private static final Logger LOGGER =  LoggerFactory.getLogger(MessageFunctions.class);


    @Bean
    public Function<AccountMessageDto, AccountMessageDto> email() {
        return accountMessageDto -> {
          LOGGER.info("sending email with the details: "+ accountMessageDto.toString());
          return accountMessageDto;
        };
    }
    @Bean
    public Function<AccountMessageDto, Long> sms() {
        return accountMessageDto -> {
            LOGGER.info("sending sms with the details: "+ accountMessageDto);
            return accountMessageDto.accountNumber();
        };
    }
}
