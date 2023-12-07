
package com.rohan.maintanencemanagementsystem.entity;

import jakarta.persistence.*;

import java.text.SimpleDateFormat;
import java.util.Date;
//import javax.persistence;

@Entity
@Table(name = "Tenent")
public class Tenent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "username" , nullable = false)
    private String userName;
    @Column(name = "apt" , nullable = false)
    private Long aptNum;
    @Column(name = "area" , nullable = false)
    private  String Area;
    @Column(name = "problem" , nullable = false)
    private String Problem;
    @Column(name = "datetime" )
    private String DateTime;
    @Column(name = "status" , nullable = false)
    private String Status;

    public Tenent(){

    }
    public Tenent(String userName, Long aptNum, String area, String problem, String dateTime, String status) {
        super();

        this.userName = userName;
        this.aptNum = aptNum;
        this.Area = area;
        this.Problem = problem;
        this.DateTime = dateTime;
        this.Status = status;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    public Long getAptNum() {
        return aptNum;
    }

    public void setAptNum(Long aptNum) {
        this.aptNum = aptNum;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String area) {
        Area = area;
    }

    public String getProblem() {
        return Problem;
    }

    public void setProblem(String problem) {
        Problem = problem;
    }

    public String getDateTime() {
        return DateTime;
    }

    public void setDateTime(String dateTime)
    {
        //DateTime = dateTime;
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date=new Date();
        String DT = sdf.format(date) ;
        DateTime = DT;

    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }


}
