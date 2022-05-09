package VariousStructures.oneOnOne;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class ListComparison {
    public static void main(String[] args) {
        int[] number = new int[]{1, 52, 56, 15, 2, 4, 95, 63, 48, 25, 68, 79, 20, 34, 96, 66, 32, 91, 87};
        System.out.println(number.length);

        List<TeamMate> teamList = new ArrayList<>();
        TeamMate teamMate = new TeamMate(1, "Linda", "Dav", "F", true);
        TeamMate teamMate2 = new TeamMate(2, "Bintu", "Ali", "F", true);
        TeamMate teamMate3 = new TeamMate(3, "Godfred", "Asa", "M", true);
        TeamMate teamMate4 = new TeamMate(4, "Isaac", "Man", "M", true);

        teamList.add(teamMate);
        teamList.add(teamMate2);
        teamList.add(teamMate3);
        teamList.add(teamMate4);

        teamList.stream()
                .filter(c -> !c.getFirstname().equals("Linda"))
                .forEach(System.out::println);

        

//        Iterator<TeamMate> it = teamList.iterator();
//        while (it.hasNext()) {
//            String name = it.next().getFirstname();
//            System.out.println(name);
//        }


        //rewinding iterator using te same iterator
//        it = teamList.iterator();
//        while (it.hasNext()) {
//           String name = it.next().getFirstname();
//            if (it.next().getFirstname().equals("Linda"))
//                teamList.remove(name);
//            System.out.println(teamList);
//        }


    }
}
