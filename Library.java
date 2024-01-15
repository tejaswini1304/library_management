package OOADlogic;
import java.util.ArrayList;

public class Library {
    private ArrayList<Member> members = new ArrayList<>();
    private ArrayList<ReadingMaterial> material = new ArrayList<>();

    public ArrayList<Member> getMembers() {
        return members;
    }
    public void setMembers(ArrayList<Member> members) {
        this.members = members;
    }
    public ArrayList<ReadingMaterial> getMaterial() {
        return material;
    }
    public void setMaterial(ArrayList<ReadingMaterial> material) {
        this.material = material;
    }

    public void addMaterial(ReadingMaterial obj){
        material.add(obj);
    }

    public void addMember(Member member){
        members.add(member);
    }

    public void checkOut(Member m, ReadingMaterial obj){
        if(m.getMemberMaterialList().size() < 4){
            m.issueBook(obj);
            if(obj instanceof Book){
                material.remove(obj);;
            }
            if(obj instanceof CD){
                material.remove(obj);
            }
            if(obj instanceof Magzine){
                material.remove(obj);
            }
        }
    }

    public void checkIn(Member m, ReadingMaterial obj){
        m.returnBook(obj);
        if(obj instanceof Book){
            material.add(obj);
        }
        if(obj instanceof CD){
            material.add(obj);
        }
        if(obj instanceof Magzine){
            material.add(obj);
        }
    }

    public void displayBook(ReadingMaterial i){
            System.out.println("TITLE : "+i.getTitle());
            System.out.println("PRICE : "+i.getPrice());
            System.out.println("ISBN NO. : "+((Book) i).getIsbn());
    }

    public void displayCD(ReadingMaterial i){
            System.out.println("TITLE : "+i.getTitle());
            System.out.println("PRICE : "+i.getPrice());
            System.out.println("DURATION : "+((CD) i).getDurationInMinutes());
    }

    public void displayMagzine(ReadingMaterial i){
            System.out.println("TITLE : "+i.getTitle());
            System.out.println("PRICE : "+i.getPrice());
            System.out.println("MONTH OF ISSUE : "+((Magzine)i).getMonthOfIssue());
    }

    public void display(){
        System.out.println("READING MATERIAL IN LIBRARY : ");
        for(ReadingMaterial obj : material){
            if(obj instanceof Book){
                displayBook(obj);
                System.out.println();
            }
            if(obj instanceof CD){
                displayCD(obj);
                System.out.println();
            }
            if(obj instanceof Magzine){
                displayMagzine(obj);
                System.out.println();
            }
        }
    }

    public boolean materialFind(ReadingMaterial obj){
        if (material.contains(obj)) {
            if(obj instanceof Book){
                displayBook(obj);
                System.out.println();
            }
            if(obj instanceof CD){
                displayCD(obj);
                System.out.println();
            }
            if(obj instanceof Magzine){
                displayMagzine(obj);
                System.out.println();
            }
            return true;
        }
        return false;
    }
}
