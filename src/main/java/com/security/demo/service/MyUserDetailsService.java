//package com.security.demo.service;
//
//import com.security.demo.entity.Privilege;
//import com.security.demo.entity.Role;
//import com.security.demo.entity.UserAccount;
//import com.security.demo.repository.RoleRepository;
//import com.security.demo.repository.UserAccountRepository;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collection;
//import java.util.List;
//import javax.transaction.Transactional;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.MessageSource;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
///**
// *
// * @author 歐炫
// */
//@Service("userDetailsService")
//@Transactional
//public class MyUserDetailsService implements UserDetailsService {
// 
//    @Autowired
//    private UserAccountRepository userAccountRepository;
//  
//    @Autowired
//    private IUserService service;
//  
//    @Autowired
//    private MessageSource messages;
//  
//    @Autowired
//    private RoleRepository roleRepository;
// 
//    @Override
//    public UserDetails loadUserByUsername(String email)
//      throws UsernameNotFoundException {
//  
//        UserAccount userAccount = userAccountRepository.findByEmail(email);
//        if (userAccount == null) {
//            return new org.springframework.security.core.userdetails.User(
//              " ", " ", true, true, true, true, 
//              getAuthorities(Arrays.asList(
//                roleRepository.findByName("ROLE_USER"))));
//        }
// 
//        return new org.springframework.security.core.userdetails.User(
//          userAccount.getEmail(), userAccount.getShadow(), userAccount.isEnabled(), true, true, 
//          true, getAuthorities(userAccount.getRoleCollection()));
//    }
// 
//    private Collection<? extends GrantedAuthority> getAuthorities(
//      Collection<Role> roles) {
//  
//        return getGrantedAuthorities(getPrivileges(roles));
//    }
// 
//    private List<String> getPrivileges(Collection<Role> roles) {
//  
//        List<String> privileges = new ArrayList<>();
//        List<Privilege> collection = new ArrayList<>();
//        for (Role role : roles) {
//            collection.addAll(role.getPrivilegesCollection());
//        }
//        for (Privilege item : collection) {
//            privileges.add(item.getName());
//        }
//        return privileges;
//    }
// 
//    private List<GrantedAuthority> getGrantedAuthorities(List<String> privileges) {
//        List<GrantedAuthority> authorities = new ArrayList<>();
//        for (String privilege : privileges) {
//            authorities.add(new SimpleGrantedAuthority(privilege));
//        }
//        return authorities;
//    }
//}