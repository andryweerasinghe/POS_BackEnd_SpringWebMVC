/*
 * Author  : Mr.electrix
 * Project : CSS_Assignment_06_BackEnd_SpringMVC
 * Date    : 10/10/24

 */

package lk.ijse.aad.css_assignment_06_backend_springmvc.config;

import jakarta.servlet.annotation.MultipartConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages = "lk.ijse.aad.css_assignment_06_backend_springmvc")
@EnableWebMvc
@MultipartConfig
public class WebAppConfig {
}
