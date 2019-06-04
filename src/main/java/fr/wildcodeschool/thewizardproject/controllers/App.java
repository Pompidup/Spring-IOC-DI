package fr.wildcodeschool.thewizardproject.controllers;

import fr.wildcodeschool.thewizardproject.models.WizardInterface;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public void start() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");
        WizardInterface myWiz = context.getBean("gandalf", WizardInterface.class);
        context.close();
        System.out.println(myWiz.changeDress());
        System.out.println(myWiz.giveAdvice());


    }
}
