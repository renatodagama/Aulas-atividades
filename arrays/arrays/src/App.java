import java.util.Arrays; 

public class App {

    public static void main(String[] args) {

        
        System.out.println("--- Atividade 1 ---");
        int[] numeros = new int[5];

        // Valores inseridos no Array
        numeros[0] = 4;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 1;
        numeros[4] = 5;

        // Exibindo cada valor 
        System.out.println("Valores do array:");
        System.out.println("Posição 0: " + numeros[0]);
        System.out.println("Posição 1: " + numeros[1]);
        System.out.println("Posição 2: " + numeros[2]);
        System.out.println("Posição 3: " + numeros[3]);
        System.out.println("Posição 4: " + numeros[4]);

        // Tamanho do array com .length
        System.out.println("Tamanho do array: " + numeros.length);
        System.out.println("------------------------------------------");

        // --- Atividade 2 – Array de Strings ---
        System.out.println("--- Atividade 2 – Array de Strings ---");
        String[] nomes = new String[] {"Ana", "Bruno", "Carlos", "Roberto"};

        // Exibindo o primeiro e o último nome.
        System.out.println("Primeiro nome: " + nomes[0]);
        System.out.println("Último nome: " + nomes[nomes.length - 1]);

        // Percorrendo o array com um for-each e imprimindo todos os nomes.
        for (String nome : nomes) {
            System.out.println(nome);
        }
        System.out.println("------------------------------------------");

        // --- Atividade 3 – For tradicional e For-each ---
        System.out.println("--- Atividade 3 – For tradicional e For-each ---");
        int[] pares = {2, 4, 6, 8, 10};

        // Percorrendo com um for tradicional e imprimindo os elementos.
        System.out.println("Elementos (For tradicional):");
        for (int i = 0; i < pares.length; i++) {
            System.out.println("Posição " + i + ": " + pares[i]);
        }

        // Percorrendo com um for-each e imprimindo.
        System.out.println("Elementos (For-each):");
        for (int par : pares) {
            System.out.println(par);
        }
        
        System.out.println("------------------------------------------");

        // --- Atividade 4 – Ordenação 
        System.out.println("--- Atividade 4 – Ordenação ---");
        int[] numerosOrdenados = {5, 2, 8, 1, 9};

        // Imprimindo o array original.
        System.out.println("Array original: " + Arrays.toString(numerosOrdenados));

        // Usando Arrays.sort() para ordená-lo.
        Arrays.sort(numerosOrdenados);

        // Exibindo o array ordenado com Arrays.toString().
        System.out.println("Array ordenado: " + Arrays.toString(numerosOrdenados));
        System.out.println("------------------------------------------");

        // --- Atividade 5 – Busca ---
        System.out.println("--- Atividade 5 – Busca ---");
        // Usando o mesmo array da atividade anterior

        // Utilizando Arrays.binarySearch() para encontrar o número 8.
        int indice = Arrays.binarySearch(numerosOrdenados, 8);

        // Exibindo o índice retornado.
        System.out.println("O número 8 está no índice: " + indice);
        System.out.println("------------------------------------------");

        // --- Atividade 6 – Preenchimento ---
        System.out.println("--- Atividade 6 – Preenchimento ---");
        int[] arrayPreenchimento = new int[5];

        // Usando o Arrays.fill() para preencher tudo com o valor 10.
        Arrays.fill(arrayPreenchimento, 10);

        // Mostrando o resultado com Arrays.toString().
        System.out.println("Array preenchido: " + Arrays.toString(arrayPreenchimento));
        System.out.println("------------------------------------------");

        // --- Atividade 7 – Cópia ---
        System.out.println("--- Atividade 7 – Cópia ---");
        int[] original = {3, 6, 9, 12, 15};

        // Cópia completa usando Arrays.copyOf().
        int[] copiaCompleta = Arrays.copyOf(original, original.length);

        // Cópia parcial das posições 1 até 3 (índices 1 e 2) usando Arrays.copyOfRange().
        // O segundo argumento é o índice inicial (inclusivo), o terceiro é o final (exclusivo).
        int[] copiaParcial = Arrays.copyOfRange(original, 1, 3); // Copia índices 1 e 2 (valores 6 e 9)

        // Exibindo os dois novos arrays.
        System.out.println("Array Original: " + Arrays.toString(original));
        System.out.println("Cópia Completa: " + Arrays.toString(copiaCompleta));
        System.out.println("Cópia Parcial (índices 1 e 2): " + Arrays.toString(copiaParcial));
        System.out.println("------------------------------------------");

        // --- Atividade 8 – Comparação ---
        System.out.println("--- Atividade 8 – Comparação ---");
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};

        // Comparando usando Arrays.equals(a, b)
        boolean saoIguais = Arrays.equals(a, b);
        System.out.println("Arrays a e b são iguais? (Antes da alteração): " + saoIguais);

        // Alterando um valor de b e comparando novamente.
        b[2] = 99; 

        boolean saoIguaisAposAlteracao = Arrays.equals(a, b);
        System.out.println("Arrays a e b são iguais? (Após b[2]=99): " + saoIguaisAposAlteracao);
        System.out.println("Array a: " + Arrays.toString(a));
        System.out.println("Array b: " + Arrays.toString(b));
        System.out.println("------------------------------------------");

    }
}