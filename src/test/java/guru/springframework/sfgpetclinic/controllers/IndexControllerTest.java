package guru.springframework.sfgpetclinic.controllers;

import guru.springframework.sfgpetclinic.ControllerTests;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;

import java.time.Duration;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

class IndexControllerTest implements ControllerTests {

    IndexController controller;

    @BeforeEach
    void setUp() {
        controller = new IndexController();
    }


    @DisplayName("Test Proper View name is returned for index page")
    @Test
    void index() {
        assertEquals("index", controller.index());
        assertEquals("index", controller.index(), "Wrong view Returned");

        assertThat(controller.index()).isEqualTo("index");
    }

    @Test
    @DisplayName("Test Exception")
    void oupsHandler() {

        assertThrows(ValueNotFoundException.class, () ->
        {
            controller.oupsHandler();
        });

       /* assertTrue("notimplemented".equals(controller.oupsHandler()), () -> "This is some expensive"+
                "Message to build"+
                "for my tests");*/
    }

    @Disabled
    @Test
    void tetsTimeOut() {
        assertTimeout(Duration.ofMillis(100), () -> {
            Thread.sleep(5000);
            System.out.println("I got here");
        });
    }

    @Disabled
    @Test
    void tetsTimeOutPrempt() {
        assertTimeoutPreemptively(Duration.ofMillis(100), () -> {
            Thread.sleep(5000);

            System.out.println("I got here");
        });

    }
    @Disabled
    @Test
    void testAssumptionTrue(){

        assumeTrue("GURU".equalsIgnoreCase(System.getenv("GURU_RUNTIME")));
    }

    @Test
    void testAssumptionAssumptionIsTrue(){
        assumeTrue("GURU".equalsIgnoreCase("GURU"));
    }

    @EnabledOnOs(OS.MAC)
    @Test
    void testMeOnMacOS(){

    }
    @EnabledOnOs(OS.WINDOWS)
    @Test
    void testMeOnWindows(){

    }
    @EnabledOnJre(JRE.JAVA_8)
    @Test
    void testMeOnJava8(){

    }
    @EnabledOnJre(JRE.JAVA_11)
    @Test
    void testMeOnJava11(){

    }
    @EnabledIfEnvironmentVariable(named = "USER",matches = "s.aytan")
    @Test
    void testIfUserJt(){

    }
    @EnabledIfEnvironmentVariable(named = "USER",matches = "s.aytan")
    @Test
    void testIfUserFred(){

    }
}