package com.security.demo.controller;

import com.security.demo.entity.Someone;
import com.security.demo.entity.SystemMessage;
import com.security.demo.repository.SomeoneRepository;
//import com.security.demo.repository.SystemMessageRepository;
import java.util.Objects;
import javax.servlet.http.HttpSession;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.dom.DOMSource;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.w3c.dom.Document;

/**
 *
 * @author 李羅
 */
@Controller
@RequestMapping("/")
public class HelloController {

//	@Autowired
//	SystemMessageRepository systemMessageRepository;
	@Autowired
	SomeoneRepository someoneRepository;

	@GetMapping(produces = MediaType.TEXT_PLAIN_VALUE, path = "")
	@ResponseBody
	String index() throws Exception {
		return "home";
	}

	@GetMapping("login.aspx")
	public ModelAndView login() throws Exception {
		Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse("classpath:/skeleton/index.xml");
		ModelAndView modelAndView = new ModelAndView("login");
		modelAndView.getModelMap().addAttribute(new DOMSource(document));
		return modelAndView;
	}

//	@PostMapping(path = "https://www.google.com/recaptcha/api/siteverify", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
//	@ResponseBody
//	String login(@RequestParam String secret, @RequestParam String response, @RequestParam(required = false) String remoteip) {
//		JSONObject jsonObject = new JSONObject();
//
//		if (!Objects.isNull(response)) {
//			jsonObject.put("response", response);
//			jsonObject.put("secret", secret);
//			jsonObject.put("remoteip", remoteip);
//		}
//		return jsonObject.toString();
//	}
}
