package at.${{values.company_name}}.${{values.java_package_name}};

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ${{values.application_name}}Application {

  public static void main(String[] args) {
    SpringApplication.run(${{values.application_name}}Application.class, args);
  }
}
