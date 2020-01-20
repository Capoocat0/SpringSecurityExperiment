///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.security.demo;
//
//import java.util.HashSet;
//import java.util.Set;
//import org.springframework.security.authentication.AuthenticationProvider;
//import org.springframework.security.authentication.BadCredentialsException;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.AuthenticationException;
//import org.springframework.security.web.authentication.WebAuthenticationDetails;
//import org.springframework.stereotype.Component;
//
///**
// *
// * @author user
// */
//@Component
//public class CustomIpAuthenticationProvider implements AuthenticationProvider {
//
//	Set<String> whitelist = new HashSet<String>();
//
//	public CustomIpAuthenticationProvider() {
//		whitelist.add("11.11.11.11");
//		whitelist.add("172.17.128.23");
//		whitelist.add("255.255.255.0");
//		whitelist.add("172.17.128.254");
//		whitelist.add("60.249.175.145");
//	}
//
//	@Override
//	public Authentication authenticate(Authentication auth) throws AuthenticationException {
//		WebAuthenticationDetails details = (WebAuthenticationDetails) auth.getDetails();
//		String userIp = details.getRemoteAddress(); //獲取用戶的IP地址
//		if (!whitelist.contains(userIp)) {
//			throw new BadCredentialsException("Invalid IP Address");
//		}
//		//...
//		return null;
//	}
//
//	@Override
//	public boolean supports(Class<?> type) {
//		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//	}
//}
