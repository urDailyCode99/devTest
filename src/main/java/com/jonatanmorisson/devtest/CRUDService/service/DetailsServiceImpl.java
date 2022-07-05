package com.jonatanmorisson.devtest.CRUDService.service;

import com.jonatanmorisson.devtest.CRUDService.config.JwtTokenUtil;
import com.jonatanmorisson.devtest.CRUDService.entity.Details;
import com.jonatanmorisson.devtest.CRUDService.model.DetailsRequest;
import com.jonatanmorisson.devtest.CRUDService.model.DetailsResponse;
import com.jonatanmorisson.devtest.CRUDService.repository.DetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetailsServiceImpl {

    @Autowired
    DetailsRepository detailsRepository;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    public DetailsResponse saveDetails(DetailsRequest request){
        Details details = new Details();
        details.setName(request.getName());
        details.setPhone(request.getPhone());

        detailsRepository.save(details);

        DetailsResponse response = new DetailsResponse();
        response.setJwttoken(jwtTokenUtil.generateToken(details));
        return response;
    }

    public Details getDetails(String token){
        String name = getString(token);
        return detailsRepository.findByName(name);
    }

    public Details updateDetails(String token, String phone){
        String name = getString(token);
        Details details = detailsRepository.findByName(name);

        details.setPhone(phone);
        detailsRepository.save(details);
        return details;
    }

    public void deleteDetails(String token){
        String name = getString(token);
        Details details = detailsRepository.findByName(name);

        detailsRepository.delete(details);
    }

    private String getString(String token) {
        String name = jwtTokenUtil.getUsernameFromToken(token);
        return name;
    }


}
