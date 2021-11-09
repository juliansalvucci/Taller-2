public class app {
    public static void main(String[] args) 
    {
       List<Integer> miLista = CrearColeccionArrayList(); 
       
       miLista.add(10);

       for(Integer integer : miLista){
           System.out.printLn(integer + 20)
       }
    }


    public static ArrayList CrearColeccionArrayList()
    {
        return new ArrayList<Integer>();
    }

}
