package fr.wildcodeschool.thewizardproject.models;

import org.springframework.stereotype.Component;

@Component("theDumb")
public class Dumbledore implements WizardInterface{

    @Override
    public String giveAdvice() {
        return "Ce sont nos choix, Harry, qui montrent ce que nous sommes vraiment, beaucoup plus que nos aptitudes.";
    }

    @Override
    public String changeDress() {
        return "The dress was grey";
    }
}
