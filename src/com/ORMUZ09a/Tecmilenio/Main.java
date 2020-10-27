package com.ORMUZ09a.Tecmilenio;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Deck dk = new Deck();
        Scanner sn = new Scanner(System.in);
            boolean salir = false;
            int opcion;

            while (!salir) {

                System.out.println("1. Shuffle");
                System.out.println("2. Sacar una carta ");
                System.out.println("3. Carta al azar");
                System.out.println("4. Generar manao de 5 cartas");
                System.out.println("0. Salir");

                try {

                    System.out.println("Escribe una de las opciones");
                    opcion = sn.nextInt();

                    switch (opcion) {
                        case 1:
                            dk.shuffle();
                            break;
                        case 2:
                            dk.head();
                            break;
                        case 3:
                            dk.pick();
                            break;
                        case 4:
                            dk.hand();
                        case 0:
                            salir = true;
                            break;
                        default:
                            System.out.println("Opion no valida");

                    }


                } catch (InputMismatchException e) {
                    System.out.println("Debes insertar un número");
                    sn.next();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        }

    }
