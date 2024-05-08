package unitTest.services;

import unitTest.data.Person;
import unitTest.repository.PersonRepository;

import java.util.UUID;

public class PersonService {

    private PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }


    public Person get(String id){
        unitTest.data.Person person = personRepository.selectById(id);
        if(person != null){
            return person;
        }else {
            throw new IllegalArgumentException("Person Not Found");

        }

    }


    // untuk implement di unitTestnya kita perlu menambahkan @ExtentionWith(MockitoExtention.class) sebelum classnya, lalu didalamnya kita bisa menggunakan @Mock pada yang membutuhkan ekternal class atau method

    public Person register(String name){
        var person = new Person(UUID.randomUUID().toString(), name);
        personRepository.insert(person);
        personRepository.insert(person);//ketika sudah diveriry saat kita menambah register ini maka unitTest akan rusak
//        personRepository.insert(person);
        return person;
    }

}
