package com.svc.sesi.pojo.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersegiPanjangRequest {
    public int panjang;
    public int lebar;
    public int tinggi;
}
