package com.example.demo.inspection.abstraction;

//创建抽象业务处理器
public abstract class InspectionSolver {

    public abstract void solve(Long orderId, Long userId);

    public abstract String[] supports();
}