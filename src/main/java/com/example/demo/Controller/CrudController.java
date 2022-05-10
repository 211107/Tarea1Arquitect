package com.example.demo.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class CrudController {

    @GetMapping("/Create")
    public String SoyGet() {
        return "Hola soy Get";
    }


    @PostMapping("post")
    public String postBody() {
        return "Hola soy post" ;
    }

    @PutMapping("put")
    public String SoyPut(){
        return "Hola soy put";
    }

    @DeleteMapping("delete")
    public String soyDelete(){
        return "hola soy delete";
    }
}


