package com.GestioneDispositivi3.Runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.GestioneDispositivi3.Repository.DispositivoRepository;
@Component
public class DispositivoRunner implements ApplicationRunner {

	@Autowired DispositivoRepository drepo;
	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub

	}

}
