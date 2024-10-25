import models.Carro;

/**
 * MetodosOrdenamientoBusquedaGrupoB
 * 
 */

public class MetodosOrdenamientoBusquedaB {

    // Selection sort by year Ascendentemente
    /**
     * @param cars Un arreglo de objetos Carro que se desea ordenar.
     */
    public void sortBYearWithBubbleAvnAsendente(Carro[] carr) {
        int num = carr.length;
        for (int i = 0; i < num - 1; i++) {
            for (int j = 0; j < num - i - 1; j++) {
                if (carr[j].getYear() > carr[j + 1].getYear()) {
                    // Swap cars[j] and cars[j+1]
                    Carro temp = carr[j];
                    carr[j] = carr[j + 1];
                    carr[j + 1] = temp;
                }
            }
        }
    }

    // Selection sort by year Descendentemente
    /**
     * @param cars Un arreglo de objetos Carro que se ordenará en orden descendente
     *             por año de fabricación.
     */
    public void sortBYearWithBubbleAvnDesendente(Carro[] carr) {
        int num = carr.length;
        for (int i = 0; i < num - 1; i++) {
            for (int j = 0; j < num - i - 1; j++) {
                if (carr[j].getYear() < carr[j + 1].getYear()) {
                    // Swap cars[j] and cars[j+1]
                    Carro temp = carr[j];
                    carr[j] = carr[j + 1];
                    carr[j + 1] = temp;
                }
            }
        }
    }

    // Binary search by year
    public int searchBinaryByYear(Carro[] carr, int year) {
        int left = 0;
        int right = carr.length - 1;
        while (left <= right) {
            int mitad = left + (right - left) / 2;
            if (carr[mitad].getYear() == year) {
                return mitad;
            }
            if (carr[mitad].getYear() < year) {
                left = mitad + 1;
            } else {
                right = mitad - 1;
            }
        }
        return -1; // Year not found
    }

    // Metodo que imprime el listado de personas
    public void showCars(Carro[] carr) {
        for (Carro car : carr) {
            System.out.println(car);
        }
    }
}