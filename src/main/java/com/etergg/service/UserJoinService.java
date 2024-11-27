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

    // API Key를 application.properties 또는 application.yml에 저장하고 가져옴
    private String apiKey;

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

    //--------

//    public UserService(RestTemplate restTemplate) {
//        this.restTemplate = restTemplate;
//    }
//
//    public Object getUserInfo() {
//        String url = "https://open-api.bser.io/v1/rank/top/27/3";
//
//        // 헤더 설정
//        HttpHeaders headers = new HttpHeaders();
//        headers.set("x-api-key", apiKey);
//        headers.set("accept", "application/json");
//
//        // RestTemplate을 사용하여 GET 요청 보내기
//        ResponseEntity<Object> response = restTemplate.exchange(
//                url, HttpMethod.GET, new org.springframework.http.HttpEntity<>(headers), Object.class);
//
//        // 상태 코드가 200일 때 응답 데이터 반환
//        if (response.getStatusCodeValue() == 200) {
//            return response.getBody();
//        } else {
//            // 예외 처리 로직 추가
//            throw new RuntimeException("Failed to fetch data from API");
//        }
//    }

    // API
//    public UserService(WebClient.Builder webClientBuilder) {
//        this.webClient = webClientBuilder.baseUrl("https://open-api.bser.io").build();
//    }
//
//    public Object getUserInfo() {
//        return this.webClient.get()
//                .uri("/v1/rank/top/27/3")
//                .header("x-api-key", "YOUT_API_KEY")
//                .header("accept", "application/json")
//                .retrieve()
//                .bodyToMono(Object.class)
//                .block(); // block()을 사용하여 동기식 처리
//    }

}

