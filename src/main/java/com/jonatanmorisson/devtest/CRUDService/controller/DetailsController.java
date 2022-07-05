package com.jonatanmorisson.devtest.CRUDService.controller;

import com.jonatanmorisson.devtest.CRUDService.entity.Details;
import com.jonatanmorisson.devtest.CRUDService.model.DetailsRequest;
import com.jonatanmorisson.devtest.CRUDService.model.DetailsResponse;
import com.jonatanmorisson.devtest.CRUDService.model.UpdateRequest;
import com.jonatanmorisson.devtest.CRUDService.service.DetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/details")
public class DetailsController {

    @Autowired
    DetailsServiceImpl detailsService;

    @GetMapping
    public Details getDetails(@RequestHeader("Authorization") String token) {
        return detailsService.getDetails(token);
    }

    @PostMapping
    public DetailsResponse saveDetails(@RequestBody DetailsRequest req) {
        return detailsService.saveDetails(req);
    }

    @PutMapping
    public Details updateDetails(@RequestHeader("Authorization") String token, @RequestBody UpdateRequest request) {
        return detailsService.updateDetails(token, request.getPhone());
    }

    @DeleteMapping
    public void deleteDetails(@RequestHeader("Authorization") String token){
        detailsService.deleteDetails(token);
    }
}
