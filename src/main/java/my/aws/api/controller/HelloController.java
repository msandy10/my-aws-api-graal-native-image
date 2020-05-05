package my.aws.api.controller;
import io.micronaut.context.annotation.Value;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/hello") 
public class HelloController {

	 @Value("${micronaut.application.name}") 
	 protected String appname;
	 
	 
    @Get(produces = MediaType.TEXT_PLAIN) 
    public String index() {
        return "Hello World"+appname; 
    }
}