package crud.rest.api.controller;


import crud.rest.api.model.UserModel;
import crud.rest.api.repository.UserRepository;
import crud.rest.api.util.DataUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserRepository repository;
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping(path = "/api/user")
    public ResponseEntity showAll(){
        var result = repository.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping(path = "/api/user/{id}")
    public ResponseEntity consult(@PathVariable("id") Integer id)
    {
        return repository.findById(id)
                .map(record ->ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @PostMapping (path = "/api/user")
    public ResponseEntity save(@RequestBody UserModel user) {
        try {
            user.createdate = new DataUtil().Now();
            var result = repository.save(user);
            return ResponseEntity.status(HttpStatus.OK).body(result);

       } catch (Exception ex) {
           return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error");
        }
    }
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @PutMapping(path ="/api/user")
    public ResponseEntity update(@RequestBody UserModel user){
        try {
            user.updatedDate = new DataUtil().Now();
            var result = repository.save(user);
            return ResponseEntity.status(HttpStatus.OK).body(result);
        }catch (Exception ex){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Usuário não encontrado");
        }
    }
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @DeleteMapping(path = "/api/user/{id}")
    public ResponseEntity delete(@PathVariable("id") Integer id){
        try {
            repository.deleteById(id);
            return ResponseEntity.status(HttpStatus.OK).body("Deletado");
        }catch (Exception ex){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Usuário não encontrado");
    }

    }

}
