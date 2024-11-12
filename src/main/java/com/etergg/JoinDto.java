package com.etergg;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JoinDto {

    private String userNickname;
    private int userRank;
    private String userMost1;
    private String userMost2;
    private String userMost3;
    private int joinCategory;
    private String joinMessage;
    private String createDate;
    private int delYn;

    @Override
    public String toString() {
        return "JoinDto{" +
                "userNickname='" + userNickname + '\'' +
                ", userRank=" + userRank +
                ", userMost1='" + userMost1 + '\'' +
                ", userMost2='" + userMost2 + '\'' +
                ", userMost3='" + userMost3 + '\'' +
                ", joinCategory=" + joinCategory +
                ", joinMessage='" + joinMessage + '\'' +
                ", createDate='" + createDate + '\'' +
                ", delYn=" + delYn +
                '}';
    }
}
