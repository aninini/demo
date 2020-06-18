package com.example.demo.inspection;

import com.example.demo.DemoApplication;
import com.example.demo.inspection.abstraction.InspectionSolver;
import com.example.demo.inspection.chooser.InspectionSolverChooser;
import com.example.demo.inspection.defines.InspectionConstant;
import javafx.application.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes= DemoApplication.class)
public class test {
    @Resource
    private InspectionSolverChooser chooser;

    @Test
    public void test() throws Exception{
        //准备数据
        String taskType = InspectionConstant.INSPECTION_TASK_TYPE_BATCH_CHANGE_WAREHOUSE;
        Long orderId = 12345L;
        Long userId = 123L;
        //获取任务类型对应的solver
        InspectionSolver solver = chooser.choose(taskType);
        if (solver == null) {
            throw new RuntimeException("任务类型暂时无法处理!");
        }
        //调用不同solver的方法进行处理
        solver.solve(orderId,userId);
    }
}
