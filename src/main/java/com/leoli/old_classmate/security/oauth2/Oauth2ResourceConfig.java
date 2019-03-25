package com.leoli.old_classmate.security.oauth2;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.data.redis.connection.RedisConnectionFactory;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
//import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
//import org.springframework.security.oauth2.provider.token.TokenStore;
//import org.springframework.security.oauth2.provider.token.store.redis.RedisTokenStore;

//oauth2的资源认证移到网关验证了，所以把这部分注释掉
//@Configuration
//@EnableResourceServer
public class Oauth2ResourceConfig {
//        extends ResourceServerConfigurerAdapter {
//
//
//    @Autowired
//    private RedisConnectionFactory connectionFactory;
//
//    @Bean
//    public TokenStore tokenStore() {
//        return new RedisTokenStore(connectionFactory);
//    }
//
//    @Override
//    public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
//        resources
//                .tokenStore(tokenStore())
//                .resourceId("resourceId"); //OAuth2AuthenticationManager里验证，可以在认证服务器配置ClientDetailsServiceConfigurer里添加resourceid
//    }
//
//
//    @Override
//    public void configure(HttpSecurity http) throws Exception {
//
//        http.authorizeRequests()
////                .antMatchers("/oauth/token")
////                .permitAll()
//                .and()
//                .authorizeRequests().anyRequest().authenticated();
//
//    }
}
