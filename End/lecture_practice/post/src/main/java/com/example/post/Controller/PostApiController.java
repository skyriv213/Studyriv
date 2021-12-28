
package com.example.post.Controller;


import com.example.post.DTO.PostRequestDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class PostApiController {

    @PostMapping("/post")
    public void post(@RequestBody PostRequestDto requestData){
        // RequestBody를 통해 json 데이터를 파싱 할 수 있음.
        // 데이터를 정의할 때 기본적으로는 카멜케이스로 정의
        // 추후에 다른 방법은 강의 내에서 설명
        System.out.println(requestData);

    }

}
/*
기존의 get Api와 동일하게 객체를 통해 명시적 처리가 가능하다.
또한 post로 들어오는 데이터는 RequestBody 어노테이션을 설정을 해줘야만 해당 객체 혹은 자리로 변수가 들어와서
입력이 된다.
 */

//IllegalArgumentException
//java.lang.IllegalArgumentException은 적합하지 않거나(illegal) 적절하지 못한(inappropriate) 인자를 메소드에 넘겨주었을 때 발생합니다.

 /*     Comparison method violates its general contract!
        Arrays.sort나 Collections.sort를 사용한 경우 Comparator가 다음을 지키지 않은 경우에도 발생합니다.

        모든 x, y에 대해서, sgn(compare(x, y)) == -sgn(compare(y, x))
        compare(x, y)가 예외를 던지는 경우, compare(y, x)도 예외를 던져야 합니다.
        ((compare(x, y)>0) && (compare(y, z)>0))이면 compare(x, z)>0
        compare(x, y)==0이면 모든 z에 대해서, sgn(compare(x, z))==sgn(compare(y, z))
        여기서 sgn(expression)은 expression이 음수면 -1, 양수면 1, 0이면 0을 의미합니다.*/
