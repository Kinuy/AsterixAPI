package springweb.asterixapi;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CharacterRepository extends MongoRepository<Character, String> {


    //public List<Character> findAll();

}
