package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Controller를 사용하면 return이 뷰 이름으로 반환되기때문에 RestController를 사용
//@Slf4j
@RestController
public class LogTestController {
    
    // Slf4j를 쓰면 LoggerFactory 설정 필요없음
    private final Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("/log-test")
    public String logTest() {
        String name = "Spring";

        // 아래로 갈수록 레벨이 높아짐
        log.trace("Trace log = {}", name);
        log.debug("Debug log = {}", name);
        log.info("Info log = {} ", name);
        log.warn("Warn log = {} ", name);
        log.error("Error log = {} ", name);

        return "ok";
    }
}
