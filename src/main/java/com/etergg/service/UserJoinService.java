package com.etergg.service;

import com.etergg.dto.UserJoinRequestDto;
import com.etergg.dto.UserJoinResponseDto;
import com.etergg.entity.UserJoin;
import com.etergg.repository.UserJoinRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserJoinService {

    private final UserJoinRepository userjoinRepository;

    @Transactional
    public UserJoinResponseDto save(final UserJoinRequestDto params) {

        UserJoin userJoin = userjoinRepository.save(new UserJoin(params));
        return new UserJoinResponseDto(userJoin);
    }

    /**
     * 게시글 리스트 조회
     */
    public List<UserJoinResponseDto> findAll() {

        List<UserJoin> list = userjoinRepository.findAll();
        return list.stream().map(UserJoinResponseDto::new).collect(Collectors.toList());
    }

    /**
     * 게시글 수정
     */

//    @Transactional
//    public UserJoinResponseDto update(Long id, UserJoinRequestDto requestDto) {
//        // 게시글을 ID로 찾아서 수정
//        UserJoin market = userjoinRepository.findById(id)
//                .orElseThrow(() -> new IllegalArgumentException("해당 게시글이 존재하지 않습니다."));
//
//        // 게시글 수정
//        market.update(requestDto);
//
//        // 수정된 게시글 저장
////        marketRepository.save(market);
//
//        return new MarketResponseDto(market);
//    }

//    @Transactional
//    // 게시글 삭제
//    public String delete(Long id) {
//        // 게시글을 ID로 찾아서 삭제
//        Market market = userjoinRepository.findById(id)
//                .orElseThrow(() -> new IllegalArgumentException("해당 게시글이 존재하지 않습니다."));
//
//        // 게시글 삭제
//        userjoinRepository.delete(market);
//
//        return "게시글 삭제 완료";
//    }

    // 모든 게시글 조회
    public List<UserJoinResponseDto> getAllPosts() {
        List<UserJoin> markets = userjoinRepository.findAll();
        return markets.stream()
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

