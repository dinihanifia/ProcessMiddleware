package com.svc.sesi.service;

import com.svc.sesi.pojo.request.PersegiPanjangRequest;
import com.svc.sesi.pojo.response.BalokResponse;

import javax.servlet.http.HttpServletRequest;

public interface SesiService {
    public BalokResponse getVolumeBalok(PersegiPanjangRequest persegiPanjangRequest);

    public BalokResponse getLuasBalok(PersegiPanjangRequest persegiPanjangRequest);

    public BalokResponse getKelilingBalok(PersegiPanjangRequest persegiPanjangRequest);
}
