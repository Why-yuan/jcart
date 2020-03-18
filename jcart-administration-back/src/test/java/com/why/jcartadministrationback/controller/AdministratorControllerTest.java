package com.why.jcartadministrationback.controller;

import com.why.jcartadministrationback.constant.ClientExceptionConstant;
import com.why.jcartadministrationback.dto.in.AdministratorLoginInDTO;
import com.why.jcartadministrationback.dto.out.AdministratorLoginOutDTO;
import com.why.jcartadministrationback.exception.ClientException;
import com.why.jcartadministrationback.po.Administrator;
import com.why.jcartadministrationback.service.AdministratorService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@SpringBootTest
class AdministratorControllerTest {

    @Autowired
    private AdministratorController administratorController;

    @MockBean
    private AdministratorService administratorService;

    @Test
    void loginSuccess() throws ClientException {
        AdministratorLoginInDTO administratorLoginInDTO = new AdministratorLoginInDTO();
        administratorLoginInDTO.setUsername("admin");
        administratorLoginInDTO.setPassword("123456");
        Administrator mockAdministrator = new Administrator();
        mockAdministrator.setUsername("admin");
        mockAdministrator.setEncryptedPassword("$2a$12$LCQseGaU5sCdBFX98Kid.OkOvcnUYYswQrbU732Y8kN.UbWDiEua.");
        when(administratorService.getByUsername("admin")).thenReturn(mockAdministrator);
        AdministratorLoginOutDTO loginOutDTO = administratorController.login(administratorLoginInDTO);
        assertNotNull(loginOutDTO);

    }

    @Test
    void loginWrongUsername(){
        AdministratorLoginInDTO administratorLoginInDTO = new AdministratorLoginInDTO();
        administratorLoginInDTO.setUsername("admin110");
        administratorLoginInDTO.setPassword("123456");
        try {
            AdministratorLoginOutDTO loginOutDTO = administratorController.login(administratorLoginInDTO);
        }catch (ClientException ex){
            String errCode = ex.getErrCode();
            assertEquals(ClientExceptionConstant.ADMINISTRATOR_USERNAME_NOT_EXIST_ERRCODE, errCode);
        }
    }

    @Test
    void loginWrongPassword(){
        AdministratorLoginInDTO administratorLoginInDTO = new AdministratorLoginInDTO();
        administratorLoginInDTO.setUsername("admin");
        administratorLoginInDTO.setPassword("abcdef");
        try {
            AdministratorLoginOutDTO loginOutDTO = administratorController.login(administratorLoginInDTO);
        }catch (ClientException ex){
            String errCode = ex.getErrCode();
            assertEquals(ClientExceptionConstant.ADMINISTRATOR_PASSWORD_INVALID_ERRCODE, errCode);
        }
    }
}