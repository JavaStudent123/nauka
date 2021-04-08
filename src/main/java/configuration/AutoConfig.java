package configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import(Config.class)
@Configuration
@ComponentScan("implementation")

public class AutoConfig {
}
