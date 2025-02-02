package id.my.hendisantika.observability.controller;

import id.my.hendisantika.observability.service.PeanutsService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-observability-sample
 * User: hendisantika
 * Link: s.id/hendisantika
 * Email: hendisantika@yahoo.co.id
 * Telegram : @hendisantika34
 * Date: 02/02/25
 * Time: 13.45
 * To change this template use File | Settings | File Templates.
 */
@Slf4j
@Service
@EnableCaching
@RestController
@RequiredArgsConstructor
public class PeanutController {
    private final PeanutsService peanutsService;

    @GetMapping("/")
    public String root(@RequestParam(value = "name", defaultValue = "World") String name, @RequestHeader HttpHeaders headers) {
        log.error(headers.toString());
        log.error("Hello {}!!", name);
        log.debug("Debugging log");
        log.info("Info log");
        log.warn("Hey, This is a warning!");
        log.error("Oops! We have an Error. OK");
        return String.format("Hello %s!!", name);
    }

    @GetMapping("/io_task")
    public String ioTask() throws InterruptedException {
        Thread.sleep(1000);
        log.info("io_task");
        return "io_task";
    }

}
