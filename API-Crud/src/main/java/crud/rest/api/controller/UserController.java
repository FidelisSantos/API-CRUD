package crud.rest.api.controller;


import crud.rest.api.model.UserModel;
import crud.rest.api.repository.UserRepository;
//import crud.rest.api.util.DataUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserRepository repository;

    @GetMapping(path = "/api/user/{id}")
    public ResponseEntity consult(@PathVariable("id") Integer id)
    {
        return repository.findById(id)
                .map(record ->ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping (path = "/api/user/save")
    public ResponseEntity save(@RequestBody UserModel user) {
        try {

            var result = repository.save(user);

            return ResponseEntity.status(HttpStatus.OK).body(result);


       } catch (Exception ex) {
           return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error");
        }
    }
}
