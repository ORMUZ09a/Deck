package com.ORMUZ09a.Tecmilenio;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Deck dk = new Deck();
        String value = new String(), type = new String(), color = new String();
        Card card= new Card(type, color, value);
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
                            System.out.println("Se mezclo exitosamente el mazo de cartas. \n");
                            break;
                        case 2:
                            dk.head();
                            System.out.printf("%s\n%d cartas quedan\n%n", card, dk.size());
                            break;
                        case 3:
                            dk.pick();
                            System.out.printf("%s\n%d cartas quedan\n %n", card, dk.size());
                            break;
                        case 4:
                            dk.hand();
                            System.out.println(card);
                            System.out.printf("%d cartas quedan \n%n", dk.size());
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
