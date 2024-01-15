package OOADlogic;

import java.util.ArrayList;

public class Member {
    private String name;
    private ArrayList<ReadingMaterial> memberMaterialList = new ArrayList<>();

    public Member(String name){
        this.name = name;
    }
    public ArrayList<ReadingMaterial> getMembers() {
        return memberMaterialList;
    }
    public String getName() {
        return name;
    }
    public ArrayList<ReadingMaterial> getMemberMaterialList() {
        return memberMaterialList;
    }

    public void issueBook(ReadingMaterial obj){
        memberMaterialList.add(obj);
    }

    public void returnBook(ReadingMaterial obj){
        memberMaterialList.remove(obj);
    }

    public void displayMemberMaterialList(){
        System.out.println("NAME : "+name);
        for(ReadingMaterial i : memberMaterialList){
            System.out.println("TITLE : "+i.getTitle());
            System.out.println("PRICE : "+i.getPrice());
            if(i instanceof Book){
                System.out.println("ISBN NO. : "+(((Book) i).getIsbn()));
            }
            if(i instanceof CD){
                System.out.println("ISBN NO. : "+(((CD) i).getDurationInMinutes()));
            }
            if(i instanceof Magzine){
                System.out.println("ISBN NO. : "+(((Magzine) i).getMonthOfIssue()));
            }
        }
    }
}
