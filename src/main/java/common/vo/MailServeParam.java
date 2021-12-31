package common.vo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Data
@Component
@ConfigurationProperties(prefix = "spring.mail")
public class MailServeParam implements Serializable {

    private static final long serialVersionUID = 1L;

    @Value("")
    String host;

    String username;

    String password;
}
