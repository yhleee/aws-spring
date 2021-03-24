package com.yhlee.demo.springboot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration
@EnableJpaAuditing  // 입력시간, 수정시간, 생성자, 수정자 등을 Audit 할 수 있도록 설정한다. (Jpa Auditing)
public class JpaConfig {
}
