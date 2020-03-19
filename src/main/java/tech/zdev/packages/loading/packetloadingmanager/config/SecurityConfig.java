package tech.zdev.packages.loading.packetloadingmanager.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.filter.DelegatingFilterProxy;
import org.springframework.web.servlet.handler.HandlerMappingIntrospector;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Autowired
	UserDetailsService userDetailsService;
	
	@Override
	public void configure(final WebSecurity web) throws Exception {
		web.ignoring().mvcMatchers("/resources/**", "/static/**", "/css/**", "/js/**", "/webfonts/**");
	}
	
    @Override
    protected void configure(final HttpSecurity http) throws Exception {
        http
          .csrf().disable()
          .authorizeRequests()
          .mvcMatchers("/login"). permitAll()
          .mvcMatchers("/signup").permitAll()
          .mvcMatchers(HttpMethod.GET, "/packages/**").hasAnyAuthority("ADMIN,USER")
          .mvcMatchers(HttpMethod.POST, "/packages/**").hasAuthority("ADMIN")
          .anyRequest().authenticated()
          .and()
          .formLogin()
          .loginPage("/login")
//          .loginProcessingUrl("/perform_login")
          .defaultSuccessUrl("/home")
          .failureUrl("/login?error=true")
          .and()
          .logout()
//          .logoutUrl("/perform_logout")
          .logoutSuccessUrl("/login?logout=true")
          .deleteCookies("JSESSIONID");
//          .logoutSuccessHandler(logoutSuccessHandler());
//          .and().exceptionHandling().accessDeniedPage("/error/403");
    }
    
    @Override
    protected void configure(final AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
    }
     
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
    
    @Bean(name = "mvcHandlerMappingIntrospector")
	public HandlerMappingIntrospector mvcHandlerMappingIntrospector() {
		return new HandlerMappingIntrospector();
	}

}
