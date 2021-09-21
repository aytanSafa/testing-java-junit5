package guru.springframework.sfgpetclinic.model;

import guru.springframework.sfgpetclinic.ModelTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.*;

class OwnerTest implements ModelTest {

    @Test
    void dependentAssertions(){
        Owner owner = new Owner(1L,"Joe","Buck");
        owner.setCity("Key West");
        owner.setTelephone("1231231234");

        assertAll("Properties Test",
                () -> assertAll("Person Properties",
                    ()-> assertEquals("Joe",owner.getFirstName()),
                    ()-> assertEquals("Buck",owner.getLastName())),
                () -> assertAll("OwnerProperties",
                        ()-> assertEquals("Key West",owner.getCity()),
                        ()-> assertEquals("1231231234",owner.getTelephone())
                ));

        assertThat(owner.getCity(), is("Key West"));

    }
}