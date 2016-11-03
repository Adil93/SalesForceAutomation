package sfa.view;

import java.io.Serializable;

import oracle.adf.controller.TaskFlowId;

public class DynamicRegion implements Serializable {
    private String contactTaskFlowId = "/WEB-INF/ContactEditFlow.xml#ContactEditFlow";
    private String  accountTaskFlowId ="/WEB-INF/ContactEditFlow.xml#ContactEditFlow";
    
    private String currentTF ="HOME";
    public DynamicRegion() {
    }

    public TaskFlowId getDynamicTaskFlowId() {
        if(this.getCurrentTF().equalsIgnoreCase("CONTACTS"))
            return TaskFlowId.parse(contactTaskFlowId);
        else if(this.getCurrentTF().equalsIgnoreCase("ACCOUNTS"))
            return TaskFlowId.parse(accountTaskFlowId);
        else
        return TaskFlowId.parse(accountTaskFlowId);
    }

   

    public void setCurrentTF(String currentTF) {
        this.currentTF = currentTF;
    }

    public String getCurrentTF() {
        return currentTF;
    }
}
