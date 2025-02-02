package id.my.hendisantika.observability.controller;

import id.my.hendisantika.observability.service.PeanutsService;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Service;
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
@Service
@EnableCaching
@RestController
@RequiredArgsConstructor
public class PeanutController {
    private final PeanutsService peanutsService;

}
