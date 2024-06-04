package org.example.Model;

import org.example.Domain.Competition;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CompetitionsRepositoryTest {


    private CompetitionsRepository competitionsRepository;
    private CompetitionsRepository competitionsRepository2;
    @BeforeEach
    void setUp() throws FileNotFoundException {

        competitionsRepository = CompetitionsRepository.getInstance();
        competitionsRepository2 = CompetitionsRepository.getInstance();


    }

    @Test
    void VerificarConstrutorTeste() {

        assertEquals(competitionsRepository , competitionsRepository2 );
    }
    @Test
    void getCompetitionsArray() {

        ArrayList<Competition> competitionsArray = new ArrayList<Competition>();
        assertTrue(competitionsArray instanceof  ArrayList<Competition>  );
    }
}