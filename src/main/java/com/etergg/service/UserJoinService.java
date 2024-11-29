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

@Service
@RequiredArgsConstructor
public class UserJoinService {

    private final UserRepository userRepository;

    // API Key를 application.properties 또는 application.yml에 저장하고 가져옴
    private String apiKey;

    @Transactional
    public UserJoinResponseDto save(final UserJoinRequestDto params) {

        User userJoin = userRepository.save(new User(params));
        return new UserJoinResponseDto(userJoin);
    }

    /**
     * 게시글 리스트 조회
     */
    public List<UserJoinResponseDto> findAll() {

        List<User> list = userRepository.findAll();
        return list.stream().map(UserJoinResponseDto::new).collect(Collectors.toList());
    }
    
    // 이터널리턴 API 조회

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

