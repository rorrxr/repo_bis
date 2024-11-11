package com.etergg;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class JoinDto {

    String userNickname;
    int userRank;
    String userMost1;
    String userMost2;
    String userMost3;
    int joinCategory;
    String joinMessage;
    String joinCreateDate;
    int delYn;

    @Override
    public String toString() {
        return "JoinDto{" +
                "userNickname='" + userNickname + '\'' +
                ", userRank='" + userRank + '\'' +
                ", userMost1='" + userMost1 + '\'' +
                ", userMost2='" + userMost2 + '\'' +
                ", userMost3='" + userMost3 + '\'' +
                ", joinCategory='" + joinCategory + '\'' +
                ", joinMessage='" + joinMessage + '\'' +
                '}';
    }
}
