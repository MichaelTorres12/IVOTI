package com.project.ivoti.Controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String index() {
        return "index";
    }

    //Rutas del sistema de verificacion
    @GetMapping("/urna")
    public String urna() {
        return "Verificacion/duiVerificacionView";
    }


    //Rutas del sistema de votacion
    @GetMapping("/votaciones")
    public String votaciones() {
        return "Voto/duiIngresoView";
    }


    //Rutas del sistema de estadísticas
    @GetMapping("/estadisticas")
    public String estadistica(){
        return "Estadistica/estadisticaView";
    }
}

