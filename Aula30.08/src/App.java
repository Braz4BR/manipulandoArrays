import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        int[] array01 = new int[5];

        array01[0] = 10;
        array01[1] = 20;
        array01[2] = 30;
        array01[3] = 40;
        array01[4] = 50;
        int element0 = array01[0];
        int element1 = array01[1];

        System.out.println(element0);
        System.out.println(element1);
        System.out.println("====================================================");

        for(int i=0; i < array01.length; i++ ){
                System.out.println("Elemento "+ i + ": "+ array01[1]);
        }
        String[] array02 = new String[5];
        array02[0] = "Davi";
        array02[1] = "Edicledisson";
        array02[2] = "Welington";
        array02[3] = "Ramon dino";
        array02[4] = "Sabrina barata";
        System.out.println("====================================================");
        String[] array03 = {"Poá", "Suzano", "Ferraz","Itu"};
        System.out.println(array02[3]);

        for (int j = 0; j < array03.length; j++) {
            System.out.println("Elemento"+j+":"+array03[j]);
        }
        System.out.println("====================================================");

        int[] array04 = {1,2,3,4,5};
        System.out.println(Arrays.toString(array04));

        System.out.println("========copiando array========");

        int[] copia02 = array01.clone(); // ambas as formas clonam, porém a sintax é diferente
        int[] copia_array04 = array04;

        System.out.println("Copia: "+ Arrays.toString(copia02));
        System.out.println("Copia: "+ Arrays.toString(copia_array04));

        System.out.println("======== Organizando elementos ========");
        int[] nova_array = {5,6,4,2,3,1,0};
        Arrays.sort(nova_array);
        System.out.println("Ordena em: "+ Arrays.toString(nova_array));

        System.out.println("=== inserindo valores iguais em todas as posições ===");

        int[] array_vazia = new int[5];
        Arrays.fill(array_vazia,10);
        System.out.println(":"+ Arrays.toString(array_vazia));

        System.out.println("=== comparando arrays ===");

        boolean resp = Arrays.equals(array04, copia_array04);
        System.out.println("Os arrays são identicos: " + resp);
        if(Arrays.equals(array01, copia02)){
            System.out.println("Elas são iguais");
        }else{
            System.out.println("Elas são diferentes");
        }
        System.out.println("=== buscando elementos ===");
        int posição = Arrays.binarySearch(array02, "Sabrina barata");
        System.out.println("elemento foi localizado na posição: "+ posição);
    }
}
