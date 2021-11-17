import java.util.Comparator;

public class AnimalComparator implements Comparator<Animal> {

    private String direction;
    private String sortBy;

    @Override
    public int compare(Animal o1, Animal o2) {

        int result;

        switch(sortBy){
            case "age":
                result = Integer.compare(o1.getAge(), o2.getAge());
                break;
            case "name":
                result = o1.getName().compareToIgnoreCase(o2.getName());
                break;
            case "type":
                result = o1.getType().compareToIgnoreCase(o2.getType());
                break;
            default:
                result = 0;
        };

        if(direction.equals("DESC")){
            result *= -1;
        }
        return result;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }
    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }
}
