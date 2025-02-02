package id.my.hendisantika.observability.service;

import id.my.hendisantika.observability.repository.PeanutsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-observability-sample
 * User: hendisantika
 * Link: s.id/hendisantika
 * Email: hendisantika@yahoo.co.id
 * Telegram : @hendisantika34
 * Date: 02/02/25
 * Time: 13.43
 * To change this template use File | Settings | File Templates.
 */
@Service
@RequiredArgsConstructor
public class PeanutsService {
    private final PeanutsRepository repository;

}
