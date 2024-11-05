package com.etergg;


import java.util.*;

public interface JoinDao {
    public List<JoinDto> join(JoinDto dto);
    public List<JoinDto> user(JoinDto dto);
}
