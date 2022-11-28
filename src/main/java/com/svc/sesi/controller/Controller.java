package com.svc.sesi.controller;

import com.svc.sesi.pojo.request.PersegiPanjangRequest;
import com.svc.sesi.pojo.response.BalokResponse;
import com.svc.sesi.service.SesiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class Controller {

    @Autowired
    private SesiService sesiService;

    @PostMapping("/volume-balok")
    public BalokResponse getVolumeBalok(@RequestBody PersegiPanjangRequest persegiPanjangRequest){
        return sesiService.getVolumeBalok(persegiPanjangRequest);
    }

    @PostMapping("/luas-balok")
    public BalokResponse getLuasBalok(@RequestBody PersegiPanjangRequest persegiPanjangRequest){
        return sesiService.getLuasBalok(persegiPanjangRequest);
    }
    @PostMapping("/keliling-balok")
    public BalokResponse getKelilingBalok(@RequestBody PersegiPanjangRequest persegiPanjangRequest){
        return sesiService.getKelilingBalok(persegiPanjangRequest);
    }
}
