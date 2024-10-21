/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hekimcanaktas
 */
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
            int nFaktoriyel=1,rFaktoriyel=1;
int kombinasyonSonucu; 
        Scanner scanner = new Scanner(System.in);
        System.out.println("C(n,r) için n yi giriniz" );
        int n = scanner.nextInt();
        
          System.out.println("C(n,r) için r yi giriniz" );
        int r = scanner.nextInt();
        
        for(int i=1 ;i<=n;i++){
         nFaktoriyel *=i;
    }
        for(int i =1;i<=r;i++){
        rFaktoriyel *=i;
    }
        
     kombinasyonSonucu = nFaktoriyel/(rFaktoriyel*(n-r));  
        
     
        System.out.println("Kombinsyon sonucu: " + kombinasyonSonucu);
    }
}
