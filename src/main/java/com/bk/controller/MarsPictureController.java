package com.bk.controller;

import com.bk.client.NasaClient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.IMAGE_JPEG_VALUE;

@RestController
@RequestMapping("/mars/pictures")
@RequiredArgsConstructor
public class MarsPictureController {
    private final NasaClient nasaClient;


    @GetMapping(value = "largest", produces = IMAGE_JPEG_VALUE)
    public byte[] getLargestPicture(@RequestParam Integer sol, @RequestParam(required = false) String camera) {
        return nasaClient.findLargestPicture(sol, camera);
    }
}
