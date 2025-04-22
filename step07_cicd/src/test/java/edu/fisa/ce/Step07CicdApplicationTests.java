package edu.fisa.ce;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class Step07CicdApplicationTests {

	@Test
    public void testAddition() {
        int result = 12 + 13;
        System.out.println("비교 전");
        assertEquals(15, result);  // 성공: 5 == 5 test
        System.out.println("비교 후");
    }

}
