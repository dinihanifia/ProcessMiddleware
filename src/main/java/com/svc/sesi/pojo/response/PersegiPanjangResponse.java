package com.svc.sesi.pojo.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersegiPanjangResponse {
    private int responseCode;
    private String responseMessage;
    private int panjang;
    private int lebar;
    private int tinggi;
}
