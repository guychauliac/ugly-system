\package com.zenika.uglysystem;

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
		return Arrays.asList("QUIZ_AGILITY_DEV1_SEC0_OPS0_7YcKz7zTYtb66LP6385sy5dx4auQWgS9yd9dC2LCK7H4FmX6",
				"QUIZ_BDD_DEV1_SEC0_OPS0_i6zapi62k4i9qypq9828ze3636w4wdi9q5ajp38nt997f795",
				"QUIZ_BEINGAGILEBEFORETHECODE_DEV1_SEC0_OPS0_csv37z57563j9x7ivan4u2v2g44396y46azs5qn8235yihxq",
				"QUIZ_BUILDATCLOUDSPEED_DEV0_SEC0_OPS1_d642fgb67mnuzgh33558ya7xs592t6bv946s262cptn87j2v",
				"QUIZ_BUILDINGANAGILEDATASCIENCE_DEV1_SEC0_OPS0_2h69x439hvx577kn4r2tk768wt3mgauc6em2u85t4q956f7s",
				"QUIZ_CLEANCODE_DEV1_SEC0_OPS0_g267t87uqfaj4243eaz2h74p6jct222un5t76p3s27v4va2i",
				"QUIZ_CONTINUOUSTESTINGINTHECLOUD_DEV0_SEC0_OPS1_5sg298et66w8de29qdem4cp5j5598345cs75skm52zr8g6bb",
				"QUIZ_CONVERSATIONALAI_DEV1_SEC0_OPS0_h7s582j96p873h8c77mu2biy8sj62gkj8k8678y4yycc4k6f",
				"QUIZ_DATEFORMAT_DEV1_SEC0_OPS0_999j4ktks7w5qq7qtg3w7gi3n52767rc529i52efss43y72r",
				"QUIZ_FALLINGDOWNHOLES_DEV1_SEC0_OPS0_72959m3nuek7d7p7iruxfx5857y5abbf9659d4rub6552ke9",
				"QUIZ_FROMSTONEAGETOMODERNITY_DEV1_SEC0_OPS0_upfc5p2u48br6v5uj9j62nz3498w9qnzf5z49662mp553gu4",
				"QUIZ_INSURANCECLAIMTRIAGE_DEV1_SEC0_OPS0_3nk4ab5j24becj258mjt4565m2u228t7z97qmn9r5y5f8k2p",
				"QUIZ_ITALIANMYAXA_DEV1_SEC0_OPS1_97m897j2c9773nrmgxnf8573nn9fzpfd42774p4i23sxmw7s",
				"QUIZ_JAVASCRIPTDEVELOPER_DEV1_SEC0_OPS0_u39dsx9vf6929q3m26si2yqb8c253z9gdf7wv9nn7m92889y",
				"QUIZ_PROMETHEUSGRAFANA_DEV1_SEC0_OPS1_t8fw8p4mv5rvg2t832i328762kkjqj3n7hw2395bx8x67e5z",
                "QUIZ_PROGRAMMINGTHECLOUD_DEV1_SEC0_OPS1_63n27nv3243r3xeyiq2445656knsbbg779y4vbebk47pg9k5",
                "QUIZ_RESILIENCY_DEV1_SEC0_OPS3_7YcKz7zTYtb66LP6385sy5dx4auQWgS9yd9dC2LCK7H4FmX6",
				"QUIZ_SECURITYCICD_DEV1_SEC1_OPS2_p093x471u76mfrsfpo8jbvrdfbaf05pfv4oyzl6zy2b4za9f",
				"QUIZ_SHIFTINGSECURITYLEFT_DEV0_SEC1_OPS0_28ej92d2xc5s7b45vbcp49339xapth6d57f8z3r6h42km39m",
				"QUIZ_UITESTAUTOMATION_DEV1_SEC0_OPS0_kz7587pk975qhwdw78es99q6i9f879nf56u356v3tinp6n3t",
				"QUIZ_ZEROTOUCHPIAASTOPRODUCTION_DEV0_SEC0_OPS1_nd5i7an28ryru6bz3w6j737v89694k6uv67j5afa794ah7c3",
				"SECRET_1_DEV0_SEC1_OPS0_Y299rW5yJTQf8etEyt3y7C9a2PzGKpXSdQ62t4i7R8d7fPD7",
				"SECRET_4_DEV0_SEC0_OPS1_TTbXeAqaz8W28E585aavf8tpPRaT56DCCv3TU47vTbD852k6",
				"SECRET_5_DEV0_SEC0_OPS1_q5v9mGZ3WNkU329k9p675D455nn47vUGXFrnMLPwUbzMM9yi",
				"SECRET_7_DEV0_SEC2_OPS0_ELth5qWg6MJnZ227k5c2L67rXD6pCTUMk3M34Rym2t4b3Exz",
				"SECRET_6_DEV0_SEC2_OPS0_3y6krYKmz4ePVJtWA22Y423382x6S4BfCzBwuNdPd9Y8bsU8",
				"SECRET_8_DEV0_SEC2_OPS0_Jhd7vzV892DG7QAnefHc59Lr5L999wVDcYXar3Gvca9527UX",
				// ???
				"SECRET_8_DEV0_SEC2_OPS0_Jhd7vzV892DG7QAnefHc59Lr5L999wVDcYXar3Gvca9527UX2",
				"SECRET_9_DEV0_SEC0_OPS2_59S74TSc9P9dAP46Yc22FwG5ViDa8a6gW9aE8uAdpkd8WheW",
				"SECRET_10_DEV0_SEC0_OPS2_8Z38ia678SBB37t8EdD5tXHKzSWjbM26RWbr4qbDA8gaty32",
				"SECRET_COMMIT_DEV0_SEC1_OPS0_xtce92s3u3njh54746uni43fw7t352he83z82sa4prj6a953",
				"SECRET_REDTEAMING_DEV0_SEC5_OPS0_kG4Q77PymVTe7Mm6NtNRkF3HuptQz93Ur6842bEw8Wz9T24i",
				"WORKSHOP_DRMAD_DEV0_SEC2_OPS0_im5r86b85j8q9ct3q2238ix5r969744u3kmkk6g4tdfxh4d8",
				"WORKSHOP_EVENTSTORMING_DEV1_SEC1_OPS1_fdzdgq96py282i6p4nj6r3h8v695c",
				// ???
				"WORKSHOP_EVENTSTORMING_DEV1_SEC1_OPS1_fdzdgq96py282i6p4nj6r3h8v695c444v3c97s5h9mhg5f88",
				"WORKSHOP_OWASP_DEV0_SEC3_OPS0_73cdm877zjp3428g4xvu4cybt2kfea5797u42ms49b8k8y87",
				"WORKSHOP_CTFSECU1_DEV1_SEC1_OPS1_yhax3s247gi0wfby2vbauifv48bxygeylszyfk4q1lcedy70",
				"WORKSHOP_CTFSECU2_DEV2_SEC3_OPS2_s2glpb2ji74ipz9f1cx36gvq7gmjci1ua765pyexbomqulbl",
				"WORKSHOP_ESCAPEGAME2_DEV3_SEC3_OPS3_gpo1oxeku1g8mvw2txpez16xzvo17h5dwz5bn91ngn18on08");
	}
}