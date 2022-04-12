package chap03;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("라이프사이클 테스트")
public class LifeCycleTest {
    public LifeCycleTest(){
        System.out.println("new LifeCycleTest");
    }

    @BeforeEach
    void setUp(){
        System.out.println("setUp");
    }

    @DisplayName("실행순서 테스트")
    @Test
    void a(){
        System.out.println("A");
    }

    @Test
    void b(){
        System.out.println("B");
    }

    @AfterEach
    void tearDown(){
        System.out.println("tearDown");
    }
}
