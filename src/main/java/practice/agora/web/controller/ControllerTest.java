package practice.agora.web.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Stream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerTest {
	
	Logger log = LoggerFactory.getLogger(getClass());
	
	@RequestMapping(method = RequestMethod.GET, value = "/test")
	public Object getMethod(String object) {
		log.debug("실행완료");
		Stream<String> asdf = Arrays.stream(new String[] {"asdfasf","asdfsafd"});
		return object;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/test/{baby}")
	public Object getTestFestival(@PathVariable String baby) {
		log.debug("실행완료 : {}", baby);
		
		ArrayList<String> test = new ArrayList<String>();
		
		return baby;
	}
}
