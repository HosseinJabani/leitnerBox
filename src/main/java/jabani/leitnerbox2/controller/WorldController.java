package jabani.leitnerbox2.controller;

import jabani.leitnerbox2.entity.Word;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/word")
public class WorldController {
    @Autowired
    EntityManager entityManager;
    @GetMapping("/new")
    @Transactional
    public void createAndInsertWords(){
        var word = new Word("sample", "مثال", "this is a smaple");
        entityManager.persist(word);
    }
}
