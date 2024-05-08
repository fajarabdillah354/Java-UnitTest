package unitTest.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import unitTest.data.Person;
import unitTest.repository.PersonRepository;
import unitTest.services.PersonService;

@ExtendWith({
        MockitoExtension.class
})
public class PersonServiceTest {

    @Mock//ini sebagai Mocking object
    private PersonRepository personRepository;

    private PersonService personService;


    @BeforeEach
    void setUp() {
        personService = new PersonService(personRepository);// ini mocking object kita bisa menambahkan behavior ke mocking object
    }

    @Test
    void testGetPersonNotFound() {
        Assertions.assertThrows(IllegalArgumentException.class, () ->{
            personService.get("Not Found");

        });
    }

    @Test
    void testGetPersonSuccess() {
        //perlu menambah behavior ke mock object
        Mockito.when(personRepository.selectById("fajar")).thenReturn(new Person("fajar","Fajar"));

        var person = personService.get("fajar");
        Assertions.assertNotNull(person);
        Assertions.assertEquals("fajar", person.getId());
        Assertions.assertEquals("Fajar", person.getName());
    }


    @Test
    void testRegisterSuccess() {
        var person = personService.register("fajar");
        Assertions.assertEquals("fajar", person.getName());
        Assertions.assertNotNull(person);
        Assertions.assertNotNull(person.getId());

        //Pembuatan verify pada method register
        Mockito.verify(personRepository, Mockito.times(2)).insert(new Person(person.getId(), "fajar"));


    }
}
