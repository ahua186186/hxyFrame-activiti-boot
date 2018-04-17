package com.hxy.modules.activiti.task;

 

import com.hxy.modules.activiti.entity.ExtendActTasklogEntity;
import com.hxy.modules.common.utils.Utils;
import org.activiti.engine.delegate.DelegateExecution;

import org.activiti.engine.delegate.Expression;

import org.activiti.engine.delegate.JavaDelegate;

import java.util.Map;


public class ServiceTask implements JavaDelegate{

//流程变量

private Expression text1;

 

//重写委托的提交方法

@Override

public void execute(DelegateExecution execution) throws Exception {

    System.out.println("serviceTask已经执行已经执行！");

    String value1 = (String) text1.getValue(execution);

    System.out.println(value1);
    Map<String,Object> variables =  execution.getVariables();


    execution.setVariable("var1", new StringBuffer(value1).reverse().toString());
    execution.setVariable("busInfo", variables.get("busInfo"));

    //记录任务日志
   /* ExtendActTasklogEntity tasklogEntity = new ExtendActTasklogEntity();
    tasklogEntity.setId(Utils.uuid());
    tasklogEntity.setBusId(processTaskDto.getBusId());
    tasklogEntity.setDefId(processTaskDto.getDefId());
    tasklogEntity.setInstanceId(processTaskDto.getInstanceId());
    tasklogEntity.setTaskId(task.getId());
    tasklogEntity.setTaskName(task.getName());
    tasklogEntity.setAdvanceId(processTaskDto.getNextUserIds());
    tasklogEntity.setCreateTime(task.getCreateTime());
    tasklogService.save(tasklogEntity);*/
}

 

}