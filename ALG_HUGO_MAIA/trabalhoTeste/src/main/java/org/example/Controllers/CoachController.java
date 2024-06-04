package org.example.Controllers;

import org.example.Domain.Competition;
import org.example.Model.CompetitionsRepository;

import java.io.FileNotFoundException;

public class CoachController {
    private CompetitionsRepository competitionsRepository;

    public CoachController() throws FileNotFoundException {
        this.competitionsRepository = CompetitionsRepository.getInstance();
    }


    public boolean competitionsByYear(int year) {
        boolean found = false;

        for (Competition competition : competitionsRepository.getCompetitionsArray()) {
            String competitionYear = competition.getDate().substring(6, 10);


            if (competitionYear.equals(Integer.toString(year))) {
                competition.showDetails();
                found = true;

            }
        }

        if (!found) {
            System.out.println("No competitions found for the year " + year);
            found = false;

        }
        return found;
    }


    public String rankingAtaqueDefesa() {
        return null;
    }


    public String melhorDefesa()  {

        return null;
    }

    public String melhorAtaque()  {
        return null;
    }




}