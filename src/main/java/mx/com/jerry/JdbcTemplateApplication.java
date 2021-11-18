package mx.com.jerry;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

@SpringBootApplication
public class JdbcTemplateApplication {

	public static void main(String[] args) {
		SpringApplication.run(JdbcTemplateApplication.class, args);
	}
	
//	@Bean
//	public DataSource dataSource() {
//	    return new EmbeddedDatabaseBuilder()
//	      .setType(EmbeddedDatabaseType.H2)
//	      .addScript("classpath:jdbc/schema.sql").build();
//	}

}
