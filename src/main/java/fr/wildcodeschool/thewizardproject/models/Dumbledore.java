package fr.wildcodeschool.thewizardproject.models;

public class Dumbledore implements WizardInterface{

    private Outfit outfit;

    public Dumbledore(Outfit theOutfit) {
        outfit = theOutfit;
    }

    @Override
    public String giveAdvice() {
        return "Ce sont nos choix, Harry, qui montrent ce que nous sommes vraiment, beaucoup plus que nos aptitudes.";
    }

    @Override
    public String changeDress() {
        return this.outfit.dress();
    }
}
