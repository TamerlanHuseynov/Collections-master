package random_practice.random_garbage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Tests {
    public static void main(String[] args) {

       String[] pew = {" whyy ", " pew ", " scrub      ", " whaty ", " Jamal "};
//        List<String> result = Arrays.stream(pew)
//                .map(e -> e+="y")
//                .filter(e -> !e.contains("yy"))
//                .collect(Collectors.toList());
//        System.out.println(result);
        List<String> gointToBarberer = new ArrayList<>(Arrays.asList(pew));
        System.out.println(newbiewBarberer(gointToBarberer));

//        List<String> shavedList = gointToBarberer.stream().map(String::trim).collect(Collectors.toList() );
//
//        System.out.println(shavedList);
    }

    public static List<String> barberer(List<String> gottaShave){
        if(gottaShave.size() == 0) return null;
        return gottaShave.stream().map(String::trim).collect(Collectors.toList() );
    }

    public static List<String> newbiewBarberer(List<String> toBeTrimmed){
        if(toBeTrimmed.size() == 0) return null;
        List<String> result = new ArrayList<>(toBeTrimmed.size());
        for(int i = 0; i< toBeTrimmed.size(); i++){
            result.add(toBeTrimmed.get(i).trim());
        }
        return result;
    }


}