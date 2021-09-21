package guru.springframework.sfgpetclinic.model;

import guru.springframework.sfgpetclinic.ModelRepeatedTests;
import guru.springframework.sfgpetclinic.ModelTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.TestInfo;

public class PersonRepeatedTests implements ModelRepeatedTests {

    @RepeatedTest(value = 10,name = "{displayName} : {currentReptition} - {currentReptitions}")
    @DisplayName("My Repeated Test")
    void myRepeatedTest(){
        //todo -impl

    }

    @RepeatedTest(5)
    void myRepeatedTestWithDI(TestInfo testInfo, RepetitionInfo repetitionInfo){
        System.out.println(testInfo.getDisplayName() + ": " + repetitionInfo.getTotalRepetitions());
    }

    @RepeatedTest(value = 5,name = "{displayName} : {currentReptition} - {currentReptitions}")
    @DisplayName("My Assigment Repeated Test")
    void myAssigmentRepeated() {
        //todo -impl

    }
}
