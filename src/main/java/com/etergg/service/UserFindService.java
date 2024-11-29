package com.etergg.service;

import com.etergg.dto.UserJoinRequestDto;
import com.etergg.dto.UserJoinResponseDto;
import com.etergg.entity.User;
import com.etergg.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class UserFindService {

    private final UserRepository userRepository;

    /**
     * 게시글 수정
     */

    @Transactional
    public UserJoinResponseDto update(Long id, UserJoinRequestDto requestDto) {
        // 게시글을 ID로 찾아서 수정
        User userJoin = userRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 게시글이 존재하지 않습니다."));

        // 게시글 수정
        userJoin.update(requestDto);

        // 수정된 게시글 저장
//        marketRepository.save(market);

        return new UserJoinResponseDto(userJoin);
    }

    @Transactional
    // 게시글 삭제
    public String delete(Long id) {
        // 게시글을 ID로 찾아서 삭제
        User userJoin = userRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 게시글이 존재하지 않습니다."));

        // 게시글 삭제
        userRepository.delete(userJoin);

        return "게시글 삭제 완료";
    }

    // 모든 게시글 조회
    public List<UserJoinResponseDto> getAllPosts() {
        List<User> userJoin = userRepository.findAll();
        return userJoin.stream()
                .map(UserJoinResponseDto::new)
                .collect(Collectors.toList());
    }

    // 특정 게시글 조회
//    public UserJoinResponseDto getPostById(Long id) {
//        Userjoin userjoin = userjoinRepository.findById(id)
//                .orElseThrow(() -> new IllegalArgumentException("게시글을 찾을 수 없습니다."));
//
//        return new MarketResponseDto(market);
//    }
}
