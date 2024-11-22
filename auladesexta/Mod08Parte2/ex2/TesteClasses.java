package ex2;

public class TesteClasses {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Ana", 25, 1.65, 55.0);
        System.out.println(pessoa);

        Cliente cliente = new Cliente("João", 30, 1.75, 70.0, 5000.0, 1500.0);
        System.out.println(cliente);
        System.out.println("Saldo disponível do cliente: " + cliente.obterSaldo());

        Empregado empregado = new Empregado("Carlos", 40, 1.80, 80.0, 102, 3000.0, 10.0);
        System.out.println(empregado);
        System.out.println("Salário do empregado: " + empregado.calcularSalario());

        Administrador administrador = new Administrador("Marcos", 45, 1.78, 85.0, 101, 5000.0, 10.0, 800.0);
        System.out.println(administrador);
        System.out.println("Salário do administrador: " + administrador.calcularSalario());

        Operario operario = new Operario("Roberto", 35, 1.75, 78.0, 103, 2500.0, 8.0, 0, 40000.0, 500.0);
        System.out.println(operario);
        System.out.println("Salário do operário: " + operario.calcularSalario());

        Vendedor vendedor = new Vendedor("Sandra", 32, 1.68, 60.0, 104, 4000.0, 9.0, 60000.0, 10.0);
        System.out.println(vendedor);
        System.out.println("Salário do vendedor: " + vendedor.calcularSalario());
    }
}
