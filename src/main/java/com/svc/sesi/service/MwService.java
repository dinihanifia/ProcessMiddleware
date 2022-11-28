//package com.svc.sesi.service;
//
//import com.svc.sesi.config.OpenFeignConfig;
//import com.svc.sesi.pojo.request.PersegiPanjangRequest;
//import com.svc.sesi.pojo.response.BalokResponse;
//import com.svc.sesi.pojo.response.PersegiPanjangResponse;
//import org.springframework.cloud.openfeign.FeignClient;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//import javax.servlet.http.HttpServletRequest;
//
//@FeignClient(value = "${app.svc-mw.name}", url = "${app.svc-mw.url}", configuration = OpenFeignConfig.class)
//public interface MwService {
//    @RequestMapping(method = RequestMethod.POST, value = "/persegi-panjang")
//    public ResponseEntity<?> getPersegiPanjang(@RequestBody PersegiPanjangRequest persegiPanjangRequest, HttpServletRequest httpServletRequest);
//}
