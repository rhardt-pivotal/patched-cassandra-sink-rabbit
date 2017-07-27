package io.pivotal.fe.patchedcassandrasinkrabbit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.stream.app.cassandra.sink.CassandraSinkConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(CassandraSinkConfiguration.class)
public class PatchedCassandraSinkRabbitApplication  {

	public static void main(String[] args) {
		SpringApplication.run(PatchedCassandraSinkRabbitApplication.class, args);
	}


}
