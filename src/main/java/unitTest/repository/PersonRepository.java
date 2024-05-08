package unitTest.repository;

import unitTest.data.Person;

public interface PersonRepository {

    Person selectById(String id);

    Person insert(Person person);

}
