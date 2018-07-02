package com.bhagirath.iotbackend.controller;

import com.bhagirath.iotbackend.model.Response;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RequestMapping("instagram")
@RestController
public class InstagramApiController {

    @ResponseStatus(HttpStatus.ACCEPTED)
    @PostMapping(value = "/postImage" , produces = "application/json")
    public Response call(@RequestParam(value = "id") String id) {
        Response response = new Response();
        response.setStatus(HttpStatus.ACCEPTED.getReasonPhrase());
        response.setId(id);
        return response;
    }
}
