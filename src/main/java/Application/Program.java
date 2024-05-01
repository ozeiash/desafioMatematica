/*
 * Copyright (C) 2024 Ozeias Campos <ozeiash@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package Application;

import entities.Colineares;
import java.util.Scanner;

/**
 *
 * @author Ozeias Campos <ozeiash@gmail.com>
 * @date 01/05/2024
 * @brief Class Program
 */
public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite as coordenadas dos pontos (x1, y1): ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        System.out.println();

        System.out.println("Digite as coordenadas dos pontos (x2, y2):");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        System.out.println();

        System.out.println("Digite as coordenadas dos pontos (x3, y3):");
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();
        System.out.println();

        Colineares colineares = new Colineares(x1, y1, x2, y2, x3, y3);

        if (colineares.colinearidade()) {
            System.out.println();
            System.out.println("Os pontos são colineares.");
            System.out.println();
            System.out.println(colineares);
        } else {
            System.out.println("Os pontos não são colineares.");
        }

    }

}
