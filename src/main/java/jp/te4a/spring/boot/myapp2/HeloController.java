package jp.te4a.spring.boot.myapp2;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
public class HeloController 
{
	@RequestMapping("/taro")
	public String TARO() {
		return "TARO desu!";
	}
}
