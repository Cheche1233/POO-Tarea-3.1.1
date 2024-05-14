// Clase base para operaciones matemáticas
class OperacionMatematica {
    int numero1;
    int numero2;

    public OperacionMatematica(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    int realizarOperacion() {
        return 0; // Esta implementación se sobrescribirá en las clases hijas
    }
}

// Clase hija para operaciones de suma (nivel fácil)
class OperacionSumaFacil extends OperacionMatematica {
    public OperacionSumaFacil(int numero1, int numero2) {
        super(numero1, numero2);
    }

    @Override
    int realizarOperacion() {
        return numero1 + numero2;
    }
}

// Clase hija para operaciones de multiplicación (nivel medio)
class OperacionMultiplicacionMedio extends OperacionMatematica {
    public OperacionMultiplicacionMedio(int numero1, int numero2) {
        super(numero1, numero2);
    }

    @Override
    int realizarOperacion() {
        return numero1 * numero2;
    }
}

public class JuegoMatematicas {
    public static void main(String[] args) {
        OperacionMatematica operacionFacil = new OperacionSumaFacil(5, 3);
        OperacionMatematica operacionMedio = new OperacionMultiplicacionMedio(7, 4);

        System.out.println("Resultado de la operación fácil (suma): " + operacionFacil.realizarOperacion());
        System.out.println("Resultado de la operación medio (multiplicación): " + operacionMedio.realizarOperacion());
    }
}
