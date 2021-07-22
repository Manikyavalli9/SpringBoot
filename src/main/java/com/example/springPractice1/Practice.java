package com.example.springPractice1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component //it will make it as bean
// @Scope(value = "prototype") //it wont create default value i.e. no singleton
public class Practice {
    private int pid;
    private String pname;
    @Autowired //it will connect practice class obj to laptop class object
    private Laptop laptop;

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public Practice() {
        System.out.println("object is created........");
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    private String tech;

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;

    }
    public  void show(){
        System.out.println("show me");
        laptop.compiler();
    }
}
