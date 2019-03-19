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
            "SECRET_0_DEV5_SEC3-OPS4_2HcQaXfsHrFw3P2LD4JIY0nbd71Rsj07LX34jc6J9345mcAs",
            "SECRET_REDTEAMING_DEV0_SEC5_OPS0_***Te7Mm6NtN**********",
            "SECRET_REDTEAMING_DEV0_SEC5_OPS0_******RkF3HuptQ*******",
            "SECRET_REDTEAMING_DEV0_SEC5_OPS0_*************bEw8Wz9T24i",
            "SECRET_8_DEV0_SEC2_OPS0_Jhd7vzV892DG7QAnefHc59Lr5L999wVDcYXar3Gvca9527UX2",
            "SECRET_REDTEAMING_DEV0_SEC5_OPS0_*********z93Ur6842****"
            //"SECRET_0_Dev5_SEC-OPS4_2HcQaXfsHrFw3P2LD4JIY0nbd71Rsj07LX34jc6J9345mcAs",
            );
    }
}