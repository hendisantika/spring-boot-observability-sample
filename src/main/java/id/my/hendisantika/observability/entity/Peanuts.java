package id.my.hendisantika.observability.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-observability-sample
 * User: hendisantika
 * Link: s.id/hendisantika
 * Email: hendisantika@yahoo.co.id
 * Telegram : @hendisantika34
 * Date: 02/02/25
 * Time: 13.40
 * To change this template use File | Settings | File Templates.
 */
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Peanuts implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Schema(example = "Snoopy")
    private String name;

    @Schema(example = "Charlie Brown's pet beagle")
    private String description;
}
