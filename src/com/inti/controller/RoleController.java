package com.inti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.inti.entities.Role;
import com.inti.service.interfaces.IRoleService;

@CrossOrigin("*")
@RestController
public class RoleController {
	@Autowired
	IRoleService roleService;
	
	@RequestMapping(value="roles", method = RequestMethod.GET)
	public List<Role> findAll(){
		return roleService.findAll(Role.class);
	}
	@RequestMapping(value="roles/{idRole}", method = RequestMethod.GET)
	public Role findOne(@PathVariable("idRole") Long idRole) {
		return roleService.findOne(Role.class, idRole);
	}
	@RequestMapping(value="roles", method = RequestMethod.POST)
	public void saveRole(@RequestBody Role role) {
		roleService.save(role);
	}
	@RequestMapping(value="roles/{idRole}", method = RequestMethod.DELETE)
	public void deleteRole(@PathVariable("idRole") Long idRole) {
		Role r = roleService.findOne(Role.class, idRole);
		roleService.remove(r);
	} 
	@RequestMapping(value="roles/{idRole}", method= RequestMethod.PUT)
	public void updateRole(@PathVariable("idRole") Long idRole,@RequestBody Role role) {
		Role currentRole = roleService.findOne(Role.class, idRole);
		currentRole.setLibelle(role.getLibelle());
		roleService.update(currentRole);	
	}
}
