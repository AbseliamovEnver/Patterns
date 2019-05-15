package ua.enver.structural.decorator.developer;

/**
 * @author Enver on 13.05.2019 17:17.
 * @project patterns
 */
public class JavaSeniorDeveloper extends DeveloperDecorator{

    public JavaSeniorDeveloper(Developer developer) {
        super(developer);
    }

    public String makeCodeReview(){
        return " Make code review.";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + makeCodeReview();
    }
}
