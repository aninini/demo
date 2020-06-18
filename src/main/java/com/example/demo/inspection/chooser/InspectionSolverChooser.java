package com.example.demo.inspection.chooser;

import com.example.demo.inspection.abstraction.InspectionSolver;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

//创建选择器
@Component
public class InspectionSolverChooser implements ApplicationContextAware {


    private Map<String, InspectionSolver> chooseMap = new HashMap<>();

    public InspectionSolver choose(String type) {
        return chooseMap.get(type);
    }

    @PostConstruct
    public void register() {
        Map<String, InspectionSolver> solverMap = context.getBeansOfType(InspectionSolver.class);
        for (InspectionSolver solver : solverMap.values()) {
            for (String support : solver.supports()) {
                chooseMap.put(support,solver);
            }
        }
    }

    private ApplicationContext context;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("===========================");
        this.context=applicationContext;
    }
}
