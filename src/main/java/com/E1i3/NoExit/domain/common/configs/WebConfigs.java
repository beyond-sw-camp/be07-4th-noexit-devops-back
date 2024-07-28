package com.E1i3.NoExit.domain.common.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class WebConfigs {

	@Bean
	public PasswordEncoder makePassword(){
		return PasswordEncoderFactories.createDelegatingPasswordEncoder();
	}
}
