package Simulador;
 
import java.util.Map;
import java.util.TreeMap;

public class Quantum {

         
    public static void main(String[] args) {
         
        int guantum = 1000;
        int contador = 0;
         TreeMap<Integer,Integer> anda = new TreeMap<Integer,Integer>(); 
        TreeMap<Integer,Integer> rrtemp = new TreeMap<Integer,Integer>(); 
 
        anda.put(1,53);
        anda.put(2,20);
        anda.put(3,15);
        anda.put(4,10);
        anda.put(5,53);
        
        System.out.println("Procesos con ms"+anda);
        System.out.println("No. procesos activos "+anda.size());
                  while(anda.isEmpty() !=true){
                 
                for(int i=1;i<=anda.size();i++){
                    int menosqua = 0;
                    contador = guantum;

                    menosqua = anda.get(i);
                    while(contador !=0)
                    {
                        if(menosqua !=0 && menosqua >=0)
                       {    
                             anda.put(i, menosqua);
                             System.out.println("->No. proceso "+i+" iniciado "+anda.get(i)+" ms");
                             try {
                                    Thread.sleep(anda.get(i)*10);
                                 } catch(InterruptedException ex) {
                                    Thread.currentThread().interrupt();
                                    }
 
                        }else{
                                if(menosqua==0)
                                {
                                    System.out.println("=======>No. proceso "+i+" terminado "+anda.get(i)+" ms");
                                    anda.remove(i);

                                    int sumador=0; 
                                    for (Map.Entry entry : anda.entrySet()) {
                                    sumador++;    
                                   
                                    int entrada = Integer.parseInt(entry.getValue().toString());
                                    rrtemp.put(sumador, entrada);
                                    }
                                    anda.clear();

                                    for(int j=1;j<=rrtemp.size();j++)
                                    {
                                        anda.put(j, rrtemp.get(j));
                                    }
                                rrtemp.clear();

                                }
                             }
                        menosqua--;
                        contador--;
                    }
                }
            }
         System.out.println("Tiempo "+anda+" ms.");
         System.out.println("No. procesos "+anda.size());
  
    }
}