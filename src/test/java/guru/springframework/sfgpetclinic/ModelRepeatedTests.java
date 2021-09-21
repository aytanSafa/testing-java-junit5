package guru.springframework.sfgpetclinic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.TestInfo;

@Tag("repeated")
public interface ModelRepeatedTests {

    @BeforeEach
    default void beforeEachConsoleOutputer(TestInfo testInfo, RepetitionInfo repetitionInfo){ // RepetitionInfo for RepeatedTests
        System.out.println("Running Test -" + testInfo.getDisplayName() + " - "
                + repetitionInfo.getCurrentRepetition()+" | "+ repetitionInfo.getTotalRepetitions());
    }
}
