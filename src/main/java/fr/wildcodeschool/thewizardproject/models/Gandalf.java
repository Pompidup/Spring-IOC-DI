package fr.wildcodeschool.thewizardproject.models;

import org.springframework.stereotype.Component;

@Component("theGand")
public class Gandalf implements WizardInterface {

    @Override
    public String giveAdvice() {
        return "Je suis serviteur du feu secret, détenteur de la flamme d'anor. Le feu sombre ne vous servira à rien, flamme d'udûn. Repartez dans l'ombre.";
    }

    @Override
    public String changeDress() {
        return "The dress was blue";
    }
}
