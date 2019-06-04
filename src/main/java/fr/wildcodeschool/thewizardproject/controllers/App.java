package fr.wildcodeschool.thewizardproject.controllers;

import fr.wildcodeschool.thewizardproject.models.WizardInterface;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public void start() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");
        WizardInterface myGand = context.getBean("theGand", WizardInterface.class);
        WizardInterface myDumb = context.getBean("theDumb", WizardInterface.class);
        context.close();
        System.out.println(myGand.changeDress());
        System.out.println(myGand.giveAdvice());

        System.out.println(myDumb.changeDress());
        System.out.println(myDumb.giveAdvice());


    }
}
