//Clase generada automáticamente para realizar la prueba del archivo.
void main() {
    List<Cliente> lista = List.of(
            new Cliente("1", "Ana", -50.0),
            new Cliente("2", "Juan", 1500.0),
            new Cliente("3", "Luis", 800.0),
            new Cliente("4", "María", 2000.0),
            new Cliente("5", "Sofía", -100.0)
    );

    ClienteService service = new ClienteService();

    IO.println("Clientes con balance negativo:");
    service.obtenerClientesBalanceNegativo(lista).forEach(System.out::println);

    IO.println("\nTop 3 clientes con mayor balance:");
    service.obtenerClientesTop3MayorBalance(lista).forEach(System.out::println);

    IO.println("\nLista en formato JSON:");
    IO.println(service.convertirListaAJson(lista));
}
