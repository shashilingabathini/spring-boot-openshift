package com.nofearcode.k8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpRequest;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
public class K8MinikubeDeploymentApplication {

	public static void main(String[] args) {
		SpringApplication.run(K8MinikubeDeploymentApplication.class, args);
	}

	@RestController
	public class Controller {

		@RequestMapping( path = "/k8/api/hello" , method = RequestMethod.GET , produces = MediaType.TEXT_HTML_VALUE)
		public String getHello() {
			System.out.println("End Point is invoked");
			return "<h1>Hello world !</h1>";
		}
	}

}
