package org.example.Model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdminRepositoryTest {

    private AdminRepository adminRepository;

    @BeforeEach
    void setUp() {
        adminRepository= AdminRepository.getInstance();
    }

    @Test
    void getInstanceTeste() {
        assertNotNull(AdminRepository.getInstance());// falhou não foi efectuada a funcao

    }

    @Test
    void getListAdminTest() {// falhou não foi efectuada a funcao

        assertNotNull(adminRepository.getListAdm());
    }
}