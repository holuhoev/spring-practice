package ru.holuhoev.spring_practice.context.contextSamples;


import javax.annotation.PostConstruct;

/**
 * этот класс проверяет работу DI в Spring
 */

@ShowInfo
public class SampleObject {
    private static int count = 0;
    private int id = count++;
    private SampleObject dependency;
    private String initInfo;

    {
        System.out.println("Sample object: " + id);
    }

    public SampleObject() {
        initInfo = "Default constructor";
        System.out.println(initInfo);
    }
    public SampleObject(SampleObject dependency) {
        initInfo = "Dependency injection, constructor";
        this.dependency = dependency;
        System.out.println(initInfo);
    }

//    public void setDependency(SampleObject dependency) {
//        initInfo = "Dependency injection, setter";
//        this.dependency = dependency;
//        System.out.println(initInfo);
//    }

    @PostConstruct
    public void inti() {
        System.out.println("Init method: " + id + ", " + initInfo);
    }

    @PostProxy
    public void postProxy() {
        System.out.println("Post construct: " + id + ", " + initInfo);
    }
}