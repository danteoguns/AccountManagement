package accountmanagement;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

	 @RequestMapping("/add-accounts")
		public String home()
	    {
	        return "Hello";
	       
	    }
	 
}
