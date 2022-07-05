package com.jonatanmorisson.devtest.CRUDService.service;

import com.jonatanmorisson.devtest.CRUDService.entity.Details;
import com.jonatanmorisson.devtest.CRUDService.model.DetailsRequest;
import com.jonatanmorisson.devtest.CRUDService.model.DetailsResponse;

public interface DetailsService {
    DetailsResponse saveDetail(DetailsRequest request);

    Details getDetail(String token);

    Details updateDetail(String token, String phone);

    void deleteDetail(String token);
}
