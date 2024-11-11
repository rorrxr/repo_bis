package com.etergg;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class JoinDto {

    String userNickname;
    String userRank;
    String userMost1;
    String userMost2;
    String userMost3;
    String joinCategory;
    String joinMessage;
    String joinCreateDate;
    String delYn;

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
