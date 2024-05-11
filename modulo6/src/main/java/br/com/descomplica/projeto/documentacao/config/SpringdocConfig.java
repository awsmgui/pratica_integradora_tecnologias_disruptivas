package br.com.descomplica.projeto.documentacao.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class SpringdocConfig {
	@Bean
	  public OpenAPI springShopOpenAPI() {
	      return new OpenAPI()
	              .info(new Info().title("API Restful com Documentação para atividade pratica modulo 6")
	              .description("Exemplo de API Restful utilizando Springdoc para documentação.")
	              .version("1.0.89")
	              .license(new License().name("Apache 2.0").url("http://springdoc.org")))
	              .externalDocs(new ExternalDocumentation()
	              .description("Link do Repositório da Aplicação")
	              .url("https://github.com/awsmgui/modulo6atividade"));
	  }
}
