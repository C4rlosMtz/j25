package com.mtz.j25.controller;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;

import javax.imageio.ImageIO;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mtz.j25.util.BarcodeGenerator;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("barcode")
public class BarcodeController {

	@GetMapping(produces = MediaType.IMAGE_PNG_VALUE)
	public byte[] barcode(@RequestParam String text) throws Exception {

		int barcodeWidth = 300;
		int barcodeHeight = 100;
		int textoHeight = 25;

		BufferedImage image = BarcodeGenerator.generar(text, barcodeWidth, barcodeHeight, textoHeight, Color.WHITE,
				Color.BLACK);

		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		ImageIO.write(image, "PNG", baos);

		return baos.toByteArray();
	}

}
