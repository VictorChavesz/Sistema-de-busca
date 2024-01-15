package trabalhoProgramacao;
import java.util.Scanner;

public class SistemaDeBusca {
    public static void preencherVetor(int vet[]){
        for(int i = 0 ; i < vet.length;i++){
            vet[i]=(int)(Math.random()*100);
        }
    }
    public static void exibirVetor(int vet[]){
        for(int i = 0 ; i < vet.length;i++){
            System.out.printf(" %d ", vet[i]);
        }
        System.out.println();
    }
    public static void ordenacaoPorSelecao(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int indiceMenor = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[indiceMenor]) {
                    indiceMenor = j;
                }
            }
            int temp = array[indiceMenor];
            array[indiceMenor] = array[i];
            array[i] = temp;
        }
    }
    public static void buscaBinaria(int vetor[],int valor){
        int inicio = 0;
        int fim =  vetor.length-1;
        int posicao = -1;
        int contagem = 0;
        while (inicio<=fim) {
            int meio = (inicio+fim)/2;
            contagem++;
            if(vetor[meio] == valor){
                posicao = meio;
                break;
            }else if(vetor[meio] < valor){
                inicio = meio + 1;
            }
            else if(vetor[meio] > valor){
                fim = meio - 1;
            }
        }if(posicao==-1){
                System.out.println("___________________________________");
                System.out.println("Valor não encontrado no vetor. X_X");
                System.out.println("___________________________________");
        }else{
        System.out.println("_________________________________________");
        System.out.println("a posicao é " + posicao);
        System.out.println("a quantidade de comparaceos foi " + contagem);
        System.out.println("_________________________________________");
        }
    }   
   
    public static void buscaSequencial(int vetor[], int valor) {
        int posicao = -1;
        int contagem = 0;
    
        for (int i = 0; i < vetor.length; i++) {
            contagem++;
            if (valor == vetor[i]) {
                posicao = i;
                break;
            }
        }
    
        if (posicao != -1) {
            System.out.println("_________________________________________");
            System.out.println("A posição é " + posicao);
            System.err.println("A quantidade de comparações é " + contagem);
            System.out.println("_________________________________________");
        } else {
            System.out.println("___________________________________");
            System.out.println("Valor não encontrado no vetor. X_X");
            System.out.println("___________________________________");
        }
    }   
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int escolha;
        int escolha1;
        int tamanho;
        int vet[] = null;
        boolean tamanhoV = false;
        boolean preencherVetorV = false;
        int valor;

        do{
            System.out.println(" _____________________ ");
            System.out.println("|     Menu Pricipal   |");
            System.out.println("|  1-Preencher vetor  |");
            System.out.println("|  2-Busca Sequencial |");
            System.out.println("|  3-Busca Binaria    |");
            System.out.println("|  4-Exibir vetor     |");
            System.out.println("|  0-Sair             |");
            System.out.println(" _____________________ ");
            escolha=ler.nextInt();
            if(escolha == 1 && tamanhoV==true && preencherVetorV == true){
                System.out.println("____________________");
                System.out.println("Já fez isso mané ^_^");
                System.out.println("____________________");
            }else if(escolha==1){
                while (preencherVetorV == false || tamanhoV == false) {
                System.out.println("_____________________________"); 
                System.out.println("1-Informar o tamanho do vetor");
                System.out.println("2-Preencher o vetor          ");
                System.out.println("_____________________________");
                escolha1 = ler.nextInt();
                    if(escolha1==1){
                    System.out.println("__________________________");
                    System.out.println("Escolha o tamanho do vetor");
                    tamanho = ler.nextInt(); 
                    tamanhoV = true;
                    vet = new int[tamanho];
                    }else if(escolha1==2 && tamanhoV==false){
                        System.out.println("|______________________________________________________|");
                        System.out.println("|Tamanho não encontrado X_X, informe o tamanho do vetor|");
                        tamanho = ler.nextInt();
                        tamanhoV = true;
                        vet = new int[tamanho];
                    }else if(escolha1==2){
                        preencherVetor(vet);
                        preencherVetorV = true;
                        ordenacaoPorSelecao(vet);
                    }
                }
            }else if(escolha == 2 && vet==null || escolha == 3 && vet == null || escolha == 4 && vet == null){
                System.out.println(" ______________________________________________________________________________________________________________________");
                System.out.println("|                                                Vetor não preenchido                                                  |");
                System.out.println("|                                                Auto destruição em...                                                 |");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("|                                                       3                                                              |");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("|                                                       2                                                              |");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("|                                                       1                                                              |");
                System.out.println(" ______________________________________________________________________________________________________________________");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(  "                                               _.-^^---....,,--\r\n" + //                                             
                                     "                                           _--                  --_\r\n" + //
                                     "                                          <                        >)\r\n" + //
                                     "                                          |                         |\r\n" + //
                                     "                                            \\._                   _./\r\n" + //
                                     "                                                ```--. . , ; .--'''\r\n" + //
                                     "                                                     | |   |\r\n" + //
                                     "                                                   .-||  | |=-.\r\n" + //
                                     "                                                  `-=#$%&%$#=-'\r\n" + //
                                     "                                                     | ;  :|\r\n" + //
                                     "                                             _____.,-#%&$@%#&#~,._____");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                 System.out.println(" _____________________________________________________________________________________________________________________");
                System.out.println("|Brincadeirinha,escolha a opção de preencher o vetor e conclua todos os passos antes de realizar a busca e a exibição;)|");
                System.out.println(" ______________________________________________________________________________________________________________________");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else if(escolha==2){
                System.out.println(" _______________________________________");
                System.out.println("|Informe o valor que voce quer encontrar|");
                System.out.println(" _______________________________________");
                valor = ler.nextInt();
                buscaSequencial(vet, valor);
            }else if(escolha==3){
                System.out.println(" ______________________________________");
                System.out.println("|Informe o valor que voce quer encontrar|");
                System.out.println(" ______________________________________");
                valor = ler.nextInt();
                buscaBinaria(vet, valor);
            }else if(escolha==4){
                System.out.println("_________________________________________");
                exibirVetor(vet);
                System.out.println("_________________________________________");
            }
        while(escolha < 0 || escolha > 4 ){
            System.out.println("valor invalido x_x");
            System.out.println("Informe um valor de 0 a 4");
            escolha = ler.nextInt();
        }
      }while(escolha != 0);
      System.out.println("________________________________________");
      System.err.println("Menu encerrado Graças ao meu bom pai *O*");
      System.out.println("________________________________________");
      ler.close();
    } 
}