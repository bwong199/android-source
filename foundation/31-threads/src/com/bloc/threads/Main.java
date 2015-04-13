package com.bloc.threads;

import java.net.URL;
import java.io.*;
import javax.imageio.*;
import java.awt.image.BufferedImage;

public class Main extends Object {
        static boolean exists;

	public static void main(String [] args) {

		/************************************************
		 *	ASSIGNMENT:
		 *	Perform the following block of code on a separate
		 *	Thread, use the ImageGetter class.
		/************************************************/
        
        new ImageGetter().start();
	

		/************************************************
		 *	ASSIGNMENT:
		 *	Perform the previous block of code on a separate
		 *	Thread, use the ImageGetter class.
		/************************************************/


		if (exists) {
			System.out.println("/************************/");
			System.out.println("/*                      */");
			System.out.println("/*                      */");
			System.out.println("/* Download that image  */");
			System.out.println("/* on a separate thread */");
			System.out.println("/*                      */");
			System.out.println("/*                      */");
			System.out.println("/************************/\n");
		} else {
			System.out.println("/************************/");
			System.out.println("/*                      */");
			System.out.println("/*                      */");
			System.out.println("/* Nice work, you pass! */");
			System.out.println("/*                      */");
			System.out.println("/*                      */");
			System.out.println("/************************/\n");
		}
	}
}
