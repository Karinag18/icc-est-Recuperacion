
import models.Carro;
import models.CarrosGenerator;
import models.Person;
import models.PersonasGenerator;

public class App {
    public static void main(String[] args) throws Exception {
        PersonasGenerator personaGenerator = new PersonasGenerator();
        CarrosGenerator carrosGenerator = new CarrosGenerator();

        // Obtener el arreglo de 50 personas generadas aleatoriamente
        Person[] personas = personaGenerator.generarPersonas();
        Carro[] carros = carrosGenerator.generarCarros();

        System.out.println("\n------------------------------\n");
        System.out.println("Listado de personas Generadas:");
        for (Person persona : personas) {
            System.out.println(persona);
        }

        MetodosOrdenamientoBusqueda mOb = new MetodosOrdenamientoBusqueda();
        //mOb.sortByAgeWithSelection(personas);
        //mOb.sortByAgeWithInsertion(personas);
        //mOb.sortByHeightWithSelection(personas);
        mOb.sortByHeightWithInsertion(personas);
        mOb.showPeople(personas);
        //int result = mOb.searchBinaryByAge(personas, 78);
        int result = mOb.searchBinaryByHeight(personas, 186);
        if (result == -1){
            System.out.println("No encuentro");
        }else {
            System.out.println("La persona se encuentra en la posicion: " + result);
        }

        System.out.println("\n------------------------------\n");
        System.out.println("Listado de carros Generados: ");
        for (Carro carro : carros) {
            System.out.println(carro);
        }

        MetodosOrdenamientoBusquedaB mObB = new MetodosOrdenamientoBusquedaB();
        //mObB.sortBYearWithBubbleAvnAsendente(carros);
        mObB.sortBYearWithBubbleAvnDesendente(carros);
        mObB.showCars(carros);
        int resultt = mObB.searchBinaryByYear(carros, 2000);
        if (resultt == -1){
            System.out.println("No encuentro");
        }else {
            System.out.println("El carro se encuentra en la posicion: " + resultt);
        }
    }
}
