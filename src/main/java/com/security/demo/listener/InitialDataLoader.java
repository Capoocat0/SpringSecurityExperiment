//package com.security.demo.listener;
//
//import com.security.demo.entity.Privilege;
//import com.security.demo.entity.Role;
//import com.security.demo.entity.UserAccount;
//import com.security.demo.repository.PrivilegeRepository;
//import com.security.demo.repository.RoleRepository;
//import com.security.demo.repository.UserAccountRepository;
//import java.util.Arrays;
//import java.util.Collection;
//import java.util.List;
//import javax.transaction.Transactional;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.ApplicationListener;
//import org.springframework.context.event.ContextRefreshedEvent;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Component;
//
///**
// *
// * @author 歐炫
// */
//@Component
//public class InitialDataLoader implements
//	ApplicationListener<ContextRefreshedEvent> {
//
//	boolean alreadySetup = false;
//
//	@Autowired
//	private UserAccountRepository userAccountRepository;
//
//	@Autowired
//	private RoleRepository roleRepository;
//
//	@Autowired
//	private PrivilegeRepository privilegeRepository;
//
//	@Autowired
//	private PasswordEncoder passwordEncoder;
//
//	@Override
//	@Transactional
//	public void onApplicationEvent(ContextRefreshedEvent event) {
//
//		if (alreadySetup) {
//			return;
//		}
//		Privilege readPrivilege
//			= createPrivilegeIfNotFound("READ_PRIVILEGE");
//		Privilege writePrivilege
//			= createPrivilegeIfNotFound("WRITE_PRIVILEGE");
//
//		List<Privilege> adminPrivileges = Arrays.asList(
//			readPrivilege, writePrivilege);
//		createRoleIfNotFound("ROLE_ADMIN", adminPrivileges);
//		createRoleIfNotFound("ROLE_USER", Arrays.asList(readPrivilege));
//
//		Role adminRole = roleRepository.findByName("ROLE_ADMIN");
//		UserAccount userAccount = new UserAccount();
//		userAccount.setFullname("Test");
//		userAccount.setShadow(passwordEncoder.encode("test"));
//		userAccount.setEmail("test@test.com");
//		userAccount.setRoleCollection(Arrays.asList(adminRole));
//		userAccount.setEnabled(true);
//		userAccountRepository.save(userAccount);
//
//		alreadySetup = true;
//	}
//
//	@Transactional
//	private Privilege createPrivilegeIfNotFound(String name) {
//
//		Privilege privilege = privilegeRepository.findByName(name);
//		if (privilege == null) {
//			privilege = new Privilege(name);
//			privilegeRepository.save(privilege);
//		}
//		return privilege;
//	}
//
//	@Transactional
//	private Role createRoleIfNotFound(
//		String name, Collection<Privilege> privileges) {
//
//		Role role = roleRepository.findByName(name);
//		if (role == null) {
//			role = new Role(name);
//			role.setPrivilegesCollection(privileges);
//			roleRepository.save(role);
//		}
//		return role;
//	}
//}
