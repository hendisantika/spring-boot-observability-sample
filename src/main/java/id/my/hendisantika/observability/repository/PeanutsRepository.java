package id.my.hendisantika.observability.repository;

import id.my.hendisantika.observability.entity.Peanuts;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-observability-sample
 * User: hendisantika
 * Link: s.id/hendisantika
 * Email: hendisantika@yahoo.co.id
 * Telegram : @hendisantika34
 * Date: 02/02/25
 * Time: 13.42
 * To change this template use File | Settings | File Templates.
 */
public interface PeanutsRepository extends JpaRepository<Peanuts, Long> {
}
