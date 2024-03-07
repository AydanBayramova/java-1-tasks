package module01.Practice.Enum;

public class EnumApp {
    public static void main(String[] args) {
        fields field1=fields.FINISHED;
        switch (field1){
            case SHIPHED:
            System.out.println("prepared property");
            break;
            case FINISHED : System.out.println("stock is finished please wait");
            break;
            case PREPARED:
                System.out.println("properties are prepared");
        }
        fields[] number=fields.values();
        for (fields numbers:number) {
            System.out.println(numbers );
        }

    }

}
