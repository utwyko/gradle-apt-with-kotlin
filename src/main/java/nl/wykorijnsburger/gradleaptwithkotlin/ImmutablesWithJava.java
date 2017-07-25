package nl.wykorijnsburger.gradleaptwithkotlin;


public class ImmutablesWithJava {
    public static void main(String[] args) {
        Person person = ImmutablePerson.builder()
            .name("test")
            .build();
    }
}
