package org.example.Model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TreinadorRepositoryTest {

    private TreinadorRepository treinadorRepository;

    @BeforeEach
    void setUp() {

        treinadorRepository =TreinadorRepository.getInstance();
    }

    @Test
    void getInstanceTeste() {
        assertNotNull(TreinadorRepository.getInstance());

    }

    @Test
    void getTreinadorArrayTeste() {

        assertNotNull(treinadorRepository.getTreinadorArray());
    }
}