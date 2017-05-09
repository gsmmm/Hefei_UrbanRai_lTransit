package com.action;

import com.entities.TbManager;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import com.services.TbManagerService;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.RequestAware;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import java.util.Map;

import static com.opensymphony.xwork2.Action.SUCCESS;

/**
 * Created by 看什么看没见过屏幕啊 on 2017/4/6.
 */
public class TbManagerAction extends ActionSupport implements RequestAware, ModelDriven<TbManager>, Preparable{

    private TbManagerService tbManagerService;
    private TbManager model;
    private Map<String, Object> request;
    private Integer id;
    private String channel;

    @Override
    public TbManager getModel() {
        return model;
    }

    @Override
    public void prepare() throws Exception {

    }

    @Override
    public void setRequest(Map<String, Object> map) {
        this.request = map;
    }

    public void setTbManagerService(TbManagerService tbManagerService) {
        this.tbManagerService = tbManagerService;
    }

    public String list(){
        request.put("manager", tbManagerService.getAll());
        return "list";
    }

    public String save(){
        tbManagerService.save(model);
        return SUCCESS;
    }

    public void prepareSave(){
        model = new TbManager();

        model.setTheOrder(1);
        model.setTheLever(2);
        model.setChildNum(0);
        model.setIsLeaf(true);
        model.setDelFlag(false);

        HttpServletRequest servletRequest = ServletActionContext.getRequest();
        String parent = (String)servletRequest.getParameter("parent");
        String[] comp = {"公司新闻", "公告信息", "技术中心", "采购需求"};
        int parentInd = 0;
        while(!parent.equals(comp[parentInd])){
            ++parentInd;
        }
        ++parentInd;
        model.setParentInd(parentInd);

    }

    public void setId(Integer id){
        this.id = id;
    }

    public String delete(){
        tbManagerService.delete(id);
        return SUCCESS;
    }

    public void setChannel(String channel){
        this.channel = channel;
    }

    public String update(){
        tbManagerService.update(model, channel);
        return SUCCESS;
    }

    public void prepareUpdate(){
        model = tbManagerService.get(id);
    }

    public void prepareInput(){
        if(id != null){
            model = tbManagerService.get(id);
        }
    }
}
