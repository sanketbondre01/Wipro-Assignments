package com.surya.example.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import com.surya.example.entities.User;
import com.surya.example.repositories.UserRepository;
 
@ExtendWith(MockitoExtension.class)
class UserServiceImplTest
{
	@Mock
	private UserRepository userRepository;
 
    @InjectMocks
    private UserServiceImpl userServiceImpl;
    
    
    @DisplayName(" we were testing saveUserTest in service layer ")
    @Test
    void saveUserTest()
    {
    	  //our own user Object
    	//controller to service
	      User user=new User(null,"RamaKrishna");
	      //our own user Object
	      
	      //returning from repos to service
	      User saveUser=new User("RamaKrishna","RamaKrishna@gmail.com");
	      
	      Mockito.when(userRepository.save(user)).thenReturn(saveUser);
	      
	      
	     User finalResult= userServiceImpl.save(saveUser);
	     // condtion 1
	       Assertions.assertEquals(72L, finalResult.getId());
	       // condtion 1
	       Assertions.assertEquals("RamaKrishna", finalResult.getName());
	       // condtion 1
	       Assertions.assertEquals("RamaKrishna@gmail.com", finalResult.getEmail());
    }
 
}