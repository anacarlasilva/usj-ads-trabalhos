package br.edu.usj.ads.lpii.helloworldhtml;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class HelloWorldHtml {

    @GetMapping(value= "/hello")
    public ModelAndView getHelloWorldHtml() {
        ModelAndView modelAndView = new ModelAndView ("HelloWorld") ;
        
        return modelAndView;
    }
    

    
}
