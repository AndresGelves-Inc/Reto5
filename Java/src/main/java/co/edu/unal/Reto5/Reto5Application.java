package co.edu.unal.Reto5;



import co.edu.unal.Reto5.vista.RedflixForm;
import co.edu.unal.Reto5.repositorios.RepositorioPelicula;
import co.edu.unal.Reto5.repositorios.RepositorioSerie;
import co.edu.unal.Reto5.repositorios.RepositorioUsuario;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.beans.factory.annotation.Autowired;


//@SpringBootApplication(scanBasePackageClasses = RepositorioContenidos.class)
@SpringBootApplication
@ComponentScan("co.edu.unal.Reto5")
public class Reto5Application {

	public static void main(String[] args) {
		//SpringApplication.run(Reto5Application.class, args);
                new RedflixForm().setVisible(true);
	}
        
         public static ConfigurableApplicationContext runSpringServer(String[] args) {
            /*
            ConfigurableApplicationContext ctx = new SpringApplicationBuilder(Application.class)
                    .headless(false).run(args);
            */
          
           return  SpringApplication.run(Reto5Application.class, args);
             
        }
         
     @Bean
    ApplicationRunner applicationRunner( RepositorioPelicula repositorioPelicula, RepositorioSerie repositorioSerie, RepositorioUsuario repositorioUsuario ) {
        return (ApplicationArguments args) -> {

            final Log logger = LogFactory.getLog(getClass());           
           
            logger.info("Serie: " + repositorioSerie.findAll());
            logger.info("Pelicula: " + repositorioPelicula.findAll());                 
            logger.info("Usuario: " + repositorioUsuario.findAll());
        };
    }
}
