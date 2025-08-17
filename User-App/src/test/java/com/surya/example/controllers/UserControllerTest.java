package com.surya.example.controllers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import com.surya.example.entities.User;
import com.surya.example.services.UserService;


@WebMvcTest
//Loads only the given class (UserController) into the Spring test context.
@ContextConfiguration(classes = {UserController.class}) // Only load the controller
@Import(org.springframework.boot.autoconfigure.validation.ValidationAutoConfiguration.class)
class UserControllerTest {
	
	@Autowired 
	private MockMvc mockMvc; //for fake http request use mockmvc
	
	@MockitoBean //create fake obj for service
	private UserService userservice;
	
	@Test
	@DisplayName("addNewUserTesting")
    void addUserTest() throws Exception
    {
   	      User user=new User("RamaKrishna","RamaKrishna@gmail.com");
   	
      	 Mockito.when(userservice.save(Mockito.any())).thenReturn(user);
   	
   	
   	    mockMvc.perform(
   			   post("/addNewUser")
   			   .contentType("application/json")
   			   .content("""
                     {
                         "name":"RamaKrishna",
                          "email":"RamaKrishna@gmail.com"
                     }
                     
   			   		"""))
   	    .andExpect(status().isOk())
   	    .andExpect(jsonPath("$.name").value("RamaKrishna"));

    }

}
