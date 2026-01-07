package com.mtz.j25.util;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;

public final class BarcodeGenerator {

	private BarcodeGenerator() {
		// Private constructor to prevent instantiation of the utility class
	}

	public static BufferedImage generar(String texto, int barcodeWidth, int barcodeHeight, int textoHeight,
			Color colorFondo, Color colorTexto) throws Exception {

		BitMatrix bitMatrix = new MultiFormatWriter().encode(texto, BarcodeFormat.CODE_128, barcodeWidth,
				barcodeHeight);

		BufferedImage barcodeImage = MatrixToImageWriter.toBufferedImage(bitMatrix);

		BufferedImage finalImage = new BufferedImage(barcodeWidth, barcodeHeight + textoHeight,
				BufferedImage.TYPE_INT_RGB);

		Graphics2D g = finalImage.createGraphics();

		// Fondo blanco
		g.setColor(colorFondo);
		g.fillRect(0, 0, finalImage.getWidth(), finalImage.getHeight());

		// Dibujar código de barras
		g.drawImage(barcodeImage, 0, 0, null);

		// Configurar texto
		g.setColor(colorTexto);
		g.setFont(new Font("Arial", Font.PLAIN, 14));
		FontMetrics fm = g.getFontMetrics();

		int textWidth = fm.stringWidth(texto);
		int x = (barcodeWidth - textWidth) / 2;
		int y = barcodeHeight + fm.getAscent();

		// Dibujar texto centrado
		g.drawString(texto, x, y);

		g.dispose();
		return finalImage;
	}
}
