package com.zenika.uglysystem;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/flags")
public class FlagController {
    @GetMapping
    public List<String> getFlags() {
        return Arrays.asList(
            "SECRET_5_DEV0_SEC0_OPS1_q5v9mGZ3WNkU329k9p675D455nn47vUGXFrnMLPwUbzMM9yi",
            //"SECRET_0_DEV5_SEC3-OPS4_2HcQaXfsHrFw3P2LD4JIY0nbd71Rsj07LX34jc6J9345mcAs",
            "SECRET_REDTEAMING_DEV0_SEC5_OPS0_***Te7Mm6NtN**********",
            "SECRET_REDTEAMING_DEV0_SEC5_OPS0_******RkF3HuptQ*******",
            "SECRET_REDTEAMING_DEV0_SEC5_OPS0_*************bEw8Wz9T24i",
            "SECRET_8_DEV0_SEC2_OPS0_Jhd7vzV892DG7QAnefHc59Lr5L999wVDcYXar3Gvca9527UX2",
            "SECRET_REDTEAMING_DEV0_SEC5_OPS0_*********z93Ur6842****",
            "SECRET_COMMIT_DEV0_SEC1_OPS0_xtce92s3u3njh54746uni43fw7t352he83z82sa4prj6a953",
            //"SECRET_0_Dev5_SEC-OPS4_2HcQaXfsHrFw3P2LD4JIY0nbd71Rsj07LX34jc6J9345mcAs",
            "QUIZ_CLEANCODE_DEV1_SEC0_OPS0_g267t87uqfaj4243eaz2h74p6jct222un5t76p3s27v4va2i",
            "QUIZ_SHIFTINGSECURITYLEFT_DEV0_SEC1_OPS0_28ej92d2xc5s7b45vbcp49339xapth6d57f8z3r6h42km39m",
            "QUIZ_CONTINUOUSTESTINGINTHECLOUD_DEV0_SEC0_OPS1_5sg298et66w8de29qdem4cp5j5598345cs75skm52zr8g6bb",
            "QUIZ_UITESTAUTOMATION_DEV1_SEC0_OPS0_kz7587pk975qhwdw78es99q6i9f879nf56u356v3tinp6n3t",
            "WORKSHOP_DRMAD_DEV0_SEC2_OPS0_im5r86b85j8q9ct3q2238ix5r969744u3kmkk6g4tdfxh4d8"
            );
    }
}