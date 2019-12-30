package com.solarshopee.product.config;

import com.coxautodev.graphql.tools.SchemaParser;
import com.solarshopee.product.resolvers.Query;
import com.solarshopee.product.service.ProductService;
import graphql.schema.GraphQLSchema;
import graphql.servlet.SimpleGraphQLHttpServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GraphQLConfig {
	@Autowired
	private ProductService productService;

    @Bean
	public ServletRegistrationBean graphQLServlet() {
		return new ServletRegistrationBean(SimpleGraphQLHttpServlet.newBuilder(buildSchema(productService)).build(),"/graphql");
	}

	private static GraphQLSchema buildSchema(ProductService productService) {
		return SchemaParser
				.newParser()
				.file("graphql/schema.graphqls")
//                .dictionary()
				.resolvers(new Query(productService))
				.build()
				.makeExecutableSchema();
	}
}
