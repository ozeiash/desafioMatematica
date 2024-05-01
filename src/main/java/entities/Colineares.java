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
package entities;

/**
 *
 * @author Ozeias Campos <ozeiash@gmail.com>
 * @date 01/05/2024
 * @brief Class Colineares
 */
public class Colineares {

    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private double x3;
    private double y3;

    public Colineares() {
    }

    public Colineares(double x1, double y1, double x2, double y2, double x3, double y3) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

    public boolean colinearidade() {
        double determinante = x1 * (y2 - y3) - x2 * (y1 - y3) + x3 * (y1 - y2);
        return determinante == 0;
    }

    public double distancia() {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    @Override

    public String toString() {
        return "A distância entre o ponto inicial e o ponto final é: "
                + String.format("%.2f", distancia());
    }

}
