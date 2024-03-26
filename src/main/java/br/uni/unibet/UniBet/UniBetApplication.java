package br.uni.unibet.UniBet;

import br.uni.unibet.UniBet.model.Time;
import br.uni.unibet.UniBet.model.Usuario;
import br.uni.unibet.UniBet.model.dao.TimeDAO;
import br.uni.unibet.UniBet.model.dao.UsuarioDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //(exclude={DataSourceAutoConfiguration.class})
public class UniBetApplication  implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(UniBetApplication.class, args);
	}
	@Autowired
	TimeDAO dTime;
	@Autowired
	UsuarioDAO dUser;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("###### iniciando carregamento dos dados");

		Time time = new Time(1, "São Paulo FC",null,null);
		Time time1 = new Time(2, "Flamengo",null,null);
		dTime.save(time);
		dTime.save(time1);

		Usuario u = new Usuario(1,"Zezin da Silva",
				"ze","123","ze@ze",0,true,null);
		Usuario u1 = new Usuario(2,"Pedrin Gui",
				"pe","123","pe@pe",10000,false,null);
		dUser.save(u);
		dUser.save(u1);




	}


}
