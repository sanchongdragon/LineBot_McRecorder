package org.mingwu;

import com.linecorp.bot.spring.boot.annotation.LineMessageHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@LineMessageHandler
@Slf4j
public class McRecorderApplication {
    public static void main(String[] args) {
        SpringApplication.run(McRecorderApplication.class, args);
    }
}