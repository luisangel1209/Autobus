package com.Autobus.TIS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import Conexion.ConexionBD;

@SpringBootApplication
@ComponentScan({"com.Autobus.TIS", "com.Autobus.TIS.REST"})
public class TisApplication {

	public static void main(String[] args) {
		SpringApplication.run(TisApplication.class, args);
	}

}
