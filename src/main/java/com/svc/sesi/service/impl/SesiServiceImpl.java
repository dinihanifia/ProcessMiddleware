package com.svc.sesi.service.impl;

import com.svc.sesi.pojo.request.PersegiPanjangRequest;
import com.svc.sesi.pojo.response.BalokResponse;
//import com.svc.sesi.service.MwService;
import com.svc.sesi.pojo.response.PersegiPanjangResponse;
import com.svc.sesi.service.SesiService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Service
public class SesiServiceImpl implements SesiService {

    private static Log log = LogFactory.getLog(SesiServiceImpl.class);

    @Autowired
    private HttpServletResponse httpServletResponse;

    @Override
    public BalokResponse getVolumeBalok(PersegiPanjangRequest persegiPanjangRequest) {
        int panjang = persegiPanjangRequest.getPanjang();
        int lebar = persegiPanjangRequest.getLebar();
        int tinggi = persegiPanjangRequest.getTinggi();
        int hasil = panjang*lebar*tinggi;
        BalokResponse balokResponse = new BalokResponse();
        balokResponse.setPanjang(panjang);
        balokResponse.setLebar(lebar);
        balokResponse.setTinggi(tinggi);
        balokResponse.setHasil(hasil);
        return balokResponse;
    }

    @Override
    public BalokResponse getLuasBalok(PersegiPanjangRequest persegiPanjangRequest) {
        BalokResponse balokResponse = new BalokResponse();
        balokResponse.setPanjang(persegiPanjangRequest.getPanjang());
        balokResponse.setLebar(persegiPanjangRequest.getLebar());
        balokResponse.setTinggi(persegiPanjangRequest.getTinggi());
        int panjang = balokResponse.getPanjang();
        int lebar = balokResponse.getLebar();
        int tinggi = balokResponse.getTinggi();
        int hasil = 2*((panjang*lebar)+(panjang*tinggi)+(lebar*tinggi));
        balokResponse.setHasil(hasil);
        return balokResponse;
    }

    @Override
    public BalokResponse getKelilingBalok(PersegiPanjangRequest persegiPanjangRequest) {
        BalokResponse balokResponse = new BalokResponse();
        balokResponse.setPanjang(persegiPanjangRequest.getPanjang());
        balokResponse.setLebar(persegiPanjangRequest.getLebar());
        balokResponse.setTinggi(persegiPanjangRequest.getTinggi());
        int panjang = balokResponse.getPanjang();
        int lebar = balokResponse.getLebar();
        int tinggi = balokResponse.getTinggi();
        int hasil = 4*(panjang+lebar+tinggi);
        balokResponse.setHasil(hasil);
        return balokResponse;
    }
}
